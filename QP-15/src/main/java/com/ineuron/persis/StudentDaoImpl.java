package com.ineuron.persis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ineuron.dto.StudentDTO;
import com.ineuron.model.JDBCConnection;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public StudentDTO getInfo(Integer id) {
	
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		String sqlQuery = "SELECT * FROM student WHERE sid=?";
		

		if (connection == null) {
			System.out.println("Connection Established");
			try {
				connection = JDBCConnection.jdbcConnectionByHikariCP();
				if (connection != null)
					preparedStatement = connection.prepareStatement(sqlQuery);

				preparedStatement.setInt(1, id);

				resultSet = preparedStatement.executeQuery();

				StudentDTO studentDTO = new StudentDTO();

				if (resultSet.next()) {
					studentDTO.setId(resultSet.getInt(1));
					studentDTO.setSname(resultSet.getString(4));
					studentDTO.setSage(resultSet.getInt(3));
					studentDTO.setSaddress(resultSet.getString(2));
				}
				
//				System.out.println("Inside dao :: "+studentDTO);
				
				
				return studentDTO;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return null;
	}

	

	
	

}