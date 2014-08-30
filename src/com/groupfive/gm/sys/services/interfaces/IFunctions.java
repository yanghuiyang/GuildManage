package com.groupfive.gm.sys.services.interfaces;
import java.util.List;

import com.groupfive.gm.entities.Fuctions;
public interface IFunctions {
	String add(Fuctions fun);
	List<Fuctions> list(Fuctions fun);
	String edit(Fuctions fun);
	String delete(Fuctions fun);
	Fuctions detail(Fuctions fun);
}
