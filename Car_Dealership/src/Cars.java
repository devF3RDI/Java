
public class Cars 
{
	String make;
	String model;
	int kms;
	int price;
	boolean manual;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isManual() {
		return manual;
	}
	public void setManual(boolean manual) {
		this.manual = manual;
	}
	@Override
	public String toString() {
		return "Cars [make=" + make + ", model=" + model + ", kms=" + kms + ", price=" + price + ", manual=" + manual
				+ "]";
	}
	
	

}
