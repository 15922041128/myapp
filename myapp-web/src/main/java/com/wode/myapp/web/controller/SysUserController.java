package com.wode.myapp.web.controller;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wode.myapp.base.bean.SysUser;
import com.wode.myapp.base.service.SysUserService;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;
	
	@GET
	@CrossOrigin
	@RequestMapping(value="/register", produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public String register(String userName, String password) {
		
		String result = "eiai";
		
		SysUser user = sysUserService.register(userName, password);
		
		if (null != user) {
			result = "ok!!!";
		}
		
		return result;
	}
}
