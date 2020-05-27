package com.donkey.base;

import java.util.List;

/**
 * Created by sunwh on 2020/5/27.
 */
public interface BaseService<T> {

    T findOne(int key);

    T save(T entity);

    void delete(Object key);

    List<T> findAll();

    /**
     * 批量删除
     *
     * @param iterable
     */
    void deleteInBatch(Iterable<T> iterable);

    /**
     * 批量查找
     *
     * @param iterable
     * @return
     */
    List<T> findAll(Iterable<Integer> iterable);

    /**
     * 批量保存
     *
     * @param iterable
     * @return
     */
    List<T> save(Iterable<T> iterable);
}
