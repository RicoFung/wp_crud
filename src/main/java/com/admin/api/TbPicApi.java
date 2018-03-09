package com.admin.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.admin.entity.TbPic;
import com.admin.service.TbPicService;

import chok.devwork.BaseController;

@Scope("prototype")
@Controller
@RequestMapping("/admin/api/tbpic")
public class TbPicApi extends BaseController<TbPic>
{
	@Autowired
	private TbPicService service;

	@RequestMapping("/upload")
	public void upload(@RequestParam("myFile") CommonsMultipartFile files[])
	{
		try
		{
			// 上传
			service.upload(files, req.getLong("tcDemoRowid"));
			// 返回列表
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("tcDemoRowid", req.getLong("tcDemoRowid"));
			result.put("rows", service.query(m));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		printJson(result);
	}
	
	@RequestMapping("/query")
	public void query()
	{
		try
		{
			result.put("rows",service.query(req.getParameterValueMap(false, true)));
			printJson(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result.setSuccess(false);
			result.setMsg(e.getMessage());
			printJson(result);
		}
	}
}
