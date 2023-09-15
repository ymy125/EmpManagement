package com.ymy.service;

import com.ymy.pojo.PageBean;

import java.time.LocalDate;

public interface EmpService {

    PageBean page(Integer page, Integer pageSize);
}
