package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installament> instalments = new ArrayList<>();

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public List<Installament> getInstalments() {
		return instalments;
	}

	public void setInstalments(List<Installament> instalments) {
		this.instalments = instalments;
	}

	public void addinstalments(Installament installament) {
		instalments.add(installament);
	}
	
	public void removeInstalments(Installament installament) {
		instalments.add(installament);
	}
}
