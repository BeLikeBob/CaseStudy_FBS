package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Flights;

public interface FlightsRepository  extends MongoRepository <Flights, String> {

	

}
