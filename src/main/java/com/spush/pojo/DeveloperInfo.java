package com.spush.pojo;

import java.util.Date;

public class DeveloperInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.dev_id
     *
     * @mbggenerated
     */
    private String devId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.dev_name
     *
     * @mbggenerated
     */
    private String devName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.dev_pwd
     *
     * @mbggenerated
     */
    private String devPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.reg_time
     *
     * @mbggenerated
     */
    private Date regTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.last_loadtime
     *
     * @mbggenerated
     */
    private Date lastLoadtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column developer_info.company
     *
     * @mbggenerated
     */
    private String company;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.dev_id
     *
     * @return the value of developer_info.dev_id
     *
     * @mbggenerated
     */
    public String getDevId() {
        return devId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.dev_id
     *
     * @param devId the value for developer_info.dev_id
     *
     * @mbggenerated
     */
    public void setDevId(String devId) {
        this.devId = devId == null ? null : devId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.dev_name
     *
     * @return the value of developer_info.dev_name
     *
     * @mbggenerated
     */
    public String getDevName() {
        return devName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.dev_name
     *
     * @param devName the value for developer_info.dev_name
     *
     * @mbggenerated
     */
    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.dev_pwd
     *
     * @return the value of developer_info.dev_pwd
     *
     * @mbggenerated
     */
    public String getDevPwd() {
        return devPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.dev_pwd
     *
     * @param devPwd the value for developer_info.dev_pwd
     *
     * @mbggenerated
     */
    public void setDevPwd(String devPwd) {
        this.devPwd = devPwd == null ? null : devPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.reg_time
     *
     * @return the value of developer_info.reg_time
     *
     * @mbggenerated
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.reg_time
     *
     * @param regTime the value for developer_info.reg_time
     *
     * @mbggenerated
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.last_loadtime
     *
     * @return the value of developer_info.last_loadtime
     *
     * @mbggenerated
     */
    public Date getLastLoadtime() {
        return lastLoadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.last_loadtime
     *
     * @param lastLoadtime the value for developer_info.last_loadtime
     *
     * @mbggenerated
     */
    public void setLastLoadtime(Date lastLoadtime) {
        this.lastLoadtime = lastLoadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.email
     *
     * @return the value of developer_info.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.email
     *
     * @param email the value for developer_info.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.phone
     *
     * @return the value of developer_info.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.phone
     *
     * @param phone the value for developer_info.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column developer_info.company
     *
     * @return the value of developer_info.company
     *
     * @mbggenerated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column developer_info.company
     *
     * @param company the value for developer_info.company
     *
     * @mbggenerated
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}