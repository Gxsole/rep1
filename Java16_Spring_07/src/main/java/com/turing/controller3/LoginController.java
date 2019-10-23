package com.turing.controller3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 数据从前端提交到后台
 * @author fred
 *
 */
@Controller
public class LoginController {

	/**
	 * 第一种方式：使用Sevlet技术
	 * 缺点：要依赖Servlet，有耦合
	 * @return
	 */
	@RequestMapping("/login1")
	public ModelAndView login1(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+":"+password);
		return null;
	}
	
	/**
	 * 第二种方式：通过控制器的执行方法
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login2")
	public ModelAndView login2(String username,String password) {
		System.out.println(username+":"+password);
		return null;
	}
	
	/**
	 * 第二种方式：通过控制器的执行方法，表单的name和控制器中的参数名不一致的请求
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login3")
	public ModelAndView login3(@RequestParam("name")String username,@RequestParam("pwd")String password) {
		System.out.println(username+":"+password);
		return null;
	}
	
	/**
	 * 第三种方式：通过对象传递参数
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login4")
	public ModelAndView login4(User user) {
		System.out.println(user.getUsername()+":"+user.getPassword());
		return null;
	}
	
	@RequestMapping("/login5")
	public ModelAndView login5(User user,String repassword) {
		System.out.println(user.getUsername()+":"+user.getPassword()+":"+repassword);
		return null;
	}
	
	
	
	
}
