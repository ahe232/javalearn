package com.login.controller;

import com.login.view.LoginView;

public class LoginController {
	public void LauchLoginDialog(){
		LoginView lv = new LoginView();
		lv.createWindow();
	}
	

}
