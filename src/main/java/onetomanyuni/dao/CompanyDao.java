package onetomanyuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanyuni.dto.Company;

public class CompanyDao {
public EntityManager getEntityManager() {
	return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	
}

public void saveCompany(Company company) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(company);
	entityTransaction.commit();
}
public void updateCompany(int id,Company company) {
	EntityManager entityManager=getEntityManager();
	Company company2=entityManager.find(Company.class, id);
	if(company2!=null) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		company.setId(id);
		company.setEmployees(company2.getEmployees());
        entityManager.merge(company);
		entityTransaction.commit();
	}	
}

public void getCompanyById(int id) {
	EntityManager entityManager=getEntityManager();
	Company company=entityManager.find(Company.class, id);
	System.out.println(company);
}

public void deleteCompanyById(int id) {
	EntityManager entityManager=getEntityManager();
	Company company=entityManager.find(Company.class, id);
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.remove(company);
	entityTransaction.commit();
	
	
}
}
