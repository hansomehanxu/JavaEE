package com.hjs.dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.hjs.dao.UserDAO;
import com.hjs.entity.User;


public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {


    //�û�ע�Ტд�����ݿ�
	public void saveUser(User user) {
		
		//debug
		System.out.println("������DAO��saveUser()����");
		
	   this.getHibernateTemplate().save(user);//ֻ�Ǳ������˻�����
	   this.getHibernateTemplate().flush();
	   
	   
		//debug
	   System.out.println("DAO����ɹ�,�˳�DAO��saveUser()����");
	
	}
	
	
	//ͨ�����ݿ��ѯ,��֤�û��Ƿ�Ϊ��ע���û�
	public User findUser(User user) {
		//debug
		System.out.println("������DAO��findUser()����");
		
	    User exitUser = new User();
	    exitUser = null;
	    
	    //hql��ѯ���
	    String hql = "from User user where user.userName = '" + user.getUserName() + 
	    		     "' and user.userPassword = '" + user.getUserPassword()+"'";
	    
	    //����ѯ����ŵ�userlist��
	    List<User> userlist = (List<User>) this.getHibernateTemplate().find(hql);
	    
	    //�����ѯ�����Ϊ��
	    if(userlist.size()>0){
	    	exitUser = userlist.get(0);//�û�Ψһ
	    	System.out.println("���ڸ��û�");
	    }
	    
	    //debug
	    System.out.println("DAO��ѯ����,�˳�DAO��findUser()����");
	    
	    return exitUser;//���۶����Ƿ�Ϊ��,�����з���
	    
	}

	public String updateUser(User user) {
		
		return null;
	}


	public String deleteUser(User user) {
		
		return null;
	}

}
