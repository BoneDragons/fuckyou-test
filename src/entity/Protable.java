package entity;

public class Protable {


	private int pro_id;
	private String get_goodsId;
	private int get_goodsNum;
	private String back_goodsId;
	private int back_goodsNum;
	private String emp_id;
	private String get_time = "sysdate";
	private String back_time = "sysdate";
	private String mgr_id;
	private int iscompile;


	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getGet_goodsId() {
		return get_goodsId;
	}
	public void setGet_goodsId(String get_goodsId) {
		this.get_goodsId = get_goodsId;
	}
	public int getGet_goodsNum() {
		return get_goodsNum;
	}
	public void setGet_goodsNum(int get_goodsNum) {
		this.get_goodsNum = get_goodsNum;
	}
	public String getBack_goodsId() {
		return back_goodsId;
	}
	public void setBack_goodsId(String back_goodsId) {
		this.back_goodsId = back_goodsId;
	}
	public int getBack_goodsNum() {
		return back_goodsNum;
	}
	public void setBack_goodsNum(int back_goodsNum) {
		this.back_goodsNum = back_goodsNum;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getMgr_id() {
		return mgr_id;
	}
	public void setMgr_id(String mgr_id) {
		this.mgr_id = mgr_id;
	}
	public String getGet_time() {
		return get_time;
	}
	public String getBack_time() {
		return back_time;
	}
	public int getIscompile() {
		return iscompile;
	}
	public void setIscompile(int iscompile) {
		this.iscompile = iscompile;
	}
}
