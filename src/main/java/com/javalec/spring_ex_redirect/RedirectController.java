package com.javalec.spring_ex_redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		
		String id = httpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOk";
		}
		
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk(Model model) {
		
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg(Model model) {
		
		return "student/studentNg";
	}
	
	@RequestMapping("/studentURL1")
	public String studentURL1(Model model) {
		
		return "redirect:http://localhost:8181/spring_ex_redirect/studentURL1.jsp"; // jps페이지 풀경로를 직접 쓸 수도 있다.
		
	}
}
