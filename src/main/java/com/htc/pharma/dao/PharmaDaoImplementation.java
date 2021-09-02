package com.htc.pharma.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.htc.pharma.model.Pharma;
@Repository
public class PharmaDaoImplementation implements IPharmaDao{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	@Transactional
	public boolean addMedicine(Pharma pharma) {
		// TODO Auto-generated method stub
		boolean addPharmaFlag = false;

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(pharma);
			entityTransaction.commit();
			addPharmaFlag = true;
		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return addPharmaFlag;
	}

	@Override
	public List<Pharma> getAllMedicines() {
		// TODO Auto-generated method stub
		List<Pharma> pharmaList = new ArrayList<Pharma>();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try
		{
			entityTransaction.begin();
			pharmaList=entityManager.createQuery("From Pharma").getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return pharmaList;
	}

	@Override
	public boolean deleteMedicine(int medicineId) {
		// TODO Auto-generated method stub
		boolean deletePharmaFlag = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Pharma pharma = (Pharma)entityManager.find(Pharma.class, medicineId);
			entityManager.remove(pharma);
			entityTransaction.commit();
			deletePharmaFlag=true;
            }
		catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		}
		finally {
			entityManager.close();
		}
		return deletePharmaFlag;
	}

	@Override
	public boolean updateMedicine(int medicineId, int price, int dose, int grams) {
		// TODO Auto-generated method stub
		boolean updatepharmaFlag = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
		entityTransaction.begin();
		Pharma pharma = (Pharma) entityManager.find(Pharma.class, medicineId);
		pharma.setPrice(price);
		pharma.setDose(dose);
		pharma.setGrams(grams);
		updatepharmaFlag = true;
        entityTransaction.commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			entityTransaction.rollback();
			e.printStackTrace();
		}
		finally {
			entityManager.close();
		}
		return updatepharmaFlag;
	}

	@Override
	public Pharma getMedicine(int medicineId) {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Pharma pharma = null;
		try {
		pharma =entityManager.find(Pharma.class, medicineId);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return pharma;
	}

}
