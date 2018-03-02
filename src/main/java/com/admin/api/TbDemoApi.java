package com.admin.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.entity.TbDemo;
import com.admin.service.TbDemoService;

import chok.devwork.BaseController;
import chok.util.CollectionUtil;

@Scope("prototype")
@Controller
@RequestMapping("/admin/api/tbdemo")
public class TbDemoApi extends BaseController<TbDemo>
{
	@Autowired
	private TbDemoService service;
	
	@RequestMapping("/add")
	public void add(TbDemo po) 
	{
		try
		{
			service.add(po);
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
	
	@RequestMapping("/del")
	public void del() 
	{
		try
		{
			service.del(CollectionUtil.toLongArray(req.getLongArray("id[]", 0l)));
			result.setSuccess(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		printJson(result);
	}
	
	@RequestMapping("/upd")
	public void upd(TbDemo po) 
	{
		try
		{
			service.upd(po);
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

	@RequestMapping("/get")
	public void get() 
	{
		try
		{
			result.put("po", service.get(req.getLong("tcRowid")));
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
	
	@RequestMapping("/query")
	public void query()
	{
		try
		{
			Map<String, Object> m = req.getParameterValueMap(false, true);
			result.put("total",service.getCount(m));
			result.put("rows",service.query(req.getDynamicSortParameterValueMap(m)));
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
