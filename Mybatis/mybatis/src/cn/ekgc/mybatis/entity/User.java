package cn.ekgc.mybatis.entity;

import java.io.Serializable;
import java.sql.Date;



public class User implements Serializable {

	private static final long serialVersionUID =1L;
	private Long userId;
	private String username;
	private String cellphone;
	private Date createTime;
	private Date updateTime;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(String username, String cellphone) {
		this.username = username;
		this.cellphone = cellphone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public User(Long userId, String username, String cellphone) {
		this.userId = userId;
		this.username = username;
		this.cellphone = cellphone;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
