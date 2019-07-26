package com.ycfd.userrole.service;

import com.ycfd.userrole.entity.SysUsers;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dl
 * @since 2019-07-26
 */
public interface ISysUsersService extends IService<SysUsers> {
    List<SysUsers> selectall();

}
