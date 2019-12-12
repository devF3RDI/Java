
public class Dealership {

	public static void main(String[] args) {
		
		Customers cust1 = new Customers();
		cust1.setName("Joe Blogs");
		cust1.setAddress("23 Random St.");
		cust1.setCashOnHand(12000);
		
		Cars car1 = new Cars();
		car1.setMake("ford");
		car1.setModel("Mustang");
		car1.setKms(10000);
		car1.setManual(false);
		car1.setPrice(15000);
		
		Employee emp1 = new Employee();
		emp1.setName("David Bourke");
		emp1.setCommision(0.5);
				
		cust1.purchaseCar(car1, emp1, true);
		
		
		
	}

}
