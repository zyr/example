package com.example.tests;


public class UserData {
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
}