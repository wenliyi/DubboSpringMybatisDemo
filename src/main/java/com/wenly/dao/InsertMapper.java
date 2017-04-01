package com.wenly.dao;

import com.wenly.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * Created by root on 17-3-31.
 */
public interface InsertMapper {
    @Insert("INSERT INTO user(ID,name,age) VALUES(null,#{name},#{age})")
    @Options(useGeneratedKeys = true, keyProperty="id")
   void saveUser(User user);
}
