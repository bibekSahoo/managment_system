package com.bibek.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.bibek.sms.repository")
public class ManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagmentSystemApplication.class, args);
	}


//	@Autowired
//	private StudentRepository studentRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		Student student1 = new Student("Bibek", "Sahoo", "bibek@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("tony", "stark", "tony@gmail.com");
//		studentRepository.save(student3);
//
//	}
}
