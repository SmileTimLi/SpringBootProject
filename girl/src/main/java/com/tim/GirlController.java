package com.tim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** 设计RESTful API设计
 * Created by Admin on 2017/2/28.
 */
@RestController
@EnableAutoConfiguration
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /** 请求类型--GET
     * 查询全部bean的信息
     * @return
     */
    @GetMapping(value="/girls")
    public List<Girl> girlList(){

        return girlRepository.findAll();

    }

    /**请求类型--POST
     * 添加成员的信息
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value="/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);

    }

    // 查询一个女生 请求类型--GET
    @GetMapping(value="/girls/{id}")
    public Girl girlFindOne(@RequestParam("id") Integer id){
        return girlRepository.findOne(id);
    }

    //更新操作 请求类型--PUT
    @PutMapping(value="/girls/{id}")
    public Girl girlUpdate(@RequestParam("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    //删除 请求类型--DELETE
    @DeleteMapping(value="/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }


    @GetMapping(value="/girls/age/{age}")
    public List<Girl> girlFiddByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

}
























