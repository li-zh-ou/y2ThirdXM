package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.parser.JSONParser;

import com.accp.domain.Kehu;
import com.accp.domain.Kehucar;
import com.accp.service.KehuinfoService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ExcelController {
	@Autowired
	KehuinfoService ser;
	
	@PostMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String chak,String chac,String name) throws IOException{	
		ObjectMapper mapper = new ObjectMapper();
		List<Kehu> list=ser.QueryKehu();
		if(name=="") {
			if(chak==null && chac==null) {
				list=ser.QueryKehu();
				
			}else if(chak!=null && chac==null){
				Kehu k = mapper.readValue(chak, Kehu.class);
				list=ser.duotiaojianchakehu(k);
			}else if(chak!=null && chac!=null) {
				Kehu k = mapper.readValue(chak, Kehu.class);
				Kehucar car=mapper.readValue(chac, Kehucar.class);
				list=ser.duotiaojianchakehu(k);
				List<Kehucar> cr=ser.duotiaojianchacar(car);
				if(list.size()==0) {
					return null;
				}else if(list.size()!=0 && cr.size()!=0) {
					List<Kehu> ke=ser.querybykehub(cr.get(0).getKehuno());
					list=ke;
				}else if(list.size()!=0 && cr.size()==0) {
					List<Kehu> ke=ser.querybykehub(chak);
					list=ke;
				}
			}
		}else {
			list =ser.querymokehu(name, name);
			if(list.size()==0) {
				List<Kehucar> cr=ser.querymokehucar(name);
				List<Kehu> ke=ser.querybykehub(cr.get(0).getKehuno());
				list=ke;
			}
		}
		
		Workbook wb = new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		DataFormat format= wb.createDataFormat();
        cellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
		Sheet sheet = wb.createSheet("客户数据");
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("客户编码");
		titleRow.createCell(1).setCellValue("客户名称");
		titleRow.createCell(2).setCellValue("详细地址");
		titleRow.createCell(3).setCellValue("联系人");
		titleRow.createCell(4).setCellValue("手机");
		titleRow.createCell(5).setCellValue("客户生日");
		titleRow.createCell(6).setCellValue("客户类别");
		titleRow.createCell(7).setCellValue("会员卡号");
		titleRow.createCell(8).setCellValue("入会日期");
		titleRow.createCell(9).setCellValue("会员到期");
		titleRow.createCell(10).setCellValue("备注");
		titleRow.createCell(11).setCellValue("建档日期");
		titleRow.createCell(12).setCellValue("服务顾问");
		titleRow.createCell(13).setCellValue("顾问电话");
		titleRow.createCell(14).setCellValue("账期(天)");
		titleRow.createCell(15).setCellValue("挂账额度");
		titleRow.createCell(16).setCellValue("累计积分");
		titleRow.createCell(17).setCellValue("订金余额");
		titleRow.createCell(18).setCellValue("注册电话");
		titleRow.createCell(19).setCellValue("开户银行");
		titleRow.createCell(20).setCellValue("银行账号");
		titleRow.createCell(21).setCellValue("注册地址");
		titleRow.createCell(22).setCellValue("其他一");
		titleRow.createCell(23).setCellValue("其他二");
		for(int i=0;i<list.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell kehuno = row.createCell(0);
			Cell kehuname = row.createCell(1);
			Cell kehuaddress = row.createCell(2);
			Cell kehulianxi = row.createCell(3);
			Cell kehuphone = row.createCell(4);
			Cell kehubirthday = row.createCell(5);
			Cell kehutype = row.createCell(6);
			Cell huiyuanno = row.createCell(7);
			Cell ruhuitime = row.createCell(8);
			Cell daoqitime = row.createCell(9);
			Cell remark = row.createCell(10);
			Cell bei1 = row.createCell(11);
			Cell guwen = row.createCell(12);
			Cell guwenphone = row.createCell(13);
			Cell zhangqi = row.createCell(14);
			Cell edu = row.createCell(15);
			Cell jifen = row.createCell(16);
			Cell dinjin = row.createCell(17);
			Cell zhuphone = row.createCell(18);
			Cell bank = row.createCell(19);
			Cell bankcard = row.createCell(20);
			Cell zhuaddress = row.createCell(21);
			Cell bei2 = row.createCell(22);
			Cell bei3 = row.createCell(23);
			kehuno.setCellValue(list.get(i).getKehuno());
			kehuname.setCellValue(list.get(i).getKehuname());
			kehuaddress.setCellValue(list.get(i).getKehuaddress());
			kehulianxi.setCellValue(list.get(i).getKehulianxi());
			kehuphone.setCellValue(list.get(i).getKehuphone());
			kehubirthday.setCellStyle(cellStyle);
			kehubirthday.setCellValue(list.get(i).getKehubirthday());
			kehutype.setCellValue(list.get(i).getKehutype());
			huiyuanno.setCellValue(list.get(i).getHuiyuanno());
			ruhuitime.setCellStyle(cellStyle);
			daoqitime.setCellStyle(cellStyle);
			ruhuitime.setCellValue(list.get(i).getRuhuitime());
			daoqitime.setCellValue(list.get(i).getDaoqitime());
			remark.setCellValue(list.get(i).getRemark());
			bei1.setCellValue(list.get(i).getBei1());
			guwen.setCellValue(list.get(i).getGuwen());
			guwenphone.setCellValue(list.get(i).getGuwenphone());
			zhangqi.setCellValue(list.get(i).getZhangqi());
			edu.setCellValue(list.get(i).getEdu());
			jifen.setCellValue(list.get(i).getJifen());
			dinjin.setCellValue(list.get(i).getDinjin());
			zhuphone.setCellValue(list.get(i).getZhuphone());
			bank.setCellValue(list.get(i).getBank());
			bankcard.setCellValue(list.get(i).getBankcard());
			zhuaddress.setCellValue(list.get(i).getZhuaddress());
			bei2.setCellValue(list.get(i).getBei2());
			bei3.setCellValue(list.get(i).getBei3());
		}
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		wb.write(baos);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment", new String("客户数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	@PostMapping("/exportExcelcar")
	public ResponseEntity<byte []> exportExcelcar(String chak,String chac,String name) throws IOException{	
		ObjectMapper mapper = new ObjectMapper();
		List<Kehucar> list=ser.querykehucar();
		if(name=="") {
			if(chak==null && chac==null) {
				list=ser.querykehucar();
				
			}else if(chak!=null && chac==null){
				Kehu k = mapper.readValue(chak, Kehu.class);
				List<Kehu> ke=ser.duotiaojianchakehu(k);
				list=ser.QueryBykehuno(ke.get(0).getKehuno());
			}else if(chak!=null && chac!=null) {
				Kehu k = mapper.readValue(chak, Kehu.class);
				Kehucar car=mapper.readValue(chac, Kehucar.class);
				List<Kehucar> list1=ser.duotiaojianchacar(car);
				List<Kehu> cr=ser.duotiaojianchakehu(k);
				if(list1.size()==0) {
					return null;
				}else if(list1.size()==0 && cr.size()!=0) {
					list=ser.duotiaojianchacar(car);
				}else if(list1.size()!=0 && cr.size()!=0){
					List<Kehu> ke=ser.querybykehub(list1.get(0).getKehuno());
					list=ser.QueryBykehuno(ke.get(0).getKehuno());
				}
			}else if(chak==null && chac!=null) {
				Kehucar car=mapper.readValue(chac, Kehucar.class);
				list=ser.duotiaojianchacar(car);
			}
		}else {
			list =ser.querymokehucar(name);
			if(list.size()==0) {
				List<Kehu> cr=ser.querymokehu(name,name);
				List<Kehucar> ke=ser.QueryBykehuno(cr.get(0).getKehuno());
				list=ke;
			}
		}
		
		Workbook wb = new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		DataFormat format= wb.createDataFormat();
        cellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
		Sheet sheet = wb.createSheet("车辆数据");
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("车牌号码");
		titleRow.createCell(1).setCellValue("车牌品牌");
		titleRow.createCell(2).setCellValue("车牌型号");
		titleRow.createCell(3).setCellValue("驾驶员");
		titleRow.createCell(4).setCellValue("驾驶员电话");
		titleRow.createCell(5).setCellValue("出生日期");
		titleRow.createCell(6).setCellValue("车辆归属");
		titleRow.createCell(7).setCellValue("驾证到期");
		titleRow.createCell(8).setCellValue("车架号");
		titleRow.createCell(9).setCellValue("发动机号");
		titleRow.createCell(10).setCellValue("发动机品牌号");
		titleRow.createCell(11).setCellValue("车辆年款");
		titleRow.createCell(12).setCellValue("里程");
		titleRow.createCell(13).setCellValue("载重");
		titleRow.createCell(14).setCellValue("购买日期");
		titleRow.createCell(15).setCellValue("上牌日期");
		titleRow.createCell(16).setCellValue("车险到期");
		titleRow.createCell(17).setCellValue("在我投保车");
		titleRow.createCell(18).setCellValue("燃油类别");
		titleRow.createCell(19).setCellValue("下次保养里程");
		titleRow.createCell(20).setCellValue("下次保养日期");
		for(int i=0;i<list.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell chepai = row.createCell(0);
			Cell carbankname = row.createCell(1);
			Cell xinghao = row.createCell(2);
			Cell sijiname = row.createCell(3);
			Cell sijiphone = row.createCell(4);
			Cell sijibirthday = row.createCell(5);
			Cell guishu = row.createCell(6);
			Cell jiazhao = row.createCell(7);
			Cell chejia = row.createCell(8);
			Cell fanumber = row.createCell(9);
			Cell faname = row.createCell(10);
			Cell niankuan = row.createCell(11);
			Cell licheng = row.createCell(12);
			Cell zaizhong = row.createCell(13);
			Cell goumaidate = row.createCell(14);
			Cell shangpaidate = row.createCell(15);
			Cell chejian = row.createCell(16);
			Cell bei1 = row.createCell(17);
			Cell ranyou = row.createCell(18);
			Cell nextbaoxian = row.createCell(19);
			Cell nextbaoxiandate = row.createCell(20);
			chepai.setCellValue(list.get(i).getChepai());
			carbankname.setCellValue(list.get(i).getCarbankname());
			xinghao.setCellValue(list.get(i).getXinghao());
			sijiname.setCellValue(list.get(i).getSijiname());
			sijiphone.setCellValue(list.get(i).getSijiphone());
			sijibirthday.setCellStyle(cellStyle);
			sijibirthday.setCellValue(list.get(i).getSijibirthday());
			guishu.setCellValue(list.get(i).getGuishu());
			jiazhao.setCellValue(list.get(i).getJiazhao());
			chejia.setCellValue(list.get(i).getChejia());
			fanumber.setCellValue(list.get(i).getFanumber());
			faname.setCellValue(list.get(i).getFaname());
			niankuan.setCellValue(list.get(i).getNiankuan());
			licheng.setCellValue(list.get(i).getLicheng());
			zaizhong.setCellValue(list.get(i).getZaizhong());
			goumaidate.setCellStyle(cellStyle);
			goumaidate.setCellValue(list.get(i).getGoumaidate());
			shangpaidate.setCellStyle(cellStyle);
			shangpaidate.setCellValue(list.get(i).getShanpaidate());
			chejian.setCellValue(list.get(i).getChejian());
			bei1.setCellValue(list.get(i).getBei1());
			ranyou.setCellValue(list.get(i).getRanyou());
			nextbaoxian.setCellValue(list.get(i).getNextbaoxian());
			nextbaoxiandate.setCellStyle(cellStyle);
			nextbaoxiandate.setCellValue(list.get(i).getNextbaoxiandate());
		}
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		wb.write(baos);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment", new String("车辆数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
}
