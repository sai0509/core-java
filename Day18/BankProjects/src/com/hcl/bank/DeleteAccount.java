package com.hcl.bank;

public class DeleteAccount {
	private int accno;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String deleteAccount() {
		return AccountBaL.deleteAcountBal(accno);
	}
}
