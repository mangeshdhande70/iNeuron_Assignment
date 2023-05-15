package com.ineuron.persis;

import java.sql.SQLException;

import com.ineuron.dto.StudentDTO;

public interface IStudentDao  {
	
	public StudentDTO getInfo(Integer id) throws SQLException;
	
}
