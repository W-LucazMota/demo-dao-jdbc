package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		SellerDao sellerDao = DaoFactory.createSellerDao();	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("___ TEST 1: Seller findById ____");
		Seller seller = sellerDao.findyById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("____TEST 2: Seller findByDepartment ____");
		Department department = new Department(2, null);
		List<Seller> list= sellerDao.findByDeparment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("____TEST 3: Seller findAll ____");
		list= sellerDao.finddAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("____TEST 4: Seller insert ____");
		Seller newSeller = new Seller (null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id: " + newSeller.getId());
		
		System.out.println();
		System.out.println("____TEST 5: Seller update ____");
		seller = sellerDao.findyById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println();
		System.out.println("____TEST 6: Seller delete ____");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
	
		System.out.println("Delete completed");
		*/
		
		
		List<Department> list= departmentDao.findAll();
		
		
		System.out.println("____TEST 1: Department findById____");
		Department department = departmentDao.findyById(2);
		System.out.println(department);
		
		System.out.println();
		System.out.println("_____TEST 2: Department findAll____");
		list = departmentDao.findAll();
		for (Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("_____TEST 3: Department insert____");
		Department newDepartment =  new Department (null, "Furniture");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id: " + newDepartment.getId());
		
		System.out.println();
		System.out.println("____TEST 4: Department update____");
		department = departmentDao.findyById(7);
		department.setName("Tools");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println();
		System.out.println("____TEST 5: Department delete ____");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
	}
}
