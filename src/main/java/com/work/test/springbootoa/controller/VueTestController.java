package com.work.test.springbootoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xuying
 * @Date 2022/3/18 9:48
 * @Description
 * @Version 1.0.0
 **/
@Controller
public class VueTestController {

    @RequestMapping("index")
    public  String index(String aNetToken , Model model)
    {
        aNetToken="TEST";
        model.addAttribute("aNetToken",aNetToken);
        return "vue/index.html";
    }
}
