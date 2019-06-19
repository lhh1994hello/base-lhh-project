package com.lhh.controller;

import com.lhh.bean.TblUser;
import com.lhh.mapper.TblUserMapper;
import com.lhh.service.UserService;
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
    @Autowired
    private UserService userService;

    /**
     * @return
     */
    @RequestMapping(value = "/findAll")
    public Msg findAll() {
        List<TblUser> tblUserList = userService.selectAll();
        List<TblUser> tblUserList2 = userService.selectAll();
        return Msg.Success().add("userList", tblUserList);
    }

    /**
     * 按主键查询
     *
     * @return
     */
    @RequestMapping(value = "/findTblUserById")
    public Msg findTblUserById() {
        TblUser tblUser = userService.findTblUserById(1);
        System.out.println("========================================================================================================================================================");
        TblUser tblUser2 = userService.findTblUserById(1);
        System.out.println("结果：" + (tblUser == tblUser2));
        return Msg.Success().add("tblUser", tblUser);
    }

}
