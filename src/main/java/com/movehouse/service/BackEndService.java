package com.movehouse.service;

import com.movehouse.entity.Businessmen;
import com.movehouse.entity.ImgUrl;

/**
 * Created by Eminem on 2017/10/12.
 */
public interface BackEndService {

    int modifyBus(Businessmen businessmen);

    int addImg(ImgUrl imgUrl);

    ImgUrl imgCnt();

    int delBus(String id);

    int addBus(Businessmen businessmen);

}
