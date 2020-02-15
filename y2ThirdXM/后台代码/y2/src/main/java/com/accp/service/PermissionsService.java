package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Permissions;
import com.accp.domain.RolesPerms;
import com.accp.domain.RolesPermsExample;
import com.accp.mapper.PermissionsMapper;
import com.accp.mapper.RolesPermsMapper;

@Service
@Transactional
public class PermissionsService {

	@Autowired
	PermissionsMapper permMapper;
	@Autowired
	RolesPermsMapper romapper;
	
	/**
	 * 根据用户编号获取所有权限内容,并且迭代递归成树形结构
	 * @param uid 用户编号
	 * @return	
	 */
	public List<Permissions> findEachByZhiwuId(String ZhiwuId){
		List<Permissions> lists = permMapper.findByZhiwuId(ZhiwuId);
		Permissions parentPerms = new Permissions();
		parentPerms.setPid(0);
		each(parentPerms, lists);
		return parentPerms.getChildrens();
	}
	public List<Permissions> findperm(){
		List<Permissions> lists = permMapper.selectByExample(null);
		Permissions parentPerms = new Permissions();
		parentPerms.setPid(0);
		eachp(parentPerms, lists);
		return parentPerms.getChildrens();
	}
	public List<Permissions> findperbu(String zhiwuid){
		List<Permissions> lists = permMapper.findByZhiwuId(zhiwuid);
		return lists;
	}
	public List<Permissions> findByzhiwuid(String ZhiwuId){
		List<Permissions> lists = permMapper.findByZhiwuId(ZhiwuId);
		return lists;
	}
	/**
	 * 根据用户编号获取所有权限内容,此方法没有级联
	 * @param uid 用户编号
	 * @return
	 */
	public List<Permissions> findByZhiwuId(String ZhiwuId){
		List<Permissions> lists = permMapper.findByZhiwuId(ZhiwuId);
		return lists;
	}
	
	public Permissions findById(Integer pid) {
		return permMapper.selectByPrimaryKey(pid);
	}
	
	/**
	 * 递归将权限变成树形结构
	 * @param parentPerms 上层对象
	 * @param perms 需要遍历的权限
	 */
	public void each(Permissions parentPerms,List<Permissions> perms){
		for(Permissions p : perms) {
			if(p.getParentid() == parentPerms.getPid()) {
				Permissions newPerms = new Permissions();
				newPerms.setPid(p.getPid());
				newPerms.setCatalog(p.getCatalog());
				newPerms.setPenglishname(p.getPenglishname());
				newPerms.setPname(p.getPname());
				newPerms.setParentid(p.getParentid());
				newPerms.setPath(p.getPath());
				parentPerms.getChildrens().add(newPerms);
				each(newPerms,perms);
			}
		}
	}
	public void eachp(Permissions parentPerms,List<Permissions> perms){
		for(Permissions p : perms) {
			if(p.getParentid() == parentPerms.getPid()) {
				Permissions newPerms = new Permissions();
				newPerms.setPid(p.getPid());
				newPerms.setCatalog(p.getCatalog());
				newPerms.setPenglishname(p.getPenglishname());
				newPerms.setPname(p.getPname());
				newPerms.setParentid(p.getParentid());
				newPerms.setPath(p.getPath());
				parentPerms.getChildrens().add(newPerms);
				each(newPerms,perms);
			}
		}
	}
	public int addquanxian(List<Permissions> checked,int zhiwuid) {
		int a=0;
		RolesPermsExample example=new RolesPermsExample();
		example.createCriteria().andZidEqualTo(zhiwuid);
		romapper.deleteByExample(example);
		for(Permissions p:checked) {
			RolesPerms ro=new RolesPerms();
			ro.setPid(p.getPid());
			ro.setZid(zhiwuid);
			a=romapper.insert(ro);
		}
		return a;
	}
	
	
}
