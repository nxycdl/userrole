package com.ycfd.userrole.service.impl;

import com.ycfd.userrole.entity.User;
import com.ycfd.userrole.mapper.UserMapper;
import com.ycfd.userrole.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nxycdl on 2019/7/24 21:22.
 *
 * @author dl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
