package com.tim;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** 实体类
 *  注意：前缀不能加斜线
 * Created by Admin on 2017/2/27.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupSize;

    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlProperties{" +
                "cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
