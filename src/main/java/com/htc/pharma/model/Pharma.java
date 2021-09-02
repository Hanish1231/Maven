package com.htc.pharma.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;
@Repository
@Entity
@Table(name="PHARMA")
public class Pharma {
	@Id
	private int medicineId;
	private String medicineName;
	private int price;
	private int dose;
	private int grams;
	public int getMedicineId() {
		return medicineId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + medicineId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pharma other = (Pharma) obj;
		if (medicineId != other.medicineId)
			return false;
		return true;
	}
	public Pharma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pharma(int medicineId, String medicineName, int price, int dose, int grams) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.price = price;
		this.dose = dose;
		this.grams = grams;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	public int getGrams() {
		return grams;
	}
	public void setGrams(int grams) {
		this.grams = grams;
	}
	
	@Override
	public String toString() {
		return "Pharma [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price + ", dose="
				+ dose + ", grams=" + grams + "]";
	}

}
