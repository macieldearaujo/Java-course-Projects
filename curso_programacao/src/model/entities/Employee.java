package model.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increasePercentage(double percentage) {
		grossSalary *= (1+(percentage/100));
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
