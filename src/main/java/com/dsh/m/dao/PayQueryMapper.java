package com.dsh.m.dao;

import com.dsh.m.model.PayQuery;
import com.dsh.m.model.PayQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayQueryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int countByExample(PayQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int deleteByExample(PayQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int insert(PayQuery record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int insertSelective(PayQuery record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	List<PayQuery> selectByExample(PayQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	PayQuery selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByExampleSelective(@Param("record") PayQuery record,
			@Param("example") PayQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByExample(@Param("record") PayQuery record,
			@Param("example") PayQueryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByPrimaryKeySelective(PayQuery record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_query
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByPrimaryKey(PayQuery record);
}