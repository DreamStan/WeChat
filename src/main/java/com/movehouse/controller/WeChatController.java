package com.movehouse.controller;

import com.alibaba.fastjson.JSON;
import com.movehouse.entity.Businessmen;
import com.movehouse.entity.ImgUrl;
import com.movehouse.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Eminem on 2017/10/18.
 */
@Controller
public class WeChatController {

    @Autowired
    private IndexService indexService;

    //显示宣传图
    @RequestMapping(value = "/showlogo",method = RequestMethod.GET,produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showLogo(){
        List<ImgUrl> list = indexService.showImg();
        return JSON.toJSONString(list);
    }

    //商家详情
    @ResponseBody
    @RequestMapping(value = "/busdetalis",method = RequestMethod.GET,produces = "text/json;charset=UTF-8")
    public String busDetalis(HttpServletRequest request){
        String id = request.getParameter("id");
        Businessmen busDetalis = indexService.busDetalis(id);
        return JSON.toJSONString(busDetalis);
    }

    //显示所有商家
    @ResponseBody
    @RequestMapping(value = "/buslist",method = RequestMethod.GET,produces = "text/json;charset=UTF-8")
    public String busList(){
        List<Businessmen> list = indexService.busLookUp();
        return JSON.toJSONString(list);
    }

}
