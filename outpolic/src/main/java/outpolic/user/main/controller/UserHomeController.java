package outpolic.user.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user/main")
public class UserHomeController {
	
	@GetMapping("")
	public String userMainView() {
		
		return "user/main/userMainView";
	}
	
	@GetMapping("/userListpage")
	public String userListpageView() {
		
		return "user/main/userListpageView";
	}
}
