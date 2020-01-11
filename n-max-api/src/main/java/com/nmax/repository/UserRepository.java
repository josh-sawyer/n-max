package com.nmax.repository;

import com.nmax.model.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserInfo, String> {

	UserInfo findByUsername(String username);

}
