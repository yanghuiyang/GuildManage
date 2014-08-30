package com.groupfive.gm.sys.dao.interfaces;
import java.util.List;
import com.groupfive.gm.entities.Fuctions;
public interface IFunctionDao {
	String add(Fuctions fun);
	List<Fuctions> list(Fuctions fun);
	String edit(Fuctions fun);
	Fuctions detail(Fuctions fun);
}
