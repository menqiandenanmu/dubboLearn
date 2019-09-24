package com.nanmu.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nanmu.service.DemoService;

/**
 * @类名: DemoServiceImpl
 * @描述: TODO
 * @作者: nanmu
 * @日期: 2019-09-23
 **/
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
