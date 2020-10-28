package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class First2Controller {

    @RequestMapping("/first2")
    public String first2(Model model){
        List list = new ArrayList<>();

        User user1 = new User();
        user1.setId(1);
        user1.setName("小花");
        user1.setAge(16);

        User user2 = new User();
        user2.setId(2);
        user2.setName("小花2");
        user2.setAge(17);

        User user3 = new User();
        user3.setId(3);
        user3.setName("小花3");
        user3.setAge(18);

        User user4 = new User();
        user4.setId(4);
        user4.setName("小花4");
        user4.setAge(19);

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        model.addAttribute("list", list);

        return "index2";
    }
}
