package com.ineuron.service;

import java.io.IOException;
import java.sql.SQLException;

import com.ineuron.dto.StudentDTO;

public interface IServiceStudent {

	public StudentDTO getStudentInfoById(int id) throws SQLException, IOException;

}
