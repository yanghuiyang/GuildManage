package com.groupfive.gm.sys.actions;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.json.JSONResult;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.groupfive.gm.entities.Role;
import com.groupfive.gm.entities.SysUser;
import com.groupfive.gm.sys.services.interfaces.IRoleService;
import com.groupfive.gm.sys.services.interfaces.IUserService;
import com.opensymphony.xwork2.ActionSupport;
@Controller        //����
@Scope("prototype")//����
@ParentPackage(value="struts-default")
@Results({
   // @Result(name="success",value="fun",params={"contentType","text/plain","root","fun","excludeNullProperties","true"},type=JSONResult.class),
    @Result(name="add",value="/WEB-INF/sys/users/add.jsp"),
    @Result(name="list",value="/WEB-INF/sys/users/list.jsp"),
    @Result(name="detail", value="/WEB-INF/sys/users/edit.jsp")
})
public class UsersAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1438909119879604366L;

	private SysUser user;
	private List<SysUser> listuser;
	private Role role;
	private List<Role> listrole;
	
	@Resource(name="userService")
	private IUserService userService;
	@Resource(name="roleService")
	private IRoleService roleService;
	public SysUser getUser() {
		return user;
	}
	public void setUser(SysUser user) {
		this.user = user;
	}
	public List<SysUser> getListuser() {
		return listuser;
	}
	public void setListuser(List<SysUser> listuser) {
		this.listuser = listuser;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Role> getListrole() {
		return listrole;
	}
	public void setListrole(List<Role> listrole) {
		this.listrole = listrole;
	}
	/**
	 * �û��б�action
	 * ִ�в�ѯ�Լ���ʼ������
	 */
	public String list() throws Exception
	{
		
		listrole=roleService.list(role);//��ȡ��ɫ�����б�����
		listuser=userService.list(user);
		return "list";
	}
	
	/**
	 * ת���û�����ҳ��action
	 */
	public String gotoadd() throws Exception
	{
		listrole=roleService.list(role);
		return "add";
	}
	/**
	 *  �����û�action
	 */
	public String add() throws Exception
	{
		userService.add(user);
		user=null;
		return list();
	}
	/**
	 *  ��ʼ���޸�ҳ��
	 */
	public String detail() throws Exception
	{
		listrole=roleService.list(role);
		user=userService .detail(user);
		
		return "detail";
	}
	
	/**
	 *  �޸�
	 */
	public String edit() throws Exception
	{
		userService.edit(user);
		user=null;
		return list();
	}
}
