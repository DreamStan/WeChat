package com.movehouse.dao;
import com.movehouse.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * date : 2017-10-10 16:37:31
 * author : mapper generator
 * description : UserDao数据库操作接口类
 * 
 **/
public interface UserDao{

	/**
	 * 新增记录
	 **/
	int insert(@Param("pojo") User pojo);

	/**
	 * 登录
	 */
	User login(@Param("user") User user);

}