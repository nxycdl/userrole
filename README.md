#### SPRING BOOT MYBATISPLUS

#### 数据库结构
![avatar](http://qiniu.nxycdl.com/userrole.jpg)
#### 先看下这个参考文档（mybatis-plus 配置）
```$xslt
http://note.youdao.com/noteshare?id=5a82daade9ea21d3f78f3a018be58136&sub=A2CFD98B5BF14D32BC43ED16EDD86D56
```
测试命令
```$xslt
// 获取某个用户对应的菜单表; 本来是get请求，测试的时候写成post请求了;
curl -X POST "http://127.0.0.1:8080/user/menu3" -H "accept: application/json" -H "Content-Type: application/json" -d "{\"msg\":{\"head\":{\"userid\":1}}}"
///获取用户的menuid
curi -i http://127.0.0.1:8080/user/getRoleMenu/1
// 获取所有的菜单
curl -i http://127.0.0.1:8080/user/getAllMenu
// 角色对应的菜单保存
curl -X POST "http://127.0.0.1:8080/user/saveRoleMenu" -H "accept: application/json" -H "Content-Type: application/json" -d  "{\"msg\":{\"head\":{\"roleid\":1},\"detail\":[1,2,3,4,5]}}"
```
#### 开启事务
@EnableTransactionManagement 启动Application     
@Transactional 增加注解   
@Transactional 的修饰方法必须是public 的    
