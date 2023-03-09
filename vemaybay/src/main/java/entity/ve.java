package entity;

public class ve {
	private String mave ; 
	private String macb ; 
	private String gia ; 
	private String sdt;
	private String email ; 
	private String tenkh ; 
	private String gioitinh;
	private String cccd;
	private String ngaysinh;
	private String tgdv;
	
	public ve () {
		
	}

	public ve(String mave, String macb, String gia, String sdt, String email, String tenkh, String gioitinh,
			String cccd, String ngaysinh, String tgdv) {
		super();
		this.mave = mave;
		this.macb = macb;
		this.gia = gia;
		this.sdt = sdt;
		this.email = email;
		this.tenkh = tenkh;
		this.gioitinh = gioitinh;
		this.cccd = cccd;
		this.ngaysinh = ngaysinh;
		this.tgdv = tgdv;
	}

	public String getMave() {
		return mave;
	}

	public void setMave(String mave) {
		this.mave = mave;
	}

	public String getMacb() {
		return macb;
	}

	public void setMacb(String macb) {
		this.macb = macb;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
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

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getTgdv() {
		return tgdv;
	}

	public void setTgdv(String tgdv) {
		this.tgdv = tgdv;
	}

	@Override
	public String toString() {
		return "ve [mave=" + mave + ", macb=" + macb + ", gia=" + gia + ", sdt=" + sdt + ", email=" + email + ", tenkh="
				+ tenkh + ", gioitinh=" + gioitinh + ", cccd=" + cccd + ", ngaysinh=" + ngaysinh + ", tgdv=" + tgdv
				+ "]";
	}



	


	
	 

}
