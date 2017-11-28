package com.cts.user.service.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cts.user.service.entity.Login;
import com.cts.user.service.model.Logins;
import com.cts.user.service.repository.LoginRepository;
import com.cts.user.service.service.LoginService;

@RestController
@RequestMapping("/rest/db/login")
public class LoginResource {
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/getAllLogin")
	public List<Login> getAllLogin(){
		return  loginRepository.findAll();
	}
	
	@PostMapping("/getLoginByName")
	public boolean getLoginByLoginName(@RequestBody final Logins logins){
		Login login = loginService.getLogin(logins);
		List<Login> loginResultSet= loginRepository.findByLoginNamePassword(login.getLoginName());
		return loginService.validationPassword(logins, loginResultSet);
	}
	
	
	
	@PostMapping("/addLogin")
	public List<Login> addRoom(@RequestBody final Logins logins){
		Login login = loginService.addLogin(logins);
		loginRepository.save(login);
		return loginRepository.findAll();
	}

}
