package entities;

public abstract class TaxPayer {

	private String name;
	private Double annualSalary;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double annualSalary) {
		this.name = name;
		this.annualSalary = annualSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualIncome(Double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public abstract Double tax();
	
}
