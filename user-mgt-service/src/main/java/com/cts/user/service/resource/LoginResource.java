package com.cts.user.service.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.user.service.entity.Login;
import com.cts.user.service.model.Logins;
import com.cts.user.service.model.Rooms;
import com.cts.user.service.repository.LoginRepository;
import com.cts.user.service.service.LoginService;

@RestController
@RequestMapping("/rest/db/login")
public class LoginResource {
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/getAllLogin")
	public List<Login> getAllLogin(){
		return  loginRepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/loginValidation")
	public boolean getLoginValidation(@RequestBody final Logins logins){
		Login login = loginService.getLogin(logins);
		List<Login> loginResultSet= loginRepository.findByLoginNamePassword(login.getLoginName());
				
		if(loginService.validationPassword(logins, loginResultSet))
		{
			return true;
		}else{
			return false;
		}
	}
	
	@PostMapping("/getLoginByName")
	public List<Rooms> getLoginByLoginName(@RequestBody final Logins logins){
		Login login = loginService.getLogin(logins);
		List<Login> loginResultSet= loginRepository.findByLoginNamePassword(login.getLoginName());
				
		if(loginService.validationPassword(logins, loginResultSet))
		{
			String url = "http://room-service/rest/db/room/getAllRoom";
			List<Rooms> romme=restTemplate.getForObject(url, List.class);
			return romme;
		}else{
			return null;
		}
	}
	
	
	
	@PostMapping("/addLogin")
	public List<Login> addRoom(@RequestBody final Logins logins){
		Login login = loginService.addLogin(logins);
		loginRepository.save(login);
		return loginRepository.findAll();
	}

}
