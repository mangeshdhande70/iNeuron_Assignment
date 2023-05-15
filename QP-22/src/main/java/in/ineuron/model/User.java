package in.ineuron.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String name;
	
	private String lastName;
	
	private String addres;
	
	@OneToMany(targetEntity = Orders.class , cascade = CascadeType.ALL , mappedBy = "user" ,fetch = FetchType.EAGER)
	private List<Orders> orders;

}
