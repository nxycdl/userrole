package com.ycfd.userrole.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ycfd.userrole.entity.User;
import com.ycfd.userrole.entity.UserRole;
import com.ycfd.userrole.mapper.UserMapper;
import com.ycfd.userrole.mapper.UserRoleMapper;
import com.ycfd.userrole.service.UserRoleService;
import com.ycfd.userrole.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nxycdl on 2019/7/24 21:22.
 *
 * @author dl
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> selectByUserId(Integer userId) {
        QueryWrapper qw =new QueryWrapper();
        qw.setEntity(new UserRole(userId));
        return userRoleMapper.selectList(qw);
    }
}
