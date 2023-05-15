package in.ineuron.service;

public class Laptop extends Processor {
	
	
	Long laptopId;
	String laptopComapny;
	int ram;
	
	
	
	public Laptop() {
		super();
	}


	public Laptop(Long laptopId, String laptopComapny, int ram, String processorName, String companyName,
			String processorType) {
		super(processorName ,companyName, processorType);
		this.laptopId = laptopId;
		this.laptopComapny = laptopComapny;
		this.ram = ram;
	}
	

	public Long getLaptopId() {
		return laptopId;
	}


	public String getLaptopComapny() {
		return laptopComapny;
	}


	public int getRam() {
		return ram;
	}


	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopComapny=" + laptopComapny + ", ram=" + ram + ", processorName="
				+ processorName + ", companyName=" + companyName + ", processorType=" + processorType + "]";
	}
	
	
	
	
	
}
