package com.nmax.repository;

import com.nmax.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer> {

	UserInfo findByUsername(String username);

}
