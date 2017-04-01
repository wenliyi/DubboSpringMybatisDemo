package com.wenly.dao;

import com.wenly.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by root on 17-4-1.
 */
public interface SelectMapper {
    @Select("SELECT * FROM user WHERE ID = #{id}")
    @Results({
            @Result(id = true,column = "ID",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age")
    })
    User selectUserById(Integer id);
}
