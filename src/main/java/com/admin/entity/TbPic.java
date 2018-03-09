package com.admin.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbPic implements java.io.Serializable
{
    // tcRowid       db_column: tc_rowid 
	private java.lang.Long tcRowid;
    // tcDemoRowid       db_column: tc_demo_rowid 
	private java.lang.Long tcDemoRowid;
    // tcName       db_column: tc_name 
	private java.lang.String tcName;

	public TbPic(){
	}

	public TbPic(
		java.lang.Long tcRowid,
		java.lang.Long tcDemoRowid,
		java.lang.String tcName
	)
	{
		this.tcRowid = tcRowid;
		this.tcDemoRowid = tcDemoRowid;
		this.tcName = tcName;
	}

	public void setTcRowid(java.lang.Long value) 
	{
		this.tcRowid = value;
	}
	
	public java.lang.Long getTcRowid() 
	{
		return this.tcRowid;
	}
	public void setTcDemoRowid(java.lang.Long value) 
	{
		this.tcDemoRowid = value;
	}
	
	public java.lang.Long getTcDemoRowid() 
	{
		return this.tcDemoRowid;
	}
	public void setTcName(java.lang.String value) 
	{
		this.tcName = value;
	}
	
	public java.lang.String getTcName() 
	{
		return this.tcName;
	}
}

