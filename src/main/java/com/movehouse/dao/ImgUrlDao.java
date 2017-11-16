package com.movehouse.dao;

import com.movehouse.entity.ImgUrl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Eminem on 2017/10/11.
 */
public interface ImgUrlDao {

    //添加宣传图
    int addImg(@Param("imgUrl") ImgUrl imgUrl);

    //显示宣传图
    List<ImgUrl> showImg();

    //显示三张宣传图
    ImgUrl imgCnt();

}
