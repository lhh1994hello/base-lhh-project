package com.lhh.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author lhh
 * @date 2019/6/14 16:41
 * @Description:
 */
@Controller
public class TestController {

    @Qualifier(value = "TestServiceImpl02")
    @Autowired
    private TestService testService;
}
