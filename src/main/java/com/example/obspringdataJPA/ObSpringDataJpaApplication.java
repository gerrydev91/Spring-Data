package com.example.obspringdataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringDataJpaApplication.class, args);

		VehicleRepository repo = context.getBean(VehicleRepository.class);

		//System.out.println("find");
		
		Vehicle nissan = new Vehicle(null, "Nissan", "Rogue", 2017);

		repo.save(nissan);

		System.out.println(repo.findById(1L).toString());
	}

}
