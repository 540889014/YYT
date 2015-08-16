package com.yyt.orm.company;
/**
 * 添加儿歌
 * @author java_one
 *
 */
public class ChildrenMusic implements java.io.Serializable {
	private Integer id;
	private String title;
	private String url;
	public ChildrenMusic(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
