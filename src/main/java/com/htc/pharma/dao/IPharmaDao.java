package com.htc.pharma.dao;

import java.util.List;

import com.htc.pharma.model.Pharma;


public interface IPharmaDao {
	public boolean addMedicine(Pharma pharma);
	public List<Pharma> getAllMedicines();
	public boolean deleteMedicine(int medicineId) ;
	public boolean updateMedicine(int medicineId,int price,int dose,int grams);
	public Pharma getMedicine(int medicineId) ;

}
