package com.movehouse.service.impl;

import com.movehouse.dao.BDao;
import com.movehouse.dao.ImgUrlDao;
import com.movehouse.entity.Businessmen;
import com.movehouse.entity.ImgUrl;
import com.movehouse.service.BackEndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Eminem on 2017/10/12.
 */
@Service("backEndService")
public class BackEndServiceImpl implements BackEndService {

    @Autowired
    private ImgUrlDao imgUrlDao;

    @Autowired
    private BDao bDao;

    public int modifyBus(Businessmen businessmen) {
        return bDao.modifyBus(businessmen);
    }

    public int addImg(ImgUrl imgUrl) {
        return imgUrlDao.addImg(imgUrl);
    }

    public ImgUrl imgCnt() {
        return imgUrlDao.imgCnt();
    }

    public int delBus(String id) {
        return bDao.delBus(id);
    }

    public int addBus(Businessmen businessmen) {
        return bDao.addBus(businessmen);
    }
}
