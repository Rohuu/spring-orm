package com.example;

import com.example.entity.Laptop;
import com.example.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmApplication.class, args);

		Student student = new Student();
		student.setStudentName("Rohit");
		student.setStudentId(12);
		student.setAbout("Studying");


		Laptop laptop=new Laptop();
		laptop.setLaptopId(123);
		laptop.setBrand("Dell");
		laptop.setModelNumber("A23RTC");
		student.setLaptop(laptop);
	}

}
