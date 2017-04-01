package com.wenly.service.impl;

import org.springframework.stereotype.Service;
import com.wenly.dao.SelectMapper;
import com.wenly.domain.User;
import com.wenly.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by root on 17-4-1.
 */

@Service("selectService")
public class SelectServiceImpl implements SelectService {
    @Autowired
    private SelectMapper selectMapper;
    public User selectUser(Integer id) {
        return selectMapper.selectUserById(id);
    }
}
