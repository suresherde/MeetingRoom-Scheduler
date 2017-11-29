package com.cts.user.service.service;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.cts.user.service.entity.Login;
import com.cts.user.service.model.Logins;



@Service
public class LoginService {
	private Login login;

public Login addLogin(Logins logins){
		
		login = new Login();
		login.setLoginFName(logins.getLoginFName());
		login.setLoginLName(logins.getLoginLName());
		login.setLoginEmail(logins.getLoginEmail());
		login.setLoginName(logins.getLoginName());
		login.setLoginPassword(logins.getLoginPassword());
		login.setLoginPhoneNo(logins.getLoginPhoneNo());
		login.setRoles(logins.getRoles());
		return login;
	}

public Login getLogin(Logins logins){
	Login login = new Login();
	login.setLoginName(logins.getLoginName());
	login.setLoginPassword(logins.getLoginPassword());
	return login;
}

public boolean validationPassword(Logins logins, List<Login> loginResultSet){
	return BCrypt.checkpw(logins.getLoginPassword(), loginResultSet.get(0).getLoginPassword());
}


}
