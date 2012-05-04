/*******************************************************************************
 * Copyright 2012, The Infinit.e Open Source Project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.ikanow.infinit.e.data_model.api.authentication;

import java.util.List;

import com.ikanow.infinit.e.data_model.api.BaseApiPojo;

public class WordPressUserPojo extends BaseApiPojo
{
	private String WPUserID = null; // (optional, defaults to email[0] if not specified, in which case this must be unique)
	private String created = null; // (optional)
	private String modified = null; // (optional)
	private String firstname = null; // (optional, one of firstname/lastname must be specified)
	private String lastname = null; // (optional, one of firstname/lastname must be specified)
	private String phone = null; // (optional)
	private String mobile = null; // (optional)
	private String SubscriptionID = null; // (optional)
	private String SubscriptionTypeID = null; // (optional)
	private String SubscriptionStartDate = null; // (optional)
	private String SubscriptionEndDate = null; // (optional)
	private List<String> email = null; //(at least one must be specified)
	
	public void setWPUserID(String wPUserID) {
		WPUserID = wPUserID;
	}
	public String getWPUserID() {
		return WPUserID;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getCreated() {
		return created;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getModified() {
		return modified;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return mobile;
	}
	public void setSubscriptionID(String subscriptionID) {
		SubscriptionID = subscriptionID;
	}
	public String getSubscriptionID() {
		return SubscriptionID;
	}
	public void setSubscriptionTypeID(String subscriptionTypeID) {
		SubscriptionTypeID = subscriptionTypeID;
	}
	public String getSubscriptionTypeID() {
		return SubscriptionTypeID;
	}
	public void setSubscriptionStartDate(String subscriptionStartDate) {
		SubscriptionStartDate = subscriptionStartDate;
	}
	public String getSubscriptionStartDate() {
		return SubscriptionStartDate;
	}
	public void setSubscriptionEndDate(String subscriptionEndDate) {
		SubscriptionEndDate = subscriptionEndDate;
	}
	public String getSubscriptionEndDate() {
		return SubscriptionEndDate;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public List<String> getEmail() {
		return email;
	}
}