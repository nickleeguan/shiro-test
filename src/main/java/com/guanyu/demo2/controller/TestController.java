package com.guanyu.demo2.controller;

import com.guanyu.demo2.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam(value = "username") String username,
                            @RequestParam(value = "password") String password,
                            HttpSession session){
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(token);
            User user = (User) subject.getPrincipal();
            session.setAttribute("user", user);
            return "index";
        }catch (Exception e){
            return "login";
        }
    }
}
