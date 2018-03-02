package com.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.TbDemoDao;
import com.admin.entity.TbDemo;

import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;

@Service
public class TbDemoService extends BaseService<TbDemo,Long>
{
	@Autowired
	private TbDemoDao dao;

	@Override
	public BaseDao<TbDemo,Long> getEntityDao() 
	{
		return dao;
	}
}
