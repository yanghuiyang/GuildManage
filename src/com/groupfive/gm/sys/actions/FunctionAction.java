package com.groupfive.gm.sys.actions;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import net.sf.json.JSONObject;
import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.groupfive.gm.entities.Fuctions;
import com.groupfive.gm.model.StringResult;
import com.groupfive.gm.sys.services.interfaces.IFunctions;
import com.opensymphony.xwork2.ActionSupport;
@Controller        //±ØÐë
@Scope("prototype")//±ØÐë
@ParentPackage(value="struts-default")
@Results({
	@Result(name="success",value="districts",params={"contentType","text/json","root","districts","excludeNullProperties","true"},type=StringResult.class),
    //@Result(name="success",value="10000"),
   // @Result(name="add",value="/WEB-INF/sys/users/adduser.jsp"),
   // @Result(name="list",value="/WEB-INF/sys/users/listuser.jsp"),
    @Result(name="list",value="/WEB-INF/sys/functions/functions.jsp")
})
public class FunctionAction extends ActionSupport implements ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8040899073507263763L;
	@Resource(name="functionService")
	private IFunctions funservice;
	
	
	private Fuctions fuctions;
	private List<Fuctions> listfun;
	private String districts;
	
	public List<Fuctions> getListfun() {
		return listfun;
	}

	public void setListfun(List<Fuctions> listfun) {
		this.listfun = listfun;
	}

	

	public Fuctions getFuctions() {
		return fuctions;
	}

	public void setFuctions(Fuctions fuctions) {
		this.fuctions = fuctions;
	}

	public String editfunction() throws Exception
	{
		/*fuctions=new Fuctions();
		//String str=request.getParameter("funId");
		fuctions.setFunId(Integer.parseInt(request.getParameter("funId")));
		fuctions.setFunPid(Integer.parseInt(request.getParameter("funPid")));
		fuctions.setFunName(request.getParameter("funName"));
		fuctions.setFunUrl(request.getParameter("funUrl"));*/
		//districts.wait();
		
		funservice.edit(fuctions);
		
		JSONObject json = JSONObject.fromObject(fuctions);
		districts = "123";//json.toString();
		return "success";
	}
	
	public String detail() throws Exception
	{
		funservice.delete(fuctions);
		return list();
	}
	
	public String delete() throws Exception
	{
		funservice.delete(fuctions);
		return list();
	}
	
	public String add() throws Exception
	{
		funservice.add(fuctions);
		return list();
	}
	
	public String list() throws Exception
	{
		listfun=funservice.list(fuctions);
		return "list";
	}


	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
	}

	public void setDistricts(String districts) {
		this.districts = districts;
	}

	public String getDistricts() {
		return districts;
	}
	
}
