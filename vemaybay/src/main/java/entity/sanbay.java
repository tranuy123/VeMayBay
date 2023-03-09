package entity;

public class sanbay {
	private String masb;
	private String tensb;
	private String tentp ; 
	
	public sanbay(){
		
	}

	public sanbay(String masb, String tensb, String tentp) {
		super();
		this.masb = masb;
		this.tensb = tensb;
		this.tentp = tentp;
	}

	public String getMasb() {
		return masb;
	}

	public void setMasb(String masb) {
		this.masb = masb;
	}

	public String getTensb() {
		return tensb;
	}

	public void setTensb(String tensb) {
		this.tensb = tensb;
	}

	public String getTentp() {
		return tentp;
	}

	public void setTentp(String tentp) {
		this.tentp = tentp;
	}

	@Override
	public String toString() {
		return "sanbay [masb=" + masb + ", tensb=" + tensb + ", tentp=" + tentp + "]";
	}


}
