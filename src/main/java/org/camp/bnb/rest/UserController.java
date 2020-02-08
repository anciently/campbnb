package org.camp.bnb.rest;

import org.camp.bnb.service.UserService;
import org.camp.bnb.vo.TestVO;
import org.camp.bnb.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/*
 * Service -> jsp ¹ÝÈ¯
 * */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "test")
	public String getTest() {
		return "test..!";
	}
	
	@GetMapping(value = "/testList")
	public TestVO getTestList() {
		return getTestList();
	}
	
	@PostMapping(value = "/write")
	public ModelAndView posts(UserVO userVO) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject(userService.insertUser(userVO));
		mav.setViewName("insertUser");
		
		return mav;
	}	

}
