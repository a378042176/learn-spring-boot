package com.jgp.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Controller + @ResponseBody = @RestController
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;

    //    @PostMapping("/say")
//    @RequestMapping("/say") //get和post都行
    @PostMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return " 说明:" + limitConfig.getDescription();
//        return "index";
        return id.toString();
    }
}
