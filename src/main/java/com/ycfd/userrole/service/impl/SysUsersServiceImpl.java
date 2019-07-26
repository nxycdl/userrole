package com.ycfd.userrole.service.impl;

import com.ycfd.userrole.entity.SysUsers;
import com.ycfd.userrole.mapper.SysUsersMapper;
import com.ycfd.userrole.service.ISysUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dl
 * @since 2019-07-26
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class SysUsersServiceImpl extends ServiceImpl<SysUsersMapper, SysUsers> implements ISysUsersService {

    @Autowired
    private SysUsersMapper sysUsersMapper;
    @Override
    public List<SysUsers> selectall() {

        return sysUsersMapper.selectall();
    }
}
