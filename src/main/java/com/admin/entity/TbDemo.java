package com.admin.entity;

/**
 *
 * @author rico
 * @version 1.0
 * @since 1.0
 * */
public class TbDemo implements java.io.Serializable
{
    // tcRowid       db_column: tc_rowid 
	private java.lang.Long tcRowid;
    // tcPic       db_column: tc_pic 
	private java.lang.String tcPic;
    // tcName       db_column: tc_name 
	private java.lang.String tcName;
    // tcPrice       db_column: tc_price 
	private java.lang.Double tcPrice;
    // tcDate       db_column: tc_date 
	private java.lang.String tcDate;

	public TbDemo(){
	}

	public TbDemo(
		java.lang.Long tcRowid,
		java.lang.String tcPic,
		java.lang.String tcName,
		java.lang.Double tcPrice,
		java.lang.String tcDate
	)
	{
		this.tcRowid = tcRowid;
		this.tcPic = tcPic;
		this.tcName = tcName;
		this.tcPrice = tcPrice;
		this.tcDate = tcDate;
	}

	public void setTcRowid(java.lang.Long value) 
	{
		this.tcRowid = value;
	}
	
	public java.lang.Long getTcRowid() 
	{
		return this.tcRowid;
	}
	public void setTcPic(java.lang.String value) 
	{
		this.tcPic = value;
	}
	
	public java.lang.String getTcPic() 
	{
		return this.tcPic;
	}
	public void setTcName(java.lang.String value) 
	{
		this.tcName = value;
	}
	
	public java.lang.String getTcName() 
	{
		return this.tcName;
	}
	public void setTcPrice(java.lang.Double value) 
	{
		this.tcPrice = value;
	}
	
	public java.lang.Double getTcPrice() 
	{
		return this.tcPrice;
	}
	public void setTcDate(java.lang.String value) 
	{
		this.tcDate = value;
	}
	
	public java.lang.String getTcDate() 
	{
		return this.tcDate;
	}
}

