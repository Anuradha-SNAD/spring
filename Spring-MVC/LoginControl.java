package org.snad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginControl {
	@RequestMapping("/validate")
	public String login(@RequestParam String name,@RequestParam String password) {
		System.out.println("Controller reached");
		if(name.equals("admin")&& password.equals("1234")) {
			return "success";
		}else {
			return "failed";
		}
	}

}
