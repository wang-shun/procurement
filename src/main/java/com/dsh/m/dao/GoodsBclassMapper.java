package com.dsh.m.dao;

import com.dsh.m.model.GoodsBclass;
import com.dsh.m.model.GoodsBclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBclassMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int countByExample(GoodsBclassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int deleteByExample(GoodsBclassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int deleteByPrimaryKey(Integer bclassid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int insert(GoodsBclass record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int insertSelective(GoodsBclass record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	List<GoodsBclass> selectByExample(GoodsBclassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	GoodsBclass selectByPrimaryKey(Integer bclassid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int updateByExampleSelective(@Param("record") GoodsBclass record,
			@Param("example") GoodsBclassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int updateByExample(@Param("record") GoodsBclass record,
			@Param("example") GoodsBclassExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int updateByPrimaryKeySelective(GoodsBclass record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_bclass
	 * @mbggenerated  Sat Aug 08 16:55:26 CST 2015
	 */
	int updateByPrimaryKey(GoodsBclass record);
}