package com.ycfd.userrole.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ycfd.userrole.entity.RoleMenu;
import com.ycfd.userrole.entity.UserRole;
import com.ycfd.userrole.mapper.RoleMenuMapper;
import com.ycfd.userrole.mapper.UserRoleMapper;
import com.ycfd.userrole.service.RoleMenuService;
import com.ycfd.userrole.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nxycdl on 2019/7/24 21:22.
 *
 * @author dl
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public List<RoleMenu> selectByRoleIds(List<Integer> ids) {
        QueryWrapper qw = new QueryWrapper();
        qw.in("roleid",ids);
        return roleMenuMapper.selectList(qw);
    }

    @Override
    public void deleteByRoleid(Integer roleid) {
        QueryWrapper qw = new QueryWrapper();
        qw.eq("roleid",roleid);
        roleMenuMapper.delete(qw);
    }

    @Override
    public void batchInsert(List<RoleMenu> roleMenus) {
        roleMenuMapper.batchInsert(roleMenus);
    }
}
