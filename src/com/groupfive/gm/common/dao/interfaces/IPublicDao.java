package com.groupfive.gm.common.dao.interfaces;

import java.util.List;

import com.groupfive.gm.entities.SysUser;
public interface IPublicDao {
	<T>String add(T t);
	<T>String edit(T t);
	<T>String delete(T t);
	<T>List<T> list(Class<T> clazz);
	<T>List<T> list(String hql);
	<T> T detail(Class<T> t,Long id);
	SysUser findbyid(SysUser user);
}
