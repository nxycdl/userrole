package com.ycfd.userrole.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ycfd.userrole.entity.Menu;
import com.ycfd.userrole.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> getMenusByHrId(Integer userid);
    List<Menu> menuTree();
}