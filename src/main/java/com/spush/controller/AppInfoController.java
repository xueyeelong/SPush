package com.spush.controller;

import com.spush.pojo.AppInfo;
import com.spush.service.AppInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by STEWARD on 2016/10/25.
 */
@Controller
@RequestMapping("/appInfoController")
public class AppInfoController {
    private static final Logger LOG = LoggerFactory.getLogger(AppInfoController.class);
    @Resource
    private AppInfoService appInfoService;

    @RequestMapping("/showAppInfoById/{appid}")
    @ResponseBody
    public AppInfo showAppInfo(@PathVariable("appid") String appid) {
        AppInfo appInfo = this.appInfoService.getById(appid);
        return appInfo;
    }
    @RequestMapping("/showAppInfoToJspById/{appid}")
    public String showUser(Model model, @PathVariable("appid") String appid) {
        AppInfo appInfo = this.appInfoService.getById(appid);
        model.addAttribute("appInfo", appInfo);
        return "showAppInfo";
    }
    @RequestMapping("/test-logback")
    @ResponseBody
    public Date testLogback() {
        LOG.trace("-----------------------------------trace");
        LOG.debug("-----------------------------------debug");
        LOG.info("-----------------------------------info");
        LOG.warn("-----------------------------------warn");
        LOG.error("-----------------------------------error");
        return new Date();
    }

}
