package com.movehouse.controller;

import com.alibaba.fastjson.JSON;
import com.movehouse.entity.Businessmen;
import com.movehouse.entity.ImgUrl;
import com.movehouse.service.BackEndService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eminem on 2017/10/12.
 */
@Controller
public class BackEndController {

    @Autowired
    private BackEndService backEndService;

    //修改
    @ResponseBody
    @RequestMapping(value = "/modifybus")
    public String modifyBus(Businessmen businessmen){;
        int res = backEndService.modifyBus(businessmen);
        return JSON.toJSONString(res);
    }

    @ResponseBody
    @RequestMapping(value = "/jumpaddimg")
    public String jumpAddImg(){
        ImgUrl imgUrl = backEndService.imgCnt();
        return JSON.toJSONString(imgUrl.getBusid());
    }

    //删除
    @ResponseBody
    @RequestMapping(value = "/delbus",method = RequestMethod.GET)
    public String delBus(String id){
        int res = backEndService.delBus(id);
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("result",res);
        return JSON.toJSONString(res);
    }

    @RequestMapping(value = "/jumpaddbus")
    public String jumpAddBus(){
        return "addBus";
    }

    //添加商家
    @RequestMapping(value = "/addbus",method = RequestMethod.POST)
    public String addBus(Businessmen businessmen,
                         @RequestParam(value = "busLogo",required = false) MultipartFile busLogo,
                         HttpServletRequest request) throws IOException {
        businessmen.setBusLogo(busLogo.getOriginalFilename());
        int res = backEndService.addBus(businessmen);
        if (res>0){
            String path = request.getSession().getServletContext().getRealPath("upload/logo");
            File dir = new File(path,busLogo.getOriginalFilename());
            FileUtils.copyInputStreamToFile(busLogo.getInputStream(),dir);
            if (!dir.exists()){
                dir.mkdir();
            }
            busLogo.transferTo(dir);
            return "success";
        }else{
            return "error";
        }
    }

}