package com.groupfive.gm.sys.services.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.groupfive.gm.entities.Fuctions;
import com.groupfive.gm.sys.dao.interfaces.IFunctionDao;
import com.groupfive.gm.sys.services.interfaces.IFunctions;
@Service("functionService")
public class FunctionService implements IFunctions {
	@Resource(name="functionDao")
	private IFunctionDao dao;
	public String add(Fuctions fun) {
		// TODO Auto-generated method stub
		return dao.add(fun);
		//return null;
	}

	public String delete(Fuctions fun) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public Fuctions detail(Fuctions fun) {
		// TODO Auto-generated method stub
		//return null;
		return dao.detail(fun);
	}

	public String edit(Fuctions fun) {
		// TODO Auto-generated method stub
		//return null;
		return dao.edit(fun);
	}

	public List<Fuctions> list(Fuctions fun) {
		// TODO Auto-generated method stub
		//return null;
		return dao.list(fun);
	}

}
