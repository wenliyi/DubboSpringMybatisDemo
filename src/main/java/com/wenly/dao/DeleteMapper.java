package com.wenly.dao;

import com.wenly.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

/**
 * Created by root on 17-3-31.
 */
public interface DeleteMapper {
    @Delete("DELETE FROM user WHERE ID = #{id}")
    int removeUser(@Param("id") Integer id);
}
