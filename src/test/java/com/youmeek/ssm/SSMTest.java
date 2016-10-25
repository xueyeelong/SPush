package com.youmeek.ssm;

import com.spush.pojo.AppInfo;
import com.spush.service.AppInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SSMTest {


    @Resource
    private AppInfoService appInfoService;

    @Test
    public void test2() {
        AppInfo appInfo = appInfoService.getById("001");
        System.out.println(appInfo.toString());
    }
}
