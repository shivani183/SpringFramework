package krishna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import krishna.bo.CustomerBO;

public class ICustomerDAOImpl implements ICustomerDAO {

	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY=
			"insert into customer(`cname`,`caddr`,`pamt`,`time`,`rate`,`intrAmt`) values(?,?,?,?,?,?)";
	private DataSource dataSource;

	public ICustomerDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("ICustomerDAOImpl : 1param constructor ----> " + dataSource.getClass().getName());
	}
	@Override
	public int save(CustomerBO bo) throws Exception {
		int count =0;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement psmt=connection.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY)) {
			
			psmt.setString(1, bo.getCustomerName());
			psmt.setString(2, bo.getCustomerAddress());
			psmt.setFloat(3, bo.getPamt());
			psmt.setFloat(4, bo.getTime());
			psmt.setFloat(5, bo.getRate());
			psmt.setFloat(6, bo.getIntrAmount());
			count = psmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}
	
	

}
