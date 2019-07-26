package com.ycfd.userrole.service;

import com.ycfd.userrole.entity.User;
import com.ycfd.userrole.entity.UserRole;

import java.util.List;

/**
 * Created by nxycdl on 2019/7/24 21:21.
 *
 * @author dl
 */
public interface UserRoleService {
    public List<UserRole> selectByUserId(Integer userId);
}
