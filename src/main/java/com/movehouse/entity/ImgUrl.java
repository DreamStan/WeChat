package com.movehouse.entity;

/**
 * Created by Eminem on 2017/10/11.
 */
public class ImgUrl {

    private int id;
    private String busid;
    private String imgurl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusid() {
        return busid;
    }

    public void setBusid(String busid) {
        this.busid = busid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public ImgUrl() {
    }

    public ImgUrl(int id, String busid, String imgurl) {
        this.id = id;
        this.busid = busid;
        this.imgurl = imgurl;
    }
}
