package com.example.JPAComponentMapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaComponentMappingApplicationTests {

	@Autowired
	private EmployeeRepository er;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {

		Employee employee = new Employee();
		Address address = new Address();

		employee.setAddress(address);
		employee.setDomain("Development");
		employee.setEmail("dnb1079@gmail.com");
		employee.setName("Dnyan Bhosale");
		employee.setProject("Wickes");
		employee.setRole("soft dev");
		address.setCity("Nanded");
		address.setCountry("india");
		address.setPincode(413515);
		address.setStreetAddress("near NH52");

		er.save(employee);
	}
	@Test
	public void createEmployee2() {

		Employee employee = new Employee();
		Address address = new Address();

		employee.setAddress(address);
		employee.setDomain("Development");
		employee.setEmail("dnb21079@gmail.com");
		employee.setName("Dnyan Bhosale");
		employee.setProject("Wickes");
		employee.setRole("soft dev");
		address.setCity("Nanded");
		address.setCountry("india");
		address.setPincode(413515);
		address.setStreetAddress("near NH52");

		er.save(employee);
	}

}
