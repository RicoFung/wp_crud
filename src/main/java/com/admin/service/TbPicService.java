package com.admin.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.admin.dao.TbPicDao;
import com.admin.entity.TbPic;

import chok.devwork.springboot.BaseDao;
import chok.devwork.springboot.BaseService;
import chok.util.FileUtil;
import chok.util.PropertiesUtil;

@Service
public class TbPicService extends BaseService<TbPic,Long>
{
	@Autowired
	private TbPicDao dao;

	@Override
	public BaseDao<TbPic,Long> getEntityDao() 
	{
		return dao;
	}
	
	public void upload(CommonsMultipartFile files[], Long tcDemoRowid) throws IOException
	{
		//保存到db
		TbPic po = new TbPic();
		dao.add(po);
		po.setTcDemoRowid(tcDemoRowid);
		po.setTcName(po.getTcRowid()+"_"+po.getTcDemoRowid()+"_"+files[0].getOriginalFilename());
		dao.upd(po);
		//保存到硬盘
		File srcFile = FileUtil.multipartFileToFile(files[0]);
		File destFile = new File(PropertiesUtil.getValue("pic.upload.path"), po.getTcName());
		FileUtils.copyFile(srcFile, destFile);
	}
	
	@Override
	public void del(Long[] tcRowids)
	{
		try 
		{
			for(Long tcRowid: tcRowids)
			{
				TbPic po = dao.get(tcRowid);
				File f = new File(PropertiesUtil.getValue("pic.upload.path")+po.getTcName());
				if(f.exists()) FileUtils.forceDelete(f);
				dao.del(tcRowid);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
