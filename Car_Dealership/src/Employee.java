
public class Employee 
{
	String name;
	double commision;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", commision=" + commision + "]";
	} 

}
