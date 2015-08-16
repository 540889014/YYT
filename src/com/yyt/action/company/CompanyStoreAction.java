package com.yyt.action.company;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class CompanyStoreAction extends ActionSupport{
	/**
	 * 加盟店列表
	 * @return
	 * @throws Exception
	 */
	public String companystorelist() throws Exception{
		return "storeList";
	}
	/**
	 * 完成新增加一个加盟店
	 * @return
	 * @throws Exception
	 */
	public String addstorear() throws Exception{
		return "addstore";
	}
	public String addstore() throws Exception{
		return "tostoreList";
	}
	/**
	 * 更新一个选中的加盟店
	 * @return
	 * @throws Exception
	 */
	public String updatestorear() throws Exception{
		return "updatestore";
	}
	public String updatestore() throws Exception{
		return "tostoreList";
	}
	/**
	 * 注销一个加盟店
	 * @return
	 * @throws Exception
	 */
	public String companystoreout() throws Exception{
		return "tostoreList";
	}
	/**
	 * 把一个加盟店的数据导出
	 * @return
	 * @throws Exception
	 */
	public String companyshujuout() throws Exception{
		return "";
	}
}
