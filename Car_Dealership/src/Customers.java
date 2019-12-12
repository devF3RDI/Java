
public class Customers 
{
	String name;
	String address;
	int cashOnHand;
	
	public void purchaseCar(Cars car, Employee emp, boolean finance) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(int cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	@Override
	public String toString() {
		return "Customers [name=" + name + ", address=" + address + ", cashOnHand=" + cashOnHand + "]";
	}
	
	
}
