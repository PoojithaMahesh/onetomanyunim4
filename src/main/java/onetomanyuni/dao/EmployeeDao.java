package onetomanyuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanyuni.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
		
	}
	public void saveEmployee(Employee employee) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	public void updateEmployee(int id,Employee employee) {
		EntityManager entityManager=getEntityManager();
		Employee employee2=entityManager.find(Employee.class, id);
		if(employee2!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			employee.setId(id);
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		
	}
	public void getEmployeeById(int id) {
		EntityManager entityManager=getEntityManager();
		Employee employee=entityManager.find(Employee.class, id);
		System.out.println(employee);
	}
	public void deleteEmployeeById(int id) {
		EntityManager entityManager=getEntityManager();
		Employee employee=entityManager.find(Employee.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
	}
	
}
