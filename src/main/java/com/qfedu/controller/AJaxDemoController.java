package com.qfedu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AJaxDemoController {


    @RequestMapping(value = "/ajaxDemo", method = RequestMethod.POST)
    @ResponseBody
    public String ajaxDemo() {
        return "success";
    }

    @RequestMapping(value = "/ajaxDemoWithParms")
    @ResponseBody
    public String ajaxDemoWithParams(String username, Integer age) {
        System.out.println(username);
        System.out.println(age);

        return "success";
    }
}
