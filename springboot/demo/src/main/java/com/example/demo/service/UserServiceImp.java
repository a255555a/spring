package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LY
 */
@Service
public class UserServiceImp {

    @Resource
    private UserRepository userRepository;




}
