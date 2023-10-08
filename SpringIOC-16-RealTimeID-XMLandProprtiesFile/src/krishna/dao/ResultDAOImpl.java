package krishna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import krishna.bo.ResultBO;
import krishna.dao.IResultDAO;

public class ResultDAOImpl implements IResultDAO {
	
	private static final String REALTIMEDI_MARKS_INSERT_QUERY = "insert into resultData(`sname`,`saddr`,`physics`,`bio`,`maths`,`percentage`)values(?,?,?,?,?,?)";
	private DataSource dataSource;

	public ResultDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("ResultDAOImpl:: 1 param constructor -----> " + dataSource.getClass().getName());

	}

	@Override
	public int save(ResultBO bo) throws Exception {
		int count = 0;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(REALTIMEDI_MARKS_INSERT_QUERY)) {
			pstmt.setString(1, bo.getStudentName());
			pstmt.setString(2, bo.getStudentAddress());
			pstmt.setFloat(3, bo.getPhysicsMarks());
			pstmt.setFloat(4, bo.getBioMarks());
			pstmt.setFloat(5, bo.getMathsMarks());
			pstmt.setFloat(6, bo.getPercentage());

			count = pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return count;
	}

	

}
