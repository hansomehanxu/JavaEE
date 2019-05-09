package com.hjs.action;

import com.hjs.entity.User;
import com.hjs.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private UserService userservice;
	private User user;
	
	public UserService getUserservice() {
		return userservice;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() throws Exception {
		User now_user = userservice.findUser(user);
		if(now_user==null){
			System.out.println("��¼�ò�������");
		}
		boolean flag;
		if(now_user.getUserName() != null){
			flag = true;
		}else
			flag = false;
		
		if(flag){
			
			ActionContext ac = ActionContext.getContext();
			ac.getSession().put("user", now_user);
			
			if(now_user.getAdmin()==1){  //�г�����Ա��¼
				return LOGIN;
			}else{
				return SUCCESS; //��ͨ�ÿ͵�¼
			}
			
		}else{
			return INPUT; //��¼ʧ��,��ת��ע��ҳ��
		}
	}

	

}

