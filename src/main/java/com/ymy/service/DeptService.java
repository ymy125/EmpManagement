package com.ymy.service;

import com.ymy.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有的部门数据
     * @return   存储Dept对象的集合
     */
    List<Dept> list();

    /**
     * 根据id删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);
}
