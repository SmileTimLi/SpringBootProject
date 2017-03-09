package com.tim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 需要添加dependency依赖，index.htmlgvn
 *
 * Created by Admin on 2017/2/27.
 */
@Controller
@ResponseBody
public class TemplateApplication {

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping(value="/hi")
    public String say(){

        return "index";
    }
}
