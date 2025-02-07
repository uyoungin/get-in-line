package com.uno.getinline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //spring container에서 Bean으로 등록
public class BaseController implements ErrorController { //여기서 에러페이지를 구현하겠다

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}
