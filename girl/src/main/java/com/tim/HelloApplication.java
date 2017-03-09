package com.tim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** required设置是否必传
 * Created by Admin on 2017/2/27.
 */
@RestController
public class HelloApplication {

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping(value="/myId")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
      return "id:"+id;
    }
}
