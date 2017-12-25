package org.wisteria.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.wisteria.demo.dao.WDemoMapper;
import org.wisteria.demo.service.IWDemoService;

@Service
public class WDemoServiceImpl implements IWDemoService {

	@Resource
	private WDemoMapper wdemoMapper;
}
