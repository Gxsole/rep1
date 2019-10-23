package com.turing.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义控制器的第一种方式：注解
 * @author fred
 *
 */

@Controller
public class AnnotationController {

	@RequestMapping("/ac")
	public ModelAndView method1() {
		//模型视图对象
		ModelAndView mv = new ModelAndView();
		//添加数据
		mv.addObject("msg", "AnnotationController...");
		//设置视图
		mv.setViewName("/show.jsp");
		return mv;
	}
}
