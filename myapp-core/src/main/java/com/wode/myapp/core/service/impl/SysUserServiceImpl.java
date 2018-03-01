package com.wode.myapp.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wode.myapp.base.bean.SysUser;
import com.wode.myapp.base.service.SysUserService;
import com.wode.myapp.core.dao.SysUserDao;

@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserDao sysUserDao;
	
	public SysUser register(String userName, String password) {
		
		SysUser user = new SysUser(userName, password);
		
		sysUserDao.add(user);
		
		return user;
	}

}
