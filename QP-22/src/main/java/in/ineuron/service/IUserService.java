package in.ineuron.service;

import in.ineuron.model.Orders;
import in.ineuron.model.User;

public interface IUserService {

	public Integer registerUser(User user);
	
	public Integer order(Orders orders);
	
}
