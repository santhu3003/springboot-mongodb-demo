package com.test.mongodb.springbootmongodbdemo.repositories;

import com.test.mongodb.springbootmongodbdemo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
