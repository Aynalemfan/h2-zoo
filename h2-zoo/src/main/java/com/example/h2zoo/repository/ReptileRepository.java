package com.example.h2zoo.repository;

import com.example.h2zoo.model.Reptile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReptileRepository extends CrudRepository<Reptile, Long> {


}
