package com.turing.controller4;
/**
 * 路径参数的使用
 * @author fred
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathController {

	/**
	 * 路径参数
	 * 
	 * URL：
	 * restful风格：一个url就可以标识一个对象
	 * 
	 * 请求方式：一共有7种：
	 * GET: http://localhost/user/10  获取10号用户
	 * POST:
	 * DELETE: http://localhost/user/10    删除10号用户
	 * PUT:    http://localhost/user/10    创建10号用户
	 * ...
	 * 
	 * 路径参数中，不建议不路径写的过长，不好理解
	 * 
	 * @return
	 */
	@RequestMapping("/m1/{id}")
	public ModelAndView m1(@PathVariable("id")String id) {
		System.out.println(id);
		return null;
	}
}
