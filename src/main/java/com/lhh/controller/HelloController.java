package com.lhh.controller;

import com.lhh.bean.TblUser;
import com.lhh.mapper.TblUserMapper;
import com.lhh.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: lhh
 * @Date: 2019/6/2 16:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/mybatis")
@SuppressWarnings("all")
public class HelloController {
    @Autowired
    private TblUserMapper tblUserMapper;

    /**
     * @return
     */
    @RequestMapping(value = "/findAll")
    public Msg findAll() {
        List<TblUser> userList = tblUserMapper.selectAll();
        return Msg.Success().add("userList", userList);
    }
}
