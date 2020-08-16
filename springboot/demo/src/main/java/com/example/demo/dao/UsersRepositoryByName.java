package com.example.demo.dao;

import com.example.demo.entity.UserBean;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author LY
 */

public interface UsersRepositoryByName extends Repository<UserBean, Integer> {
    //方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）
    List<UserBean> findByName(String name);

    List<UserBean> findByNameAndAge(String name, Integer age);

    List<UserBean> findByNameLike(String name);

}

