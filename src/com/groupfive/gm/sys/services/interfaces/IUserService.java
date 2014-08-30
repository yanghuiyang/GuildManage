package com.groupfive.gm.sys.services.interfaces;
import java.util.List;

import com.groupfive.gm.entities.SysUser;
public interface IUserService {
	String add(SysUser user);
	String edit(SysUser user);
	List<SysUser> list(SysUser user);
	SysUser detail(SysUser user);
}
