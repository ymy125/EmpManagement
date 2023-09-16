package com.ymy.service;

import com.ymy.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有的部门数据
     * @return   存储Dept对象的集合
     */
    List<Dept> list();
}
