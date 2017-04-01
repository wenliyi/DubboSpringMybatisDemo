package com.wenly.service.impl;

import com.wenly.dao.UpdateMapper;
import com.wenly.domain.User;
import com.wenly.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 17-4-1.
 */
@Service("updateService")
public class UpdateServiceImpl implements UpdateService{
    @Autowired
    private UpdateMapper updateMapper;
    //@Override
    public int updateUser(User user) {
        updateMapper.modifyUser(user);
        return 3;
    }
}
