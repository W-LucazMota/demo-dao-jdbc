package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();	
		
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
	}
}
