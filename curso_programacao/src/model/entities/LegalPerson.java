package model.entities;

public class LegalPerson extends TaxPayer {

	private int employeeNumber;

	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double annualSalary, int employeeNumber) {
		super(name, annualSalary);
		this.employeeNumber = employeeNumber;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public Double tax() {
		if(employeeNumber < 10) {
			return getAnnualSalary() * 0.16;
		} else {
			return getAnnualSalary() * 0.14;
		}
	}
	
}
