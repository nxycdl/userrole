package com.ycfd.userrole.controller;


import com.ycfd.userrole.entity.SysUsers;
import com.ycfd.userrole.service.ISysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dl
 * @since 2019-07-26
 */
@RestController
@RequestMapping("/sys-users")
public class SysUsersController {

    /**
     * 调用BaseMapper;
     */
    @Autowired
    private ISysUsersService sysUsersService;
    @GetMapping("/user")
    private List<SysUsers> getAll() {
        return sysUsersService.list();
    }

    /**
     * 调用selectAll
     * @return
     */
    @GetMapping("/user2")
    private List<SysUsers> getAll2() {
        return sysUsersService.selectall();
    }

    @GetMapping("/insert")
    private Boolean insert() {
        SysUsers user= new SysUsers();
        user.setDeptCode("2");
        user.setUserId("2");
        user.setUserCode("2");
        user.setUserName("2");
        user.setUserType("2");
        user.setStatus("2");
        user.setOrgCode("2");
        return sysUsersService.save(user);
    }

    @GetMapping("/update")
    private Boolean update() {
        SysUsers user= new SysUsers();
        user.setId(1);
        user.setUserName("dl");
        return sysUsersService.updateById(user);
    }


    @GetMapping("/transcation")
    @Transactional(propagation = Propagation.REQUIRED)
    public Boolean tra() {
        SysUsers user= new SysUsers();
        user.setId(1);
        user.setUserName("dl1");
        SysUsers user1= new SysUsers();
        user1.setId(2);
        user1.setStatus("20");
        sysUsersService.updateById(user);
        //sysUsersService.updateById(user1);
        String s = null;
        s.indexOf("C");
        return true;
    }


}
