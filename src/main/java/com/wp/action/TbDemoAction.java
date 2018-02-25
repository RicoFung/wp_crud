package com.wp.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import chok.devwork.BaseController;
import chok.util.CollectionUtil;
import com.wp.service.TbDemoService;
import com.wp.entity.TbDemo;

@Scope("prototype")
@Controller
@RequestMapping("/wp/tbdemo")
public class TbDemoAction extends BaseController<TbDemo>
{
	@Autowired
	private TbDemoService service;
	
	@RequestMapping("/add")
	public String add() 
	{
		put("queryParams",req.getParameterValueMap(false, true));
		return "/wp/tbdemo/add.jsp";
	}
	@RequestMapping("/add2")
	public void add2(TbDemo po) 
	{
		try
		{
			service.add(po);
			print("1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			print("0:" + e.getMessage());
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
	public String upd() 
	{
		put("po", service.get(req.getLong("id")));
		put("queryParams",req.getParameterValueMap(false, true));
		return "/wp/tbdemo/upd.jsp";
	}
	@RequestMapping("/upd2")
	public void upd2(TbDemo po) 
	{
		try
		{
			service.upd(po);
			print("1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			print("0:" + e.getMessage());
		}
	}

	@RequestMapping("/get")
	public String get() 
	{
		put("po",service.get(req.getLong("id")));
		put("queryParams",req.getParameterValueMap(false, true));
		return "/wp/tbdemo/get.jsp";
	}

	@RequestMapping("/query")
	public String query() 
	{
		put("queryParams",req.getParameterValueMap(false, true));
		return "/wp/tbdemo/query.jsp";
	}
	
	@RequestMapping("/query2")
	public void query2()
	{
		Map<String, Object> m = req.getParameterValueMap(false, true);
		result.put("total",service.getCount(m));
		result.put("rows",service.query(req.getDynamicSortParameterValueMap(m)));
		printJson(result.getData());
	}
	
	@RequestMapping("/exp")
	public void exp()
	{
		Map<String, Object> m = req.getParameterValueMap(false, true);
		List<TbDemo> list = service.query(m);
		exp(list, "xlsx");
	}
}
