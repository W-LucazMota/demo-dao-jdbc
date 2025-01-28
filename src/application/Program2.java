package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		List<Department> list = departmentDao.findAll();
		
		
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
