/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public class User implements Serializable{

	private static final long serialVersionUID = 7790622876833971743L;
	
	private Integer userid;
	private Integer roleid;
	private String rolename;
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private String isactive;
	private Date regdate;
	private String isnonexpired;
	private String isnonlocked;
	private Date expDate;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getIsnonexpired() {
		return isnonexpired;
	}

	public void setIsnonexpired(String isnonexpired) {
		this.isnonexpired = isnonexpired;
	}

	public String getIsnonlocked() {
		return isnonlocked;
	}

	public void setIsnonlocked(String isnonlocked) {
		this.isnonlocked = isnonlocked;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

}
