package krishna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import krishna.bo.EmployeeBO;
import krishna.dto.EmployeeDTO;

@Repository(value="dao")
public class EmployeeDAOImpl implements IEmployeeDAO{
	
	private static final String SQL_INSERT_QUERY = "insert into newEmpl(`ename`,`eaddress`,`eage`,`esalary`,`hikeAmount`)values(?,?,?,?,?)";

	static {
		System.out.println("EmployeeDAOImpl.class is loading..");
	}
	
	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl:: zero arg constructor");
	}

	@Override
	public EmployeeBO save(EmployeeBO bo) {
		int count=0;
		try(Connection con = dataSource.getConnection(); 
				PreparedStatement ps=con.prepareStatement(SQL_INSERT_QUERY)){
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.geteAddress());
			ps.setInt(3, bo.getEage());
			ps.setFloat(4, bo.geteSalary());
			ps.setFloat(5, bo.getHikeAmount());
			count=ps.executeUpdate();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		return bo;
		
	}
	
	private DataSource dataSource;

	@Override
	public String toString() {
		return "EmployeeDAOImpl [dataSource=" + dataSource + "]";
	}
	

}
