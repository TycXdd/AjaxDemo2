package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(String name, String password) {
        System.out.println(name);
        System.out.println(password);
        if (name.equals("Xdd") && password.equals("123")) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/validateEmail")
    @ResponseBody
    public String validateEmail(String emai2) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (emai2.equals("123@qq.com")) {
            return "fail";
        } else {
            return "success";
        }

    }


}
