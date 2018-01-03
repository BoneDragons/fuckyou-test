package servlte;

import dao.LoadDao;
import entity.Emp;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Brendan Lee
 */
public class Jump {
    public Emp getEle(Emp e){
        LoadDao ld = new LoadDao();
        ResultSet rs = ld.load(e);
        Emp emp = new Emp();
        try {
            if(rs.next()){
                emp.setEmp_id(rs.getString("emp_id"));
                emp.setEmp_name(rs.getString("emp_name"));
                emp.setEmp_type(rs.getInt("emp_type"));
            }
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
        return emp;
    }
}
