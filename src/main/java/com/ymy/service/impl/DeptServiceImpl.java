package com.ymy.service.impl;

import com.ymy.mapper.DeptMapper;
import com.ymy.pojo.Dept;
import com.ymy.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list(){
        List<Dept> deptList = deptMapper.list();
        return  deptList;
    }

}
