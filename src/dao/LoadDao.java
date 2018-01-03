package dao;

import entity.Emp;
import tool.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoadDao {


	public ResultSet load(Emp e){
		ResultSet rs = null;
		DBConnection dbc = new DBConnection();
		String sql = "select * from Emp where emp_id = ? and emp_pwd = ? and isdelete = 0";
		try {
			rs =dbc.select(sql, e.getEmp_id(),e.getEmp_pwd());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return rs;
	}


}
