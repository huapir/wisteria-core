package org.wisteria.web.mvc.base;

import java.util.List;

public abstract class AbstractBaseServiceImpl<T> implements IBaseService<T> {
	
	public abstract BaseMapper<T> getBaseMapper();

	public int add(T record) {
		return getBaseMapper().insert(record);
	}

	public List<T> query(T record) {
		return getBaseMapper().selectList(record);
	}

	public int modify(T record) {
		return getBaseMapper().update(record);
	}

	public T get(Integer id) {
		return getBaseMapper().select(id);
	}

	public int remove(Integer id) {
		return getBaseMapper().delete(id);
	}

}
