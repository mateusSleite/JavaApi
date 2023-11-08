package com.mateus.java_api.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mateus.java_api.model.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String>{

    @Query("{'name': ?0}")
    List<UserModel> findByName(String name);

    @Query("{name: ?1, 'age': ?0}")
    List<UserModel> findByAgeAndName(short age, String name); 
    
}
