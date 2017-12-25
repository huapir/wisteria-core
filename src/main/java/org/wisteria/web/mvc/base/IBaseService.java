package org.wisteria.web.mvc.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IBaseService<T> {

	int add(T record);
	List<T> query(T record);
	int modify(T record);
	T get(@Param("id") Integer id);
	int remove(@Param("id") Integer id);
}
