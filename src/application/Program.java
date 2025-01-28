package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
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
		
		
		
		sc.close();
		
	}
}
