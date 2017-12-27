package org.wisteria.web.mvc.base;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;

public interface BaseMapper<T> {

	int insert(T record);
	Page<T> selectByPage(T record);
	int update(T record);
	T select(@Param("id") Integer id);
	int delete(@Param("id") Integer id);
}
