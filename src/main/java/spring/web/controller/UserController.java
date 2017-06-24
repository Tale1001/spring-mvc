package spring.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/userList")
	public ModelAndView getUserList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userList");
		mav.addObject("userList", userService.getUserList());
		return mav;
	}
}
