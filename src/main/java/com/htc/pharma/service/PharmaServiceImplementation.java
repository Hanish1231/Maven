package com.htc.pharma.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.pharma.dao.IPharmaDao;
import com.htc.pharma.model.Pharma;

@Service
public class PharmaServiceImplementation implements IPharmaService{
	
	@Autowired
	IPharmaDao pharmaDao;

	@Override
	@Transactional
	public boolean addMedicine(Pharma pharma) {
		// TODO Auto-generated method stub
		System.out.println("In service class");

		boolean addPharmaFlag = false;

		if (pharma != null) {
			pharmaDao.addMedicine(pharma);
			addPharmaFlag = true;
		}

		return addPharmaFlag;
	}

	@Override
	public List<Pharma> getAllMedicines() {
		// TODO Auto-generated method stub
		List<Pharma> pharmalist=pharmaDao.getAllMedicines();
		return pharmalist;
	}

	@Override
	@Transactional
	public boolean deleteMedicine(int medicineId) {
		// TODO Auto-generated method stub
		System.out.println("In service class");

		boolean deletePharmaFlag = false;

		if (medicineId != 0) { 
			pharmaDao.deleteMedicine(medicineId);
			deletePharmaFlag = true;
		}

		return deletePharmaFlag;
	}

	@Override
	@Transactional
	public boolean updateMedicine(int medicineId, int price, int dose, int grams) {
		// TODO Auto-generated method stub
		boolean result=	pharmaDao.updateMedicine(medicineId, price, dose, grams);
		return result;
	}

	@Override
	public Pharma getMedicine(int medicineId) {
		// TODO Auto-generated method stub
		Pharma pharma=pharmaDao.getMedicine(medicineId);
		return pharma;
	}

}
