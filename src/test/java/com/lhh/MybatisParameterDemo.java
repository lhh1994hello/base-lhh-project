package com.lhh;

import com.lhh.bean.TblUser;
import com.lhh.mapper.TblUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: lhh
 * @Date: 2019/6/2 21:28
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisParameterDemo {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void mybatisDemo1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TblUserMapper userMapper = sqlSession.getMapper(TblUserMapper.class);
        List<TblUser> userList = userMapper.selectAll();
    }

    @Test
    public void mybatisDemo2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TblUserMapper userMapper = sqlSession.getMapper(TblUserMapper.class);
        List<TblUser> userList = userMapper.findByUsernameAndPassword("张三", "123");
    }

    @Test
    public void findByExampleWithSelectDemo() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TblUserMapper userMapper = sqlSession.getMapper(TblUserMapper.class);
        TblUser user=new TblUser();
        user.setPassword("123");
        List<TblUser> tblUserList = userMapper.findByExampleWithSelect(user);
    }
}
