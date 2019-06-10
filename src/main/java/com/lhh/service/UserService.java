package com.lhh.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author lhh
 * @date 2019/6/4 17:02
 * @Description:
 * @Service 注解默认单例 如果想声明成多例对象可以使用@Scope("prototype")
 */
@Scope(value = "prototype")
@Service
public class UserService {

    public UserService() {
        System.out.println("UserService构造方法....");
    }
}
