package com.adonayg.domain;

public class AccountMessage {
	private String account;
	private String date;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Account [account=" + account + ", date=" + date + "]";
	}

}
