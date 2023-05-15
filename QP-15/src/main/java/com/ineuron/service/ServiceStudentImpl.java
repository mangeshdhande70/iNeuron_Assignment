package com.ineuron.service;

import java.io.IOException;
import java.sql.SQLException;

import com.ineuron.dto.StudentDTO;
import com.ineuron.dtofactory.StudentDaoFactory;
import com.ineuron.persis.IStudentDao;

public class ServiceStudentImpl implements IServiceStudent {

	IStudentDao iStudentDao = StudentDaoFactory.getStudentDao();

	
	@Override
	public StudentDTO getStudentInfoById(int id) throws SQLException, IOException {
		
//		StudentDTO studentDTO = iStudentDao.getInfo(id);
//		
//		System.out.println("Inside Service :: "+studentDTO);
		
		return iStudentDao.getInfo(id);
	}


}
