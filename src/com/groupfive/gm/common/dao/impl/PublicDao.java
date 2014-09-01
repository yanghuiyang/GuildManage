package com.groupfive.gm.common.dao.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.groupfive.gm.common.dao.BasicSupportDao;
import com.groupfive.gm.common.dao.interfaces.IPublicDao;
import com.groupfive.gm.entities.SysUser;

@SuppressWarnings("serial")
@Repository("publicDao")
public class PublicDao extends BasicSupportDao implements IPublicDao {

	public <T> String add(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(t);
		return "1";
	}

	public <T> String delete(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(t);
		return "1";
	}

	public <T> String edit(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(t);
		return "1";
	}

	public <T> List<T> list(Class<T> clazz) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().loadAll(clazz);
		//return null;
	}

	public <T> T detail(Class<T> t, Long id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(t, id);
		//return null;
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> list(String hql) {
		// TODO Auto-generated method stub
		return (List<T>)this.getHibernateTemplate().find(hql);
		//return null;
	}

	public SysUser findbyid(SysUser user) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(SysUser.class, user.getUserId());
		//return null;
	}



}
