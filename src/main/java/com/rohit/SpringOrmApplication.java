package com.rohit;

import com.rohit.entity.Student;
import com.rohit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringOrmApplication {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmApplication.class, args);
	}

	private void run(String... args) {
		Student student = new Student();
		student.setStudentName("Rohit");
		student.setStudentId(12);
		student.setAbout("Studying");


//		Laptop laptop = new Laptop();
//		laptop.setLaptopId(123);
//		laptop.setBrand("Dell");
//		laptop.setModelNumber("A23RTC");
//		student.setLaptop(laptop);

		Student saved = studentRepository.save(student);
		System.out.println(saved.getStudentName());
	}
}
