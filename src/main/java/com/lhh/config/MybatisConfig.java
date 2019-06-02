package com.lhh.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: lhh
 * @Date: 2019/6/2 16:31
 * @Version 1.0
 */
@Configuration
@MapperScan(value = "com.lhh.mapper")
public class MybatisConfig {
    public MybatisConfig() {
        System.out.println("mybatis配置类......");
    }
}
