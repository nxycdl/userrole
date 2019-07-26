package com.ycfd.userrole.service;

import com.ycfd.userrole.entity.Menu;
import com.ycfd.userrole.entity.User;

import java.util.List;

/**
 * Created by nxycdl on 2019/7/24 21:21.
 *
 * @author dl
 */
public interface MenuService {
    public List<Menu> selectByIds(List<Integer> ids);
    List<Menu> getMenusByHrId(Integer userid);
    List<Menu> menuTree();
}
