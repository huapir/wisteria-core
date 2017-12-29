package org.wisteria.web.mvc.base;

import org.wisteria.web.mvc.model.PageResult;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public abstract class AbstractBaseServiceImpl<T, I> implements IBaseService<T, I> {
	
	public abstract BaseMapper<T, I> getBaseMapper();

	@Override
	public boolean add(T record) {
		return getBaseMapper().insert(record) > 0;
	}
	
	@Override
	public T query(I id) {
		return getBaseMapper().select(id);
	}

	@Override
	public PageResult<T> queryByPage(T record, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<T> page = getBaseMapper().selectByPage(record);
		return new PageResult<T>(page.getTotal(), page.getResult());
	}

	@Override
	public boolean modify(T record) {
		return getBaseMapper().update(record) > 0;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean remove(I... id) {
		return getBaseMapper().deleteBatchIds(id) > 0;
	}

}
