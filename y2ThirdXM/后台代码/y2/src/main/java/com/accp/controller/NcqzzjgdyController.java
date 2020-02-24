package com.accp.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bumen;
import com.accp.domain.Gangwei;
import com.accp.domain.Jigong;
import com.accp.domain.Jigongban;
import com.accp.domain.Jigongstar;
import com.accp.domain.Lizhi;
import com.accp.domain.Waiqingcar;
import com.accp.domain.Yuangong;
import com.accp.domain.Yuangongshu;
import com.accp.domain.Zhiwu;
import com.accp.service.NcqzzjgdyService;

@RestController
@RequestMapping("/ncq")
public class NcqzzjgdyController {

	@Autowired
	NcqzzjgdyService ncqzzjgdyService;

	// 组织机构树状图查询
	@GetMapping("/querybm")
	public List<Bumen> querybm() {
		return ncqzzjgdyService.querybm();
	}

	// 组织机构员工详情查询
	@GetMapping("/ygcx")
	public List<Yuangong> ygcx() {
		return ncqzzjgdyService.ygcx();
	}

	// 组织机构置空密码
	@PostMapping("/zkmm")
	public int zkmm(String yuanno) {
		return ncqzzjgdyService.zkmm(yuanno);
	}

	// 组织机构查询员工岗位
	@GetMapping("/cxyggw")
	public List<Gangwei> cxyggw() {
		return ncqzzjgdyService.querygw();
	}

	// 组织机构生成员工编号
	@GetMapping("/sjygbh")
	public String newCno() {
		String cno = "";
		Yuangong c = ncqzzjgdyService.newCno();
		Integer no = null;
		if (c != null) {
			no = Integer.valueOf(c.getYuanno().substring(8)) + 1;
		}

		Calendar cal = Calendar.getInstance();
		Integer year = cal.get(cal.YEAR);

		if (c == null) {
			// 当天没有则编号为年月日+001
			cno = "ygb" + year.toString() + "001";
		} else {
			if (no.toString().length() == 1) {
				// 0~9
				cno = "ygb" + year.toString() + "00" + no.toString();
			} else if (no.toString().length() == 2) {
				// 10~99
				cno = "ygb" + year.toString() + "0" + no.toString();
			} else if (no.toString().length() > 2) {
				// 大于等于100
				cno = "ygb" + year.toString() + no.toString();
			}
		}
		return cno;
	}

	// 组织机构查询员工属性
	@GetMapping("/cxygsx")
	public List<Yuangongshu> cxygsx() {
		return ncqzzjgdyService.cxygsx();
	}

	// 组织机构新增员工
	@PostMapping("/zzjgxzyg")
	public int zzjgxzyg(Yuangong yuangong) {
		return ncqzzjgdyService.zzjgxzyg(yuangong);
	}

	// 组织机构修改员工查询
	@GetMapping("/byupygff")
	public Yuangong byupygff(String yuanno) {
		return ncqzzjgdyService.byupygff(yuanno);
	}

	// 组织机构修改员工
	@PostMapping("/upygxq")
	public int upygxq(Yuangong yuangong) {
		return ncqzzjgdyService.upygxq(yuangong);
	}

	// 组织机构查询角色
	@GetMapping("/zzjgcxjs")
	public List<Zhiwu> zzjgcxjs() {
		return ncqzzjgdyService.zzjgcxjs();
	}

	// 组织机构赋予员工角色
	@PostMapping("/fujs")
	public int fujs(String zhiwuid, String yuanno) {
		return ncqzzjgdyService.fujs(zhiwuid, yuanno);
	}

	// 组织机构赋删除员工
	@PostMapping("/xglzzt")
	public int xglzzt(String yuanno) {
		return ncqzzjgdyService.xglzzt(yuanno);
	}

	// 组织机构点击树状图获取部门在根据部门id查询员工详情
	@GetMapping("/gjbmcxyg")
	public List<Yuangong> gjbmcxyg(Integer bumenid) {
		return ncqzzjgdyService.gjbmcxyg(bumenid);
	}
	
	// 组织机构新增部门
	@PostMapping("/xzbm")
	public int xzbm(String bumenname, Integer parentid) {
		return ncqzzjgdyService.xzbm(bumenname, parentid);
	}

	// 岗位定义查询
	@GetMapping("/querygw")
	public List<Gangwei> querygw() {
		return ncqzzjgdyService.querygw();
	}

	// 岗位定义新增岗位
	@PostMapping("/insertgw")
	public int insertgw(Gangwei gangwei) {
		return ncqzzjgdyService.insertgw(gangwei);
	}

	// 岗位定义删除岗位
	@GetMapping("/delByIdgw")
	public int delByIdgw(Integer gangweid) {
		return ncqzzjgdyService.delByIdgw(gangweid);
	}

	// 岗位定义修改岗位
	@PostMapping("/upgw")
	public int upgw(Integer gangweid, String gangweiname) {
		return ncqzzjgdyService.upgw(gangweid, gangweiname);
	}

	// 通讯名录详情
	@GetMapping("/cxtxmlxq")
	public List<Yuangong> cxtxmlxq() {
		return ncqzzjgdyService.cxtxmlxq();
	}

	// 通讯名录修改
	@PostMapping("/uptxml")
	public int uptxml(@RequestBody List<Yuangong> yuangong) {
		System.out.println(yuangong.get(0));
		return ncqzzjgdyService.uptxml(yuangong);
	}

	// 离职登记获取初始数据
	@GetMapping("/querycssj")
	public List<Yuangong> querycssj() {
		return ncqzzjgdyService.querycssj();
	}

	// 离职登记打开
	@GetMapping("/lzdjdk")
	public Yuangong lzdjdk(String yuanno) {
		return ncqzzjgdyService.lzdjdk(yuanno);
	}

	// 离职登记回滚
	@PostMapping("/lzdjhg")
	public int lzdjhg(String yuanno) {
		return ncqzzjgdyService.lzdjhg(yuanno);
	}

	// 离职登记员工离职
	@PostMapping("/insertlzxq")
	public int insertlzxq(@RequestBody Lizhi lizhi) {
		return ncqzzjgdyService.insertlzxq(lizhi);
	}

	// 离职登记删除离职员工数据
	@PostMapping("/sclzygsj")
	public int sclzygsj(String yuanno) {
		return ncqzzjgdyService.sclzygsj(yuanno);
	}

	// 技工星级获取技工星级
	@GetMapping("/queryjgxj")
	public List<Jigongstar> queryjgxj() {
		return ncqzzjgdyService.queryjgxj();
	}

	// 技工星级新增
	@PostMapping("/insertjgxj")
	public int insertjgxj(Jigongstar jigongstar) {
		return ncqzzjgdyService.insertjgxj(jigongstar);
	}

	// 技工星级修改
	@PostMapping("/upjgxj")
	public int upjgxj(Integer jistarid, String starname, String ticheng) {
		return ncqzzjgdyService.upjgxj(jistarid, starname, ticheng);
	}

	// 技工星级删除
	@PostMapping("/deljgxj")
	public int deljgxj(Integer jistarid) {
		return ncqzzjgdyService.deljgxj(jistarid);
	}

	// 外勤车辆获取
	@GetMapping("/querywqcl")
	public List<Waiqingcar> querywqcl() {
		return ncqzzjgdyService.querywqcl();
	}

	// 外勤车辆获取初始树状图数据
	@GetMapping("/querybzszt")
	public List<Jigongban> querybzszt() {
		return ncqzzjgdyService.querybzszt();
	}

	// 外勤车辆新增
	@PostMapping("/insertwcql")
	public int insertwcql(Waiqingcar waiqingcar) {
		return ncqzzjgdyService.insertwcql(waiqingcar);
	}

	// 修改外勤车辆
	@PostMapping("/upwqcl")
	public int upwqcl(String chepai, String carbank, String chexing, String nowli, Integer banid, String ids) {
		return ncqzzjgdyService.upwqcl(chepai, carbank, chexing, nowli, banid, ids);
	}

	// 删除外勤车辆
	@PostMapping("/delwqcl")
	public int delwqcl(String chepai) {
		return ncqzzjgdyService.delwqcl(chepai);
	}

	// 加载班组技工详情
	@GetMapping("/cxbzjgxq")
	public List<Jigong> cxbzjgxq() {
		return ncqzzjgdyService.cxbzjgxq();
	}

	// 班组技工生成技工编号
	@GetMapping("/jgscbhbh")
	public String newjigongno() {
		String jigongno = "";
		Jigong c = ncqzzjgdyService.newjigongno();
		Integer no = null;
		if (c != null) {
			no = Integer.valueOf(c.getJigongno().substring(8)) + 1;
		}

		Calendar cal = Calendar.getInstance();
		Integer year = cal.get(cal.YEAR);

		if (c == null) {
			// 当天没有则编号为年月日+001
			jigongno = "jgb" + year.toString() + "001";
		} else {
			if (no.toString().length() == 1) {
				// 0~9
				jigongno = "jgb" + year.toString() + "00" + no.toString();
			} else if (no.toString().length() == 2) {
				// 10~99
				jigongno = "jgb" + year.toString() + "0" + no.toString();
			} else if (no.toString().length() > 2) {
				// 大于等于100
				jigongno = "jgb" + year.toString() + no.toString();
			}
		}
		return jigongno;
	}

	// 班组技工新增技工
	@PostMapping("/xzjg")
	public int xzjg(Jigong jigong) {
		return ncqzzjgdyService.xzjg(jigong);
	}

	// 班组技工修改技工查询
	@GetMapping("/bzjgxgcx")
	public Jigong bzjgxgcx(String jigongno) {
		return ncqzzjgdyService.bzjgxgcx(jigongno);
	}

	// 班组技工修改技工
	@PostMapping("/upjgxg")
	public int upjgxg(Jigong jigong) {
		return ncqzzjgdyService.upjgxg(jigong);
	}

	// 班组技工删除技工
	@PostMapping("/deljg")
	public int deljg(String jigongno) {
		return ncqzzjgdyService.deljg(jigongno);
	}

	// 点击树状图获取班组在根据班组id查询技工详情
	@GetMapping("/djbzcxjg")
	public List<Jigong> djbzcxjg(Integer banid) {
		return ncqzzjgdyService.djbzcxjg(banid);
	}
	
	//班组技工新增班组
	@PostMapping("/xzbz")
	public int xzbz(String banname,Integer parentid){
		return ncqzzjgdyService.xzbz(banname,parentid);
	}
}
