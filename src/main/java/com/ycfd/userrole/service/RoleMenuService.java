package com.ycfd.userrole.service;

import com.ycfd.userrole.entity.RoleMenu;
import com.ycfd.userrole.entity.User;
import com.ycfd.userrole.entity.UserRole;

import java.util.List;

/**
 * Created by nxycdl on 2019/7/24 21:21.
 *
 * @author dl
 */
public interface RoleMenuService {
    public List<RoleMenu> selectByRoleIds(List<Integer> ids);
    public void deleteByRoleid(Integer roleid);
    public void batchInsert(List<RoleMenu> roleMenus);
}
