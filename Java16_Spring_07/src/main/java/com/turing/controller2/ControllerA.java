package com.turing.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerA {

	@RequestMapping("/show1")
	public ModelAndView show1() {
		//模型视图对象
		ModelAndView mv = new ModelAndView();
		//添加数据
		mv.addObject("msg", "AnnotationController...");
		//设置视图
		mv.setViewName("show1");
		return mv;
	}
	
	@RequestMapping("/show2")
	public ModelAndView show2() {
		//模型视图对象
		ModelAndView mv = new ModelAndView();
		//添加数据
		mv.addObject("msg", "AnnotationController...");
		//设置视图
		mv.setViewName("show2");
		return mv;
	}
	
	/**
	 * 不使用自己配置的视图解析器，使用加前缀的方式
	 * forward:转发
	 * redirect：重定向
	 * @return
	 */
	@RequestMapping("/show")
	public ModelAndView show() {
		//模型视图对象
		ModelAndView mv = new ModelAndView();
		//添加数据
		mv.addObject("msg", "AnnotationController...");
		//设置视图
//		mv.setViewName("forward:/show.jsp");
		mv.setViewName("redirect:/show.jsp");
		return mv;
	}
}
