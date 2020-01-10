package com.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.user.User;

public interface UserRepository extends MongoRepository<User, String> {
}