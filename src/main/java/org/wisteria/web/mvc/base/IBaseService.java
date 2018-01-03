package org.wisteria.web.mvc.base;

import org.wisteria.web.mvc.model.PageResult;

public interface IBaseService<T, I> {

	boolean add(T record);
	
	T query(I id);
	PageResult<T> queryByPage(T record, int pageNum, int pageSize);
	
	boolean modify(T record);
	
	@SuppressWarnings("unchecked")
	boolean remove(I... id);
	
	PageResult<?> queryByPages(T record, int pageNum, int pageSize);
}
