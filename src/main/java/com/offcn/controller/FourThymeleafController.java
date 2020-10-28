package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class FourThymeleafController {

    @RequestMapping("/four")
    public String four(Model model) {
        model.addAttribute("name", "三菱鹏");
        model.addAttribute("href", "http://www.baidu.com");
        return "index3";
    }

    @RequestMapping("/four2")
    public String four2(Model model) {
        model.addAttribute("flag", "no");
        return "index4";
    }

    @RequestMapping("/four3")
    public String four3(Model model) {
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index5";
    }

    /*集成Thymeleaf 表达式内置对象使用*/
    @RequestMapping("/four4")
    public String four4(Model model) {
        //1.日期时间
        Date date = new Date();
        model.addAttribute("date", date);
        //2.小数金额
        double price = 128.5678D;
        model.addAttribute("price", price);
        //3.定义大文本数据
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n";
        model.addAttribute("strText", str);
        //4.定义字符串
        String str2 = "JAVA-offcn";
        model.addAttribute("str2", str2);

        return "index6";
    }


}
