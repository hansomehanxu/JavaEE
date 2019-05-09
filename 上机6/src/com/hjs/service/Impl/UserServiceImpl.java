package com.hjs.service.Impl;

import com.hjs.dao.UserDAO;
import com.hjs.entity.User;
import com.hjs.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDAO userDao;
	

	public UserDAO getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}


	public boolean saveUser(User user) {
		
		//debug
		System.out.println("������service��saveUser()����");
		
		User exitUser = this.userDao.findUser(user);//ע��ʱ�����Ƿ��Ѵ����û�
		if(exitUser == null){
			this.userDao.saveUser(user);//������,�ͽ��б���
			
			//debug
			System.out.println("service����ɹ�!");
			
			return true;//ע��ɹ�
			
		}else{
			
			//debug
			System.out.println("service����ʧ��");
			System.out.println("�Ѿ����ڸ��û�");
			System.out.println("�˳���service��saveUser()����");
			
			return false;
		}
	
	}

	
	public User findUser(User user) {
		
		return userDao.findUser(user);
	}
	

}
