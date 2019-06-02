package com.lhh.mapper;

import com.lhh.bean.TblUser;

import java.util.List;

/**
 * @Author: lhh
 * @Date: 2019/6/2 16:30
 * @Version 1.0
 */
public interface TblUserMapper {

    public List<TblUser> selectAll();

    public List<TblUser> findByUsernameAndPassword(String username, String password);

    public List<TblUser> findByExampleWithSelect(TblUser user);

}
