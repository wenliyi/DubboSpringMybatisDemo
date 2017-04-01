package com.wenly.service.impl;

import com.wenly.service.InsertService;
import com.wenly.dao.InsertMapper;
import com.wenly.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 17-3-31.
 */
@Service("insertService")
public class InsertServiceImpl implements InsertService {
    @Autowired
    private InsertMapper insertMapper;
    //@Override
    public int insertUser(User user) {
         insertMapper.saveUser(user);
        return 1;
    }
}
