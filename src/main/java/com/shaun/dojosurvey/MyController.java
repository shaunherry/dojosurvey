package com.shaun.dojosurvey;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/setresults")
	public String preview(@RequestParam(value="name") String name, 
							@RequestParam(value="location") String location,
							@RequestParam(value="language") String language,
							@RequestParam(value="comments") String comments, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comments", comments);
		return "redirect:/results";
	}
	
	
	@GetMapping("/results")
	public String results(HttpSession session, Model model) {
		if(session.getAttribute("language").equals("java")) {
			return "java.jsp";
		}
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("location", session.getAttribute("location"));
		model.addAttribute("language", session.getAttribute("language"));
		model.addAttribute("comment", session.getAttribute("language"));
		return "results.jsp";
	}

}












