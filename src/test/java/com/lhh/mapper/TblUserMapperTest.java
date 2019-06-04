package com.lhh.mapper;

import com.lhh.bean.TblUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@SuppressWarnings("all")
public class TblUserMapperTest {
    @Autowired
    private TblUserMapper userMapper;

    @Test
    public void selectAll() {
    }

    @Test
    public void findSingleUserReturnMap() {
        Map<String, Object> userReturnMap = userMapper.findSingleUserReturnMap(1);
        System.out.println(userReturnMap);
    }

    @Test
    public void findMultUserReturnMap() {
        Map<String, TblUser> multUserReturnMap = userMapper.findMultUserReturnMap("张三");
        int size = multUserReturnMap.size();
        System.out.println(multUserReturnMap);
    }
}