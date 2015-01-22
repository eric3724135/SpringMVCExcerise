package tw.eric.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorld {
	
	
	@RequestMapping("hello")
	public String hello(@RequestParam("user") String user, Model m) {
		m.addAttribute("user", user);
		System.out.println("hello");
		return "hello";
	}
}
