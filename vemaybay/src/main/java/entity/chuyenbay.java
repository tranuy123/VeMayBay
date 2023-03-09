package entity;

public class chuyenbay {
private String macb ; 
private String sohieu; 
private String ngaydi ; 
private String sbdi ; 
private String sbden ; 
private String lotrinhbay ; 
private String giodi ; 
private String gioden ;
private String mahb;
private String giave ; 
private String tenhang ; 
private String icon ; 

public chuyenbay() {}





public chuyenbay(String macb, String sohieu, String ngaydi, String sbdi, String sbden, String lotrinhbay, String giodi,
		String gioden, String mahb, String giave, String tenhang, String icon) {
	super();
	this.macb = macb;
	this.sohieu = sohieu;
	this.ngaydi = ngaydi;
	this.sbdi = sbdi;
	this.sbden = sbden;
	this.lotrinhbay = lotrinhbay;
	this.giodi = giodi;
	this.gioden = gioden;
	this.mahb = mahb;
	this.giave = giave;
	this.tenhang = tenhang;
	this.icon = icon;
}





public String getMacb() {
	return macb;
}





public void setMacb(String macb) {
	this.macb = macb;
}





public String getSohieu() {
	return sohieu;
}





public void setSohieu(String sohieu) {
	this.sohieu = sohieu;
}





public String getNgaydi() {
	return ngaydi;
}





public void setNgaydi(String ngaydi) {
	this.ngaydi = ngaydi;
}





public String getSbdi() {
	return sbdi;
}





public void setSbdi(String sbdi) {
	this.sbdi = sbdi;
}





public String getSbden() {
	return sbden;
}





public void setSbden(String sbden) {
	this.sbden = sbden;
}





public String getLotrinhbay() {
	return lotrinhbay;
}





public void setLotrinhbay(String lotrinhbay) {
	this.lotrinhbay = lotrinhbay;
}





public String getGiodi() {
	return giodi;
}





public void setGiodi(String giodi) {
	this.giodi = giodi;
}





public String getGioden() {
	return gioden;
}





public void setGioden(String gioden) {
	this.gioden = gioden;
}





public String getMahb() {
	return mahb;
}





public void setMahb(String mahb) {
	this.mahb = mahb;
}





public String getGiave() {
	return giave;
}





public void setGiave(String giave) {
	this.giave = giave;
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
	return "chuyenbay [macb=" + macb + ", sohieu=" + sohieu + ", ngaydi=" + ngaydi + ", sbdi=" + sbdi + ", sbden="
			+ sbden + ", lotrinhbay=" + lotrinhbay + ", giodi=" + giodi + ", gioden=" + gioden + ", mahb=" + mahb
			+ ", giave=" + giave + ", tenhang=" + tenhang + ", icon=" + icon + "]";
}






}
