package com.spush.service.impl;

import com.spush.mapper.AppInfoMapper;
import com.spush.pojo.AppInfo;
import com.spush.service.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by STEWARD on 2016/10/24.
 */
@Service
public class AppInfoServiceImpl implements AppInfoService {

    @Resource
    private AppInfoMapper appInfoMapper;

    @Override
    public AppInfo getById(String id) {
        return appInfoMapper.selectByPrimaryKey(id);
    }
}
