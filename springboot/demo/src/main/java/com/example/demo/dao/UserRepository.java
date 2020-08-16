package com.example.demo.dao;

import com.example.demo.entity.UsersDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author LY
 */
@Repository
public interface UserRepository extends JpaRepository<UsersDao,Integer> {

}
