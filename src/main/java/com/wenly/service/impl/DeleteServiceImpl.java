package com.wenly.service.impl;

import com.wenly.dao.DeleteMapper;
import com.wenly.service.DeleteService;
import com.wenly.service.InsertService;
import com.wenly.dao.InsertMapper;
import com.wenly.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 17-3-31.
 */
@Service("deleteService")
public class DeleteServiceImpl implements DeleteService {
    @Autowired
    private DeleteMapper deleteMapper;
    //@Override
    public int deleteUser(Integer id) {
        deleteMapper.removeUser(id);
        return 2;
    }
}
