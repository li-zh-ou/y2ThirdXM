package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Kehu;
import com.accp.domain.Kehucar;
import com.accp.service.KehuinfoService;

@RestController
public class KehuinfoController {
	
	@Autowired
	KehuinfoService ser;
	
	@GetMapping("/querykehu")
	public List<Kehu> QueryKehu(){
		return ser.QueryKehu();
	}
	@GetMapping("/querymokehu")
	public List<Kehu> querymokehu(String kehuno,String kehuphone){
		return ser.querymokehu(kehuno,kehuphone);
	}
	@GetMapping("/querybykehub")
	public List<Kehu> querybykehub(String kehuno){
		return ser.querybykehub(kehuno);
	}
	@GetMapping("/querymokehucar")
	public List<Kehucar> querymokehucar(String chepai){
		return ser.querymokehucar(chepai);
	}
	@GetMapping("/querybykehuno")
	public List<Kehucar> QueryBykehuno(String kehuno){
		System.out.println(kehuno);
		return ser.QueryBykehuno(kehuno);
	}
	
	@PostMapping("/AddKehu")
	public int AddKehu(@RequestBody Kehu kehu) {
		return ser.AddKehu(kehu);
	}
	
	@PostMapping("/UpdateKehu")
	public int UpdateKehu(@RequestBody Kehu kehu) {
		return ser.UpdateKehu(kehu);
	}
	
	@GetMapping("/DeleteKehu")
	public int DeleteKehu(String kehuno) {
		return ser.DeleteKehu(kehuno);
	}
	
	@PostMapping("/duochakehu")
	public List<Kehu> duotiaojianchakehu(@RequestBody Kehu kehu){
		return ser.duotiaojianchakehu(kehu);
	}
	@PostMapping("/duochacar")
	public List<Kehucar> duotiaojianchacar(@RequestBody Kehucar kehucar){
		return ser.duotiaojianchacar(kehucar);
	}
}
