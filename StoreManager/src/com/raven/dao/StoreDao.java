/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import java.util.List;

/**
 *
 * @author hongk
 */
public abstract class StoreDao<E, K> {
    abstract public void insert(E e);

    abstract public void update(E e);

    abstract public void delete(K k);

//    abstract public List<E> selectAll();

    abstract public E selectById(K k);

    abstract public E selectByName(K k);

    abstract protected List<E> selectBySql(String sql, Object... args);
}
