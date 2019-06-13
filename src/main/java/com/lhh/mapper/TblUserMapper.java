package com.lhh.mapper;

import com.lhh.bean.TblUser;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: lhh
 * @Date: 2019/6/2 16:30
 * @Version 1.0
 */
public interface TblUserMapper {

    public List<TblUser> selectAll();

    //返回map类型，最多只有一条记录
    public Map<String, Object> findSingleUserReturnMap(int id);

    //返回map类型，多条记录,MapKey用来指定map的键
    @MapKey("id")
    public Map<String, TblUser> findMultUserReturnMap(String username);

    public List<TblUser> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    public List<TblUser> findByExampleWithSelect(TblUser user);

}
