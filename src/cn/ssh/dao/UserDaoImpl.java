package cn.ssh.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.bin.entity.User;

public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add() {
		//System.out.println("dao.......");
		User user=new User();
		user.setUsername("jane");
		user.setAddress("美国");
		hibernateTemplate.save(user);
	}

}
