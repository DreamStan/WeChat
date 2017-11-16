package com.movehouse.service;

import com.movehouse.entity.Businessmen;
import com.movehouse.entity.ImgUrl;
import com.movehouse.entity.User;

import java.util.List;

/**
 * Created by Eminem on 2017/10/3.
 */
public interface IndexService {

    List<Businessmen> busLookUp();

    Businessmen busDetalis(String id);

    User login(User user);

    List<ImgUrl> showImg();

    Businessmen busCnt();

    int addImg(ImgUrl imgUrl);
}
