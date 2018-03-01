package com.wode.myapp.core.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wode.myapp.base.bean.SysUser;
import com.wode.myapp.core.mapper.SysUserMapper;

@Service
public class SysUserDao {

	@Resource
	private SysUserMapper sysUserMapper;
	
	public List<SysUser> queryAll() {
		return sysUserMapper.queryAll();
	}
	
	public void add(SysUser user) {
		sysUserMapper.add(user);
	}
}
