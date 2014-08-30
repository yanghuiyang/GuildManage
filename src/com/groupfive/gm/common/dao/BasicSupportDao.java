package com.groupfive.gm.common.dao;
import java.io.Serializable;
import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BasicSupportDao extends HibernateDaoSupport implements
		Serializable {
	private static final long serialVersionUID = 1L;

	/*@Resource(name = "hibernateTemplate")
	public void setHibernatetemplate(HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}*/
	
	//����HibernateDaoSupportע��sessionFactory
	@Resource(name="sessionFactory")
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
}