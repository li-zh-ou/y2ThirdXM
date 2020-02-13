package com.accp.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bumen;
import com.accp.domain.Gangwei;
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
	@PostMapping("upygxq")
	public int upygxq(Yuangong yuangong) {
		return ncqzzjgdyService.upygxq(yuangong);
	}
	
	// 组织机构查询角色
	@GetMapping("zzjgcxjs")
	public List<Zhiwu> zzjgcxjs() {
		return ncqzzjgdyService.zzjgcxjs();
	}
	
	// 组织机构赋予员工角色
	@PostMapping("fujs")
	public int fujs(String zhiwuid, String yuanno) {
		return ncqzzjgdyService.fujs(zhiwuid, yuanno);
	}
	
	// 组织机构赋删除员工
	@PostMapping("xglzzt")
	public int xglzzt(String yuanno) {
		return ncqzzjgdyService.xglzzt(yuanno);
	}
	
	// 组织机构点击树状图获取部门在根据部门id查询员工详情
	@GetMapping("gjbmcxyg")
	public List<Yuangong> gjbmcxyg(Integer bumenid){
		return ncqzzjgdyService.gjbmcxyg(bumenid);
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
	public int upgw(Integer gangweid, String gangweiname, Integer ids) {
		return ncqzzjgdyService.upgw(gangweid, gangweiname, ids);
	}
	
	// 通讯名录详情
	@GetMapping("/cxtxmlxq")
	public List<Yuangong> cxtxmlxq(){
		return ncqzzjgdyService.cxtxmlxq();
	}

}
