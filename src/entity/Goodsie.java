package entity;

public class Goodsie {

	private int goodsie_id;
	private String goods_id;
	private int goods_num;
	private String cos_id;
	private String emp_id;
	private int iscompile;
	private char iore;
	private String mgr_id;
	private String dealtime = "sysdate";

	public int getGoodsie_id() {
		return goodsie_id;
	}
	public void setGoodsie_id(int goodsie_id) {
		this.goodsie_id = goodsie_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public int getGoods_num() {
		return goods_num;
	}
	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}
	public String getCos_id() {
		return cos_id;
	}
	public void setCos_id(String cos_id) {
		this.cos_id = cos_id;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public int getIscompile() {
		return iscompile;
	}
	public void setIscompile(int iscompile) {
		this.iscompile = iscompile;
	}
	public char getIore() {
		return iore;
	}
	public void setIore(char iore) {
		this.iore = iore;
	}
	public String getMgr_id() {
		return mgr_id;
	}
	public void setMgr_id(String mgr_id) {
		this.mgr_id = mgr_id;
	}
	public String getDealtime() {
		return dealtime;
	}

}
