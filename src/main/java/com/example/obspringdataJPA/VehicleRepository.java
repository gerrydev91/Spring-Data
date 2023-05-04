package com.example.obspringdataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This will become a bean that will be injected. 
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
    

}
