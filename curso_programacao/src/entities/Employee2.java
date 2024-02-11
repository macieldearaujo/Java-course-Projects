 package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee2 {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	private List<Employee2> employeeList = new ArrayList<>();
	
	public Employee2() {
	}

	public Employee2(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public void addEmployee(Employee2 emp) {
		employeeList.add(emp);
	}
	
	public void removeEmployee(Employee2 emp) {
		employeeList.remove(emp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return hours * valuePerHour;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Employee2 emp : employeeList) {
			System.out.println(emp.name + " - $ " + emp.payment());
		}
		
		return sb.toString();
	}
}
