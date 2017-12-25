package org.wisteria.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wisteria.demo.service.IWDemoService;

@Controller
public class WDemoController {
	
	@Resource
	private IWDemoService wdemoService;

	/**
     * 跳转至webapp/WEB-INF/view/index.jsp页面
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
