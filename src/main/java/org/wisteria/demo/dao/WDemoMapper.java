package org.wisteria.demo.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WDemoMapper {

	void selectList();
}
