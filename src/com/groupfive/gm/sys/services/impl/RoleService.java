package com.groupfive.gm.sys.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.groupfive.gm.common.dao.interfaces.IPublicDao;
import com.groupfive.gm.entities.Role;
import com.groupfive.gm.sys.services.interfaces.IRoleService;

@Service("roleService")
public class RoleService implements IRoleService {

	@Resource(name="publicDao")
	private IPublicDao dao;
	
	public List<Role> list(Role role) {
		// TODO Auto-generated method stub
		return dao.list(Role.class);
		//return null;
	}

}
