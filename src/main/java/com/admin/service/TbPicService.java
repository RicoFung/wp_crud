package com.admin.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		String picName = tcDemoRowid+"_"+files[0].getOriginalFilename();
		//保存到db
		TbPic po = new TbPic();
		po.setTcDemoRowid(tcDemoRowid);
		po.setTcName(picName);
		dao.add(po);
		//保存到硬盘
		File srcFile = FileUtil.multipartFileToFile(files[0]);
		File destFile = new File(PropertiesUtil.getValue("pic.upload.path"), picName);
		FileUtils.copyFile(srcFile, destFile);
	}
	
	/**
	 * 删除硬盘图片
	 * @param tcDemoRowid
	 * @throws IOException
	 */
//	private void delPicFileByTcDemoRowid(Long tcDemoRowid) throws IOException 
//	{
//		Map<String, Object> m = new HashMap<String, Object>();
//		List<TbPic> list = dao.query(m);
//		for(int i=0; i<list.size(); i++)
//		{
//			File f = new File(list.get(i).getTcName());
//			if(f.exists()) FileUtils.forceDelete(f);
//		}
//	}
}
