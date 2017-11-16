package com.movehouse.controller;

import com.alibaba.fastjson.JSON;
import com.movehouse.entity.Businessmen;
import com.movehouse.entity.ImgUrl;
import com.movehouse.entity.User;
import com.movehouse.service.IndexService;
import com.movehouse.service.impl.IndexServiceImpl;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Eminem on 2017/10/2.
 */
@Controller
public class IndexController {

    private static final int COOKIE_MAX_AGE = 60;

    @Autowired
    private IndexService indexService;

    private static String checkLogin = null;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String index(HttpServletResponse response,HttpSession session, User user,boolean remMe){
        User u = indexService.login(user);
        Businessmen cnt = indexService.busCnt();
        if (u!=null) {
            if (remMe){
                Cookie name = new Cookie("LOGINNAME",user.getUname());
                name.setMaxAge(COOKIE_MAX_AGE);
                name.setPath("/");
                response.addCookie(name);
                session.setAttribute("name",user.getUname());
                session.setAttribute("busCnt",cnt.getId());
                checkLogin = u.getUname();
                return "index";
            }else{
                session.setAttribute("name",user.getUname());
                session.setAttribute("busCnt",cnt.getId());
                return "index";
            }
        }else {
            return "login";
        }
    }

    @RequestMapping(value = "/back")
    public String back(){
        return "login";
    }

    //所有商家
    @RequestMapping(value = "/allbus")
    public String allBus(){
        return "data";
    }

    //页面显示所有商家
    @RequestMapping(value = "/busallbus")
    public String busAllBus(HttpSession session){
        List<Businessmen> list = indexService.busLookUp();
        session.setAttribute("uname",checkLogin);
        session.setAttribute("busList",list);
        return "data";
    }

    //文件上传
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(String id, @RequestParam(value = "busImg",required = false) MultipartFile busImg,
                         HttpServletRequest request) throws IOException {
        ImgUrl imgUrl = new ImgUrl();
        imgUrl.setBusid(id);
        imgUrl.setImgurl(busImg.getOriginalFilename());
        int res = indexService.addImg(imgUrl);
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("result",res);
        if (res>0){
            String path = request.getSession().getServletContext().getRealPath("upload/publicity");
            File dir = new File(path,busImg.getOriginalFilename());
            FileUtils.copyInputStreamToFile(busImg.getInputStream(),dir);
            if (!dir.exists()){
                dir.mkdir();
            }
            busImg.transferTo(dir);
        }
        return JSON.toJSONString(map);
    }
}