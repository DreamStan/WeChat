package com.movehouse.service.impl;

import com.movehouse.dao.BDao;
import com.movehouse.dao.ImgUrlDao;
import com.movehouse.dao.UserDao;
import com.movehouse.entity.Businessmen;
import com.movehouse.entity.ImgUrl;
import com.movehouse.entity.User;
import com.movehouse.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Eminem on 2017/10/3.
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private BDao bDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ImgUrlDao imgUrlDao;


    public List<Businessmen> busLookUp() {
        return bDao.busLookUp();
    }

    public Businessmen busDetalis(String id) {
        return bDao.busDetalis(id);
    }

    public User login(User user) {
        return userDao.login(user);
    }

    public int addBus(Businessmen bus) {
        return bDao.addBus(bus);
    }

    public List<ImgUrl> showImg() {
        return imgUrlDao.showImg();
    }

    public Businessmen busCnt() {
        return bDao.busCnt();
    }

    public int addImg(ImgUrl imgUrl) {
        return imgUrlDao.addImg(imgUrl);
    }
}
