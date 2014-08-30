package com.groupfive.gm.sys.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.groupfive.gm.common.dao.interfaces.IPublicDao;
import com.groupfive.gm.entities.SysUser;
import com.groupfive.gm.sys.services.interfaces.IUserService;
@Service("userService")
public class UserService implements IUserService {

	@Resource(name="publicDao")
	private IPublicDao dao;
	
	public String add(SysUser user) {
		return dao.add(user);
		// TODO Auto-generated method stub
		//return null;
	}

	public SysUser detail(SysUser user) {
		// TODO Auto-generated method stub
		//return dao.detail(SysUser.class, user.getUserId().longValue());
		//return null;
		return dao.findbyid(user);
	}

	public String edit(SysUser user) {
		// TODO Auto-generated method stub
		return dao.edit(user);
		//return null;
	}

	public List<SysUser> list(SysUser user) {
		// TODO Auto-generated method stub
		String hql="select a from SysUser a ";
		if(user !=null && user.getRole().getRoleId()!=-1)
		{
			hql+=" where a.role.roleId='"+user.getRole().getRoleId()+"'";
		}
		return dao.list(hql);
		//return null;
	}

}
