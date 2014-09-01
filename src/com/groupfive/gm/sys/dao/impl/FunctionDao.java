package com.groupfive.gm.sys.dao.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.groupfive.gm.common.dao.BasicSupportDao;
import com.groupfive.gm.entities.Fuctions;
import com.groupfive.gm.sys.dao.interfaces.IFunctionDao;
@Repository("functionDao")
public class FunctionDao extends BasicSupportDao implements IFunctionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String add(Fuctions fun) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(fun);
		return "add";
	}

	public Fuctions detail(Fuctions fun) {
		// TODO Auto-generated method stub
		
		return (Fuctions)this.getHibernateTemplate().get(Fuctions.class, fun.getFunId());
		//return null;
	}

	public String edit(Fuctions fun) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(fun);
		return "update";
	}

	@SuppressWarnings("unchecked")
	public List<Fuctions> list(Fuctions fun) {
		// TODO Auto-generated method stu
		
		String queryString="select a from Fuctions a";
		return (List<Fuctions>)this.getHibernateTemplate().find(queryString);
		//return list;
	}

}
