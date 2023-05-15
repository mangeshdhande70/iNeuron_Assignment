package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IOrdersDao;
import in.ineuron.dao.IUserDao;
import in.ineuron.model.Orders;
import in.ineuron.model.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao repo;
	
	@Autowired
	private IOrdersDao repOrders;

	@Override
	public Integer registerUser(User user) {

		User user2 = repo.save(user);
		
		return user2.getUserId();
	}

	@Override
	public Integer order(Orders orders) {
		return repOrders.save(orders).getOrderId();
	}
	
	

	

}
