package com.wode.myapp.core.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wode.myapp.base.bean.SysUser;

@Repository
public interface SysUserMapper {

	List<SysUser> queryAll();
	
	void add(SysUser user);
}
