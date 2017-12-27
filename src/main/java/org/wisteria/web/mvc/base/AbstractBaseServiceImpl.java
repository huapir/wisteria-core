package org.wisteria.web.mvc.base;

import org.wisteria.web.mvc.model.PageResult;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public abstract class AbstractBaseServiceImpl<T> implements IBaseService<T> {
	
	public abstract BaseMapper<T> getBaseMapper();

	public int add(T record) {
		return getBaseMapper().insert(record);
	}

	@Override
	public PageResult<T> queryByPage(T record, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<T> page = getBaseMapper().selectByPage(record);
		return new PageResult<T>(page.getTotal(), page.getResult());
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
