package model.entities;

public class NaturalPerson extends TaxPayer{

	private Double healthCare;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Double annualSalary, Double healthCare) {
		super(name, annualSalary);
		this.healthCare = healthCare;
	}

	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}

	@Override
	public Double tax() {
		if(getAnnualSalary() < 20000.0) {
			return getAnnualSalary() * 0.15 - healthCare * 0.5;
		} else {
			return getAnnualSalary() * 0.25 - healthCare * 0.5;
		}
		
	}

}
