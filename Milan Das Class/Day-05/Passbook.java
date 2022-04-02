package j4g03.day05;

import java.io.Serializable;

public class Passbook implements Serializable {
	private static final long serialVersionUID = 1L;

	public int account_no;
	public String account_name;
	public String bank_name;
	public String ifs_code;

	public Passbook() {
		account_no = 0;
		account_name = "Not told";
		bank_name = "Not told";
		ifs_code = "Unknown";
	}

	public Passbook(int account_no, String account_name, String bank_name, String ifs_code) {
		this.account_no = account_no;
		this.account_name = account_name;
		this.bank_name = bank_name;
		this.ifs_code = ifs_code;
	}
}
