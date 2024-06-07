package spring.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class HibernateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateProjectApplication.class, args);
		System.out.println("Hibernate transaction management");
		
		
	}
	
}
