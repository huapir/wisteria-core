package org.wisteria.web.mvc.base;

import org.apache.ibatis.annotations.Param;
import org.wisteria.web.mvc.model.PageResult;

public interface IBaseService<T> {

	int add(T record);
	PageResult<T> queryByPage(T record, int pageNum, int pageSize);
	int modify(T record);
	T get(@Param("id") Integer id);
	int remove(@Param("id") Integer id);
}
