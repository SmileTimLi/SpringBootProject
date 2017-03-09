package com.tim;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 一旦JpaRepository接口创建成功，Boot的spring-data-jpa层会在工程中探测到，并将其添加到Spring应用上下文中，这样对Controller和service
 * 来说，就可以进行自动注入的可选对象，@EnableAutoConfiguration标识
 *
 * 使用jpa需要提前新建一个数据库并继承JpaRepository接口
 *
 * Created by Admin on 2017/2/28.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //以上不用写接口
//    // 通过年龄查找Girl
    public List<Girl> findByAge(Integer age);
}













