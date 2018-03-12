package com.admin.service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.TbDemoDao;
import com.admin.dao.TbPicDao;
import com.admin.entity.TbDemo;
import com.admin.entity.TbPic;

import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import chok.util.PropertiesUtil;

@Service
public class TbDemoService extends BaseService<TbDemo,Long>
{
	@Autowired
	private TbDemoDao dao;
	@Autowired
	private TbPicDao picDao;

	@Override
	public BaseDao<TbDemo,Long> getEntityDao() 
	{
		return dao;
	}
	
	@Override
	public void del(Long[] tcRowids)
	{
		try
		{
			for(Long tcRowid : tcRowids)
			{
				// 删图片记录
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("tcDemoRowid", tcRowid);
				List<TbPic> picList = picDao.query(m);
				for(TbPic pic: picList)
				{
					File f = new File(PropertiesUtil.getValue("pic.upload.path")+pic.getTcName());
					if(f.exists()) FileUtils.forceDelete(f);
					picDao.del(pic.getTcRowid());
				}
				// 删主表记录
				dao.del(tcRowid);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
