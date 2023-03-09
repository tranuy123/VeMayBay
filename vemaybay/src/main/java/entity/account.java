package entity;

public class account {
	private String sdt ; 
	private String email ; 
	private String pass ;
	public account () {
		
	}

	public account(String sdt, String email,String pass) {
		super();

		this.sdt = sdt;
		this.email = email;

		this.pass = pass;
	}

	

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "account [ sdt=" + sdt + ", email=" + email + ", pass=" + pass + "]";
	}
	
}
	