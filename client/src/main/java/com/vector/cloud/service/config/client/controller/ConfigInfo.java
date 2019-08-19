/**
 * @create 2019-08-16 16:13
 * @desc read config center config info
 **/
package com.vector.cloud.service.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigInfo {

    @Value("${vector.config.info}")
    private String configInformation;


    @GetMapping(value = "/getConfigInfo")
    public String getConfigInformation() {
        return configInformation;
    }

}

