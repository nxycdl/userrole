package com.ycfd.userrole.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ycfd.userrole.entity.Menu;
import com.ycfd.userrole.entity.User;
import com.ycfd.userrole.mapper.MenuMapper;
import com.ycfd.userrole.mapper.UserMapper;
import com.ycfd.userrole.service.MenuService;
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
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectByIds(List<Integer> ids) {
        return menuMapper.selectBatchIds(ids);
    }

    @Override
    public List<Menu> getMenusByHrId(Integer userid){
        return menuMapper.getMenusByHrId(userid);
    }

    @Override
    public List<Menu> menuTree() {
        return menuMapper.menuTree();
    }
}
