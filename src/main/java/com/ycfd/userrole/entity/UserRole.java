package com.ycfd.userrole.entity;

public class UserRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.id
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.userid
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.roleid
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    private Integer roleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.id
     *
     * @return the value of user_role.id
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.id
     *
     * @param id the value for user_role.id
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.userid
     *
     * @return the value of user_role.userid
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.userid
     *
     * @param userid the value for user_role.userid
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.roleid
     *
     * @return the value of user_role.roleid
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.roleid
     *
     * @param roleid the value for user_role.roleid
     *
     * @mbg.generated Wed Jul 24 22:01:58 CST 2019
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public UserRole(Integer userid){
        this.userid= userid;
    }
}