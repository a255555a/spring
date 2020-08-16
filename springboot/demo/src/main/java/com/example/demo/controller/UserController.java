package com.example.demo.controller;

import com.example.demo.entity.UserBean;
import com.example.demo.entity.UsersDao;
import com.example.demo.dao.UserRepository;
import com.example.demo.dao.UsersRepositoryByName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author LY
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userDao;
    @Autowired
    private UsersRepositoryByName usersRepositoryByName;


    @GetMapping("/user/{id}")
    public Optional<UsersDao> getUser(@PathVariable("id") Integer id) {

        Optional<UsersDao> usersDao = userDao.findById(id);

        List<UserBean> userBean = usersRepositoryByName.findByName("aa");
        for (UserBean userBean1 :userBean){
            System.out.println(userBean1);
        }
        return usersDao;
    }
}
