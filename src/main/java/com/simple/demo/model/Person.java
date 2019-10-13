package com.simple.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;


/**
 * 将配置文件中的配置的每一个属性值，映射到组件中
 * @ConfigurationProperties: 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定。
 *      prefix: 配置文件中的prefix指定的属性下的所有属性与该组件属性一一对应。
 *
 * @ConfigurationProperties: 默认从全局配置文件中获取值
 *
 * 只有这个组件是容器中的组件，容器才能提供@ConfigurationProperties功能。
 */

@Component
@ConfigurationProperties(prefix = "person")
public class Person implements Serializable {

    public String name;
    public Integer age;
    public boolean boss;
    public Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
