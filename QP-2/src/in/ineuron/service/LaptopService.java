package in.ineuron.service;

public class LaptopService{
	
	
	public Laptop getLaptopInfo() {
		
		Laptop laptop = new Laptop(1L, "HP", 16, "Apple A16 Bionic", "Apple", "Hyper-Threading");
		return laptop;
	}

}
