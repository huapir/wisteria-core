package org.wisteria.web.mvc.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper<T> {

	int insert(T record);
	List<T> selectList(T record);
	int update(T record);
	T select(@Param("id") Integer id);
	int delete(@Param("id") Integer id);
}
