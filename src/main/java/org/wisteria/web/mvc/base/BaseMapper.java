package org.wisteria.web.mvc.base;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;

public interface BaseMapper<T, I> {

	int insert(T record);
	
	int update(T record);
	
	T select(@Param("id") I id);
	Page<T> selectByPage(T record);
	
	int deleteBatchIds(@SuppressWarnings("unchecked") @Param("ids") I... ids);
	
	Page<?> selectByPages(T record);
}
