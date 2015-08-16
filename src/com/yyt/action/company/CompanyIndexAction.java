package com.yyt.action.company;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class CompanyIndexAction extends ActionSupport{
	
	public String company_top() throws Exception{
		return "companytop";
	}
	public String company_left() throws Exception{
		return "companyleft";
	}
	public String company_center() throws Exception{
		return "companycenter";
	}
	public String company_main() throws Exception{
		return "companymain";
	}
	
}
