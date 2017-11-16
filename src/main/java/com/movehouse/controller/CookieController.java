package com.movehouse.controller;

import com.movehouse.entity.User;
import com.movehouse.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Eminem on 2017/11/4.
 */
@Controller
public class CookieController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/checkcookie",method = RequestMethod.POST)
    public String checkCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (cookies!=null){
            for (Cookie cookie : cookies){
//                User user = new User();
//                user.setUname(cookie.getValue());
//                User u = indexService.login(user);
//                if (u!=null){
                    if (cookie.getName().equals("LOGINNAME")){
//                        System.out.println("cookie:"+cookie.getValue());
                        return "index";
                    }
//                }
            }
            return "login";
        }else{
            return "login";
        }
    }
}
