package com.example.h2zoo.repository;

import com.example.h2zoo.model.Birds;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdsRepository extends CrudRepository<Birds, Long>{

}
