package com.spush.mapper;

import com.spush.pojo.AppUser;

public interface AppUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated
     */
    int insert(AppUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated
     */
    int insertSelective(AppUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated
     */
    AppUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppUser record);
}