package model;

public class NhanVienModel {
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public String getHonv() {
		return honv;
	}
	public void setHonv(String honv) {
		this.honv = honv;
	}
	public String getTenlot() {
		return tenlot;
	}
	public void setTenlot(String tenlot) {
		this.tenlot = tenlot;
	}
	public String getTennv() {
		return tennv;
	}
	public void setTennv(String tennv) {
		this.tennv = tennv;
	}
	public String getNgsinh() {
		return ngsinh;
	}
	public void setNgsinh(String ngsinh) {
		this.ngsinh = ngsinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getPhai() {
		return phai;
	}
	public void setPhai(String phai) {
		this.phai = phai;
	}
	public String getLuong() {
		return luong;
	}
	public void setLuong(String luong) {
		this.luong = luong;
	}
	public String getManql() {
		return manql;
	}
	public void setManql(String manql) {
		this.manql = manql;
	}
	public String getPhg() {
		return phg;
	}
	public void setPhg(String phg) {
		this.phg = phg;
	}
	private String manv;
	private String honv;
	private String tenlot;
	private String tennv;
	private String ngsinh;
	private String diachi;
	private String phai;
	private String luong;
	private String manql;
	private String phg;
	 
    public Boolean validateModel() {
    	if( manv == null || manv.equals("")){ 
    		return false;
    	}
    	if( honv == null || honv.equals("")){ 
    		return false;
    	}
    	if( tenlot == null || tenlot.equals("")){ 
    		return false;
    	}
    	if( tennv == null || tennv.equals("")){ 
    		return false;
    	}
    	if( ngsinh == null || ngsinh.equals("")){ 
    		return false;
    	}
    	if( diachi == null || diachi.equals("")){ 
    		return false;
    	}
    	if( phai == null || phai.equals("")){ 
    		return false;
    	}
    	if( luong == null || luong.equals("")){ 
    		return false;
    		
    	}
    	try {
			int tam = Integer.parseInt(luong);
		} catch (NumberFormatException e) {
			return false;
		}
    	if( manql == null || manql.equals("")){ 
    		return false;
    	}
    	if( phg == null || phg.equals("")){ 
    		return false;
    	}
		return true;
    	
    }

}