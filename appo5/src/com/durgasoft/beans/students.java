package com.durgasoft.beans;

public class students {
private String sid;
private String sname;
private String saddrs;
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddrs() {
	return saddrs;
}
public void setSaddrs(String saddrs) {
	this.saddrs = saddrs;
}
public void getdetails()
{
	System.out.println("studen details");
	System.out.println("----------------------");
	System.out.println("stuent id:"+sid);
	System.out.println("stuent id:"+sname);
	System.out.println("stuent id:"+saddrs);

}

}
