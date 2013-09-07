package cn.itcast.oa.base;

import java.util.List;
import java.util.Set;

public interface BaseDao<T> {

	/**
	 * 保存实体
	 * 
	 * @param entity
	 */
	void save(T entity);

	/**
	 * 更新实体
	 * 
	 * @param entity
	 */
	void update(T entity);

	/**
	 * 删除实体
	 * 
	 * @param id
	 */
	void delete(Long id);

	/**
	 * 获取实体
	 * 
	 * @param id
	 * @return
	 */
	T getById(Long id);

	/**
	 * 获取实体
	 * 
	 * @param ids
	 * @return
	 */
	Set<T> getByIds(Long[] ids);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<T> findAll();
}
