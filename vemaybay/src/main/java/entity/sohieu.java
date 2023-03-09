package entity;

public class sohieu {
	private String sohieu;
	private String hangbay;
	private String icon ; 
	
	public sohieu() {
		
	}

	public sohieu(String sohieu, String hangbay, String icon) {
		super();
		this.sohieu = sohieu;
		this.hangbay = hangbay;
		this.icon = icon;
	}

	public String getSohieu() {
		return sohieu;
	}

	public void setSohieu(String sohieu) {
		this.sohieu = sohieu;
	}

	public String getHangbay() {
		return hangbay;
	}

	public void setHangbay(String hangbay) {
		this.hangbay = hangbay;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "sohieu [sohieu=" + sohieu + ", hangbay=" + hangbay + ", icon=" + icon + "]";
	}

}
