package com.ycfd.userrole.mapper;

import com.ycfd.userrole.entity.SysUsers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dl
 * @since 2019-07-26
 */
@Mapper
public interface SysUsersMapper extends BaseMapper<SysUsers> {
    List<SysUsers> selectall();

}
