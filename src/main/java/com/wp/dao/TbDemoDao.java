package com.wp.dao;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import chok.devwork.springboot.BaseDao;
import com.wp.entity.TbDemo;

@Repository
public class TbDemoDao extends BaseDao<TbDemo,Long>
{
	@Resource//(name = "firstSqlSessionTemplate")
	private SqlSession sqlSession;

	@Override
	protected SqlSession getSqlSession()
	{
		return sqlSession;
	}
	
	@Override
	public Class<TbDemo> getEntityClass()
	{
		return TbDemo.class;
	}
}
