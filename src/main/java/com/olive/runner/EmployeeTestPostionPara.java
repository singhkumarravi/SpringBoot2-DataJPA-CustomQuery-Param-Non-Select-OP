package com.olive.runner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Employee;
import com.olive.repo.EmployeeRepositiory;
@Component
public class EmployeeTestPostionPara implements CommandLineRunner {
	@Autowired
	private EmployeeRepositiory repo;

	public void run(String... args) throws Exception {
		System.out.println("Application Started...................");

		repo.save(new Employee(10, "Ravi", 40.0, "Hyd"));
		repo.save(new Employee(20, "Manoj", 4044.0, "LKO"));
		repo.save(new Employee(30, "Sanoj", 404.0, "Hyd"));
		repo.save(new Employee(40, "Somesh", 440.0, "Ameerpet"));
		repo.save(new Employee(50, "Ajit", 403.0, "Hyd"));
		repo.save(new Employee(60, "Ramesh", 410.0, "lko"));
		repo.save(new Employee(70, "Sunil", 400.0, "Varanasi"));
		repo.save(new Employee(80, "Sunil", 400.0, "Varanasi"));
		repo.save(new Employee(90, "Sunil", 400.0, "Varanasi"));
		repo.save(new Employee(100, "Sunil", 400.0, "Varanasi"));



		System.out.println("Fetching Record Based on Postional Parameter");	
		List<Employee> list = repo.getEmployeeByIdBeteen();
		list.forEach(System.out::println);

		List<Employee> list2 = repo.getEmployeeByIdBeteenPosParam(10, 20);
		list2.forEach(System.out::println);

		List<Employee> emp = repo.getAllEmployeeBySql();
		System.out.println("Getting Record using Sql Query :: ");
		emp.forEach(System.out::println);

		/*
		 * updating method Call for Updating Record **********************
		 */
		Integer update = repo.updateEmployeeNameById("Komal Singh", 50);
		System.out.println("Record Update " + update);

		Integer up = repo.updateEmployeeNameAndAddressById("AAA", 80, "CCCC");
		if(up==1)
			System.out.println("Record Updated " + up);
		else
			System.out.println("Record Not Updated " + up);

		Integer updateEmployeeNameByIdUsingPos = repo.updateEmployeeNameByIdUsingPos("Sonam Kumari", 70);
		System.out.println("UpdateEmployeeNameByIdUsingPos " + updateEmployeeNameByIdUsingPos);


		/*
		 * deleteting Record  ***********************************
		 * 
		 */
		Integer row = repo.deleteEmployeeById(50);
		if(row==1)
			System.out.println("Record Deleted Count::" + row);
		else
			System.out.println("Record Not Deleted Count::" + row);

		Integer deleteEmployeeByName = repo.deleteEmployeeByName("Manoj");
		System.out.println("DeleteEmployeeByName " + deleteEmployeeByName);

		Integer deleteEmployeeBySal = repo.deleteEmployeeBySal(400.0);
		System.out.println("DeleteEmployeeBySal" + deleteEmployeeBySal);
		
		/*
		 * Fetching  Record  Using In operator  ***********************************
		 * 
		 */
		  System.out.println("Fetching  Record  Using In operator .......");
		  List<Employee> list1 = repo.getEmployeeByIdUsingIn(Arrays.asList(10,30,40));
		     list1.forEach(System.out::println);

	}
}





