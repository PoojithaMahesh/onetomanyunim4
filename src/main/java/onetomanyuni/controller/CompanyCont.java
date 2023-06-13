package onetomanyuni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanyuni.dao.CompanyDao;
import onetomanyuni.dao.EmployeeDao;
import onetomanyuni.dto.Company;
import onetomanyuni.dto.Employee;

public class CompanyCont {
	public static void main(String[] args) {

//		Company company = new Company();
//		company.setId(3);
//		company.setName("Tcs");
//
//		Employee employee1 = new Employee();
//		employee1.setId(5);
//		employee1.setName("Manjunath");
//		employee1.setAddress("tn");
//
//		Employee employee2 = new Employee();
//		employee2.setId(6);
//		employee2.setName("Rahul");
//		employee2.setAddress("AP");
//
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(employee1);
//		employees.add(employee2);
//		company.setEmployees(employees);
//	
//		EmployeeDao dao=new EmployeeDao();
//		dao.saveEmployee(employee1);
//		dao.saveEmployee(employee2);
//		
//		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.saveCompany(company);
		
//		Company company=new Company();
//		company.setName("Jspiders");
//		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.updateCompany(2, company);
//		Employee employee=new Employee();
//		employee.setName("Soundarya");
//		employee.setAddress("Bangalore");
//		EmployeeDao employeeDao=new EmployeeDao();
//		employeeDao.updateEmployee(3, employee);
//		
		
		
//		EmployeeDao dao=new EmployeeDao();
//		dao.getEmployeeById(3);
		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.getCompanyById(2);
//		
//		EmployeeDao dao=new EmployeeDao();
//		dao.deleteEmployeeById(3);
		
		CompanyDao companyDao=new CompanyDao();
		companyDao.deleteCompanyById(3);
		
	}
}
