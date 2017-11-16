package com.movehouse.dao;

import com.movehouse.entity.Businessmen;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * date : 2017-10-03 18:34:31
 * author : mapper generator
 * description : BusinessmenDao数据库操作接口类
 * 
 **/
public interface BDao {

	/**
	 * 查询所有
	 */
	List<Businessmen> busLookUp();

	/**
	 * 商家详情
	 */
	Businessmen busDetalis(@Param("id") String id);

	/**
	 * 增加商家
	 */
	int addBus(@Param("bus") Businessmen bus);

	/**
	 * 修改
	 */
	int modifyBus(@Param("businessmen") Businessmen businessmen);

	/**
	 * 注册的商家
	 */
	Businessmen busCnt();

	/**
	 * 删除
	 */
	int delBus(@Param("id") String id);

}