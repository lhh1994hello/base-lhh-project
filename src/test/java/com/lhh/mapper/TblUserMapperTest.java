package com.lhh.mapper;

import com.lhh.bean.TblUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@SuppressWarnings("all")
public class TblUserMapperTest {
    @Autowired
    private TblUserMapper userMapper;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    //测试一级缓存
    @Test
    public void selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TblUserMapper userMapper = sqlSession.getMapper(TblUserMapper.class);
        List<TblUser> tblUserList1 = userMapper.selectAll();
        List<TblUser> tblUserList2 = userMapper.selectAll();
        System.out.println("结果：" + (tblUserList1 == tblUserList2));
    }

    @Test
    public void findSingleUserReturnMap() {
        Map<String, Object> userReturnMap = userMapper.findSingleUserReturnMap(1);
        Map<String, Object> userReturnMap2 = userMapper.findSingleUserReturnMap(1);
        System.out.println(userReturnMap);
    }

    @Test
    public void findMultUserReturnMap() {
        Map<String, TblUser> multUserReturnMap = userMapper.findMultUserReturnMap("张三");
        int size = multUserReturnMap.size();
        System.out.println(multUserReturnMap);
    }
}