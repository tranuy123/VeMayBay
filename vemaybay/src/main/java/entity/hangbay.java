package entity;

public class hangbay {
	private String mahb ; 
	private String tenhang ; 
	private String icon ; 
	
	public hangbay() {
		
	}

	public hangbay(String mahb, String tenhang, String icon) {
		super();
		this.mahb = mahb;
		this.tenhang = tenhang;
		this.icon = icon;
	}

	public String getMahb() {
		return mahb;
	}

	public void setMahb(String mahb) {
		this.mahb = mahb;
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "hangbay [mahb=" + mahb + ", tenhang=" + tenhang + ", icon=" + icon + "]";
	}

}
