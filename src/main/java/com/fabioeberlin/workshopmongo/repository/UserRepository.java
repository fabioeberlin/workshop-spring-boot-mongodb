package com.fabioeberlin.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fabioeberlin.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
