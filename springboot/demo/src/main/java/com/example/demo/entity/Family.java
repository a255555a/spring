package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
//@ConfigurationProperties(prefix = "family")   //表示配置的整体前缀
public class Family {

    //成员变量名称要和yml配置项key一一对应
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}