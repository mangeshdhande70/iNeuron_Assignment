package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IEmployeeDao;
import in.ineuron.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao repo;

	@Override
	public Integer registerEmployee(Employee employee) {

		return repo.save(employee).getId();
	}

}
