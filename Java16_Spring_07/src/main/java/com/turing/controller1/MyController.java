package com.turing.controller1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * 自定义控制器的第一种方式：实现接口
 * @author fred
 *
 */
public class MyController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//模型视图对象
		ModelAndView mv = new ModelAndView();
		//添加数据
		mv.addObject("msg", "MyController...");
		//设置视图
		mv.setViewName("/show.jsp");
		return mv;
	}

}
