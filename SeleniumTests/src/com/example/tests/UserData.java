package com.example.tests;


public class UserData implements Comparable<UserData>{
	public String userName;
	public String userSndName;
	public String userMainAddress;
	public String userHomeTelephone;
	public String userMobilePhone;
	public String userWorkTelephone;
	public String userEmail;
	public String userSndEmail;
	public String userBrthDay;
	public String userBrthMonth;
	public String userBrthYear;
	public String userGroupName;
	public String userSndAddress;
	public String userSndPhone;

	public UserData(String userName, String userSndName, String userMainAddress,
			String userHomeTelephone, String userMobilePhone, String userWorkTelephone,
			String userEmail, String userSndEmail, String userBrthDay, String userBrthMonth,
			String userBrthYear, String userGroupName, String userSndAddress, String userSndPhone) {
		this.userName = userName;
		this.userSndName = userSndName;
		this.userMainAddress = userMainAddress;
		this.userHomeTelephone = userHomeTelephone;
		this.userMobilePhone = userMobilePhone;
		this.userWorkTelephone = userWorkTelephone;
		this.userEmail = userEmail;
		this.userSndEmail = userSndEmail;
		this.userBrthDay = userBrthDay;
		this.userBrthMonth = userBrthMonth;
		this.userBrthYear = userBrthYear;
		this.userGroupName = userGroupName;
		this.userSndAddress = userSndAddress;
		this.userSndPhone = userSndPhone;
	}
	
	public UserData() {
	}

	@Override
	public String toString() {
		return "UserData [userName=" + userName + ", userSndName="
				+ userSndName + ", userBrthDay=" + userBrthDay
				+ ", userBrthMonth=" + userBrthMonth + ", userBrthYear="
				+ userBrthYear + ", userGroupName=" + userGroupName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userSndName == null) ? 0 : userSndName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserData other = (UserData) obj;
		if (userSndName == null) {
			if (other.userSndName != null)
				return false;
		} else if (!userSndName.equals(other.userSndName))
			return false;
		return true;
	}

	@Override
	public int compareTo(UserData other) {
		return this.userSndName.compareToIgnoreCase(other.userSndName);
	}
}