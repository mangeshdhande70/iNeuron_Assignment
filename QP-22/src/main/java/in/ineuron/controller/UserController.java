package in.ineuron.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.ineuron.model.Orders;
import in.ineuron.model.User;
import in.ineuron.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService service;

	
	public void registerUser() {
		
		User user = new User();
		
//		user.setUserId(5); 
		user.setName("Mangesh");
		user.setLastName("Dhande");
		user.setAddres("Nagpur");;
		
		
		Orders orders = new Orders();
		
		orders.setFood("idli");
		orders.setTime(LocalDateTime.now());
		orders.setUser(user);
		
		
		user.setOrders(List.of(orders));
		
		Integer id = service.registerUser(user);
		
		if (id!=null) {
			System.out.println("Employee Registraytion Successfully with id :: "+id);
		}else {
			System.out.println("Failed to Register");
		}		
	}
	
	
	public void order() {
		
	    User user = new User();
		
		user.setName("Rakesh");
		user.setLastName("Pawar");
		user.setAddres("Nagpur");;
		
		Orders orders = new Orders();
		
		orders.setFood("Samosa");
		orders.setTime(LocalDateTime.now());
		orders.setUser(user);
		
		Integer id = service.order(orders);
		
		if (id!=null) {
			System.out.println("Order Placed Successfully with id :: "+id);
		}else {
			System.out.println("Failed");
		}	
		
		
	}
	
	
}
