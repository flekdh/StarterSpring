package com.flekdh.hello.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.flekdh.hello.service.HelloService;

@Controller
public class HelloController {
	Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	HelloService helloService;
	
	@RequestMapping(value = "/hello")
	public String helloMain() {
		logger.debug("HelloController >> hello");
		return "/hello/hello";
	}
	
	@RequestMapping(value = "/helloList")
	public ModelAndView helloList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/hello/helloList");
		
		logger.debug("HelloController >> helloList");
		
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		
		String [] memberList = {"이다빈", "홍길동", "임꺽정", "김용선", "문별이", "정휘인", "안혜진"};
		for(int idx=0; idx<memberList.length; idx++) {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("no", idx+1);
			resultMap.put("name", memberList[idx]);
			
			resultList.add(resultMap);
		}

		mv.addObject("resultList", resultList);
		mv.addObject("viewName", "helloList");
		return mv;
	}
	
	@RequestMapping(value = "/selecthelloList")
	public ModelAndView selecthelloList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/hello/helloList");
		
		logger.debug("HelloController >> selecthelloList");
		
		List<Map<String, Object>> resultList = helloService.selectUserList();

		mv.addObject("resultList", resultList);
		mv.addObject("viewName", "selecthelloList");
		return mv;
	}
}
