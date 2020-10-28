package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","我叫三菱鹏");

        /*实体类*/
        User user = new User();
        user.setId(1);
        user.setName("小花");
        user.setAge(16);
        model.addAttribute("user",user);

        /*map的类*/
        Map map = new HashMap();
        map.put("id",1);
        map.put("name","小白");
        map.put("age",17);
        model.addAttribute("map",map);

        /*加载图片*/
        Map map1 = new HashMap();
        map1.put("imgs","3.jpg");
        model.addAttribute("map1",map1);




        return "index";
    }
}
