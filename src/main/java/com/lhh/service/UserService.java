package com.lhh.service;

import com.lhh.bean.TblUser;
import com.lhh.mapper.TblUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lhh
 * @date 2019/6/4 17:02
 * @Description:
 * @Service 注解默认单例 如果想声明成多例对象可以使用@Scope("prototype")
 */
@Service
@SuppressWarnings("all")
//开启事物
//@Transactional
public class UserService {

    @Autowired
    private TblUserMapper userMapper;

    public UserService() {
        System.out.println("UserService构造方法....");
    }

    //查询所有
    public List<TblUser> selectAll() {
        return userMapper.selectAll();
    }

    //按主键查询
    @Transactional
    public TblUser findTblUserById(Integer id) {
        return userMapper.findTblUserById(id);
    }
}
