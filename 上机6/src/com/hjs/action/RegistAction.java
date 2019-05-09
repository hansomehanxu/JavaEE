package com.hjs.action;

import com.hjs.entity.User;
import com.hjs.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport{
	
	private UserService userservice;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}


	public String execute() throws Exception {
		
		   //debug
			System.out.println("������RegistAction��ִ�з���");
			System.out.println("�ɹ��õ��û���:"+this.user.getUserName());
		
			boolean flag = this.userservice.saveUser(this.user);
			
		if(flag){
			System.out.println("action����ɹ�!");
		return SUCCESS;
	}else
		System.out.println("action����ʧ��!");
		System.out.println("�˳���RegistAction��ִ�з���,����ע��ʧ��ҳ��");
	    return INPUT;
	}
	
}
