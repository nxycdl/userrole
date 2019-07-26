package com.ycfd.userrole.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.org.glassfish.gmbal.ParameterNames;
import com.ycfd.userrole.base.BaseApiService;
import com.ycfd.userrole.base.ResponResult;
import com.ycfd.userrole.entity.Menu;
import com.ycfd.userrole.entity.RoleMenu;
import com.ycfd.userrole.entity.User;
import com.ycfd.userrole.entity.UserRole;
import com.ycfd.userrole.service.MenuService;
import com.ycfd.userrole.service.RoleMenuService;
import com.ycfd.userrole.service.UserRoleService;
import com.ycfd.userrole.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nxycdl on 2019/7/24 19:09.
 *
 * @author dl
 */

@RestController
@RequestMapping("/user")
public class UserController extends BaseApiService {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private RoleMenuService roleMenuService;
    @Autowired
    private MenuService menuService;

    @RequestMapping("/all")
    public User selectAll() {
        return userService.selectById(1);
    }

    @RequestMapping(value="/menu/{userid}", method= RequestMethod.GET)
    public String getMenuByUserid(@PathVariable Integer userid){
        User user = userService.selectById(userid);
        if (user==null){
            return "";
        }
        List<UserRole> usrRoleList = userRoleService.selectByUserId(user.getId());
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        usrRoleList.forEach(userRole->{
            hashMap.put(userRole.getRoleid(),userRole.getRoleid());
        });
        List<Integer> ids = new ArrayList<Integer>();
        hashMap.forEach((key,value)->{
            ids.add(key);
        });
        List<RoleMenu>roleMenuList = roleMenuService.selectByRoleIds(ids);
        hashMap.clear();
        ids.clear();
        roleMenuList.forEach(roleMenu -> {
            hashMap.put(roleMenu.getMenuid(),roleMenu.getMenuid());
        });
        hashMap.forEach((key,value)->{
            ids.add(key);
        });
        List<Menu>menuList = menuService.selectByIds(ids);
        String s = "";
        for (Menu menu : menuList) {
            s += menu.getName_ch();
        }
        return s;
    }

    @RequestMapping(value="/menu2/{userid}", method= RequestMethod.GET)
    public ResponResult getMenuByUserid2(@PathVariable Integer userid){
        List<Menu> menusList= menuService.getMenusByHrId(userid);
        return setResult(0, "", null, menusList);
    }

    @PostMapping("/menu3")
    public ResponResult getMenuByUserid3(@RequestBody JSONObject jsonParam){
        Integer userid = Integer.valueOf(JSONPath.eval(jsonParam,"$.msg.head.userid").toString());
        List<Menu> menusList= menuService.getMenusByHrId(userid);
        return setResult(0, "", null, menusList);
    }

    @GetMapping("/getAllMenu")
    public ResponResult getMenuAll(){
        List<Menu> menusTree= menuService.menuTree();
        return setResult(0, "", null, menusTree);
    }

    @GetMapping("/getRoleMenu/{roleid}")
    public ResponResult getRoleMenu(@PathVariable Integer roleid){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(roleid) ;
        List<RoleMenu>roleMenuList = roleMenuService.selectByRoleIds(ids);
        ids.clear();
        roleMenuList.forEach(roleMenu -> {
            ids.add(roleMenu.getMenuid());
        });
        return setResult(0, "", null, ids);

    }

    @PostMapping("/saveRoleMenu")
    public ResponResult saveRoleMenu(@RequestBody JSONObject jsonParam){
        System.out.println(jsonParam.toString());
        Integer roleid = Integer.valueOf(JSONPath.eval(jsonParam,"$.msg.head.roleid").toString());
        String menuids = JSONPath.eval(jsonParam,"$.msg.detail").toString();
        roleMenuService.deleteByRoleid(roleid);
        if (!StringUtils.isEmpty(menuids)) {
            menuids = menuids.substring(1,menuids.length()-1);
            List<RoleMenu> list = new ArrayList<>();
            for (String s : menuids.split(",") ){
                list.add(new RoleMenu(roleid,Integer.valueOf(s.trim())));
            }
            if (list.size()>0){
                roleMenuService.batchInsert(list);
            }
        }
        return setResult(0, "", null, null);
    }

}
