package com.wenly.dao;

import com.wenly.domain.User;
import org.apache.ibatis.annotations.Update;

/**
 * Created by root on 17-4-1.
 */
public interface UpdateMapper {

    @Update("UPDATE user SET  id = #{id}, name = #{name}, age = #{age} WHERE ID = #{id}")
    int modifyUser(User user);
}
