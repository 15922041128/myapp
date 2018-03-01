package com.wode.myapp.base.service;

import com.wode.myapp.base.bean.SysUser;

public interface SysUserService {

	SysUser register(String userName, String password);
}
