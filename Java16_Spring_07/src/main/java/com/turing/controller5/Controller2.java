package com.turing.controller5;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.turing.controller3.User;

/**
 * 后台数据传递到前端
 * @author fred
 *
 */
@Controller
public class Controller2 {

	/**
	 * 使用Servlet技术
	 */
	@RequestMapping("/cm1")
	public ModelAndView cm1(HttpServletRequest request) {
		//设置数据
		request.setAttribute("msg", "Servlet response...");
		//设置视图
		ModelAndView mv = new ModelAndView("show1");
		return mv;
	}
	
	/**
	 * 第二种方式ModelAndView
	 * @return
	 */
	@RequestMapping("/cm2")
	public ModelAndView cm2() {
		//设置视图
		ModelAndView mv = new ModelAndView("show1");
		//设置数据
		mv.addObject("msg", "周六要上课");
		mv.addObject("msg", "周六真的要上课");//覆盖
		return mv;
	}
	
	/**
	 * 第三种方式：返回String指定视图名
	 */
	@RequestMapping("/cm3")
	public String cm3(Model model) {
		//设置数据
		model.addAttribute("msg", "下周六不上课");
//		return "show1";//返回的String就是视图名            默认是转发
		return "redirect:/show.jsp";//返回的String就是视图名            默认是转发
	}
	
	/**
	 * 第四种方式：返回对象，
	 * 视图：请求路径作为视图名
	 * 数据：返回的对象
	 * 注意：提取把视图创建好
	 * @return
	 */
	@RequestMapping("/cm4")
	public User cm4() {
		User user = new User();
		user.setUsername("java16");
		user.setPassword("123");
		return user;
	}
	
	//返回JSON
	//JSON的解析工具：使用第三方提供的
	//jackson、阿里巴巴：fastjson、Google：Gson、...
	@RequestMapping("/cm5")
	@ResponseBody //只要加上这个注解，SpringMVC自动把对象转换成JSON字符串，响应出去
	public User cm5() {
		User user = new User();
		user.setUsername("java16");
		user.setPassword("123");
		return user;
	}
	
	@RequestMapping("/cm6")
	@ResponseBody //只要加上这个注解，SpringMVC自动把对象转换成JSON字符串，响应出去
	public List<User> cm6() {
		List<User> list = new ArrayList<User>();
		for(int i=0;i<10;i++) {
			User user = new User();
			user.setUsername("java16");
			user.setPassword("123");
			list.add(user);
		}
		return list;
	}
}
