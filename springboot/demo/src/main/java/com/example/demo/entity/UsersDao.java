package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author LY
 */
@Entity
@Table(name = "sp_User")
public class UsersDao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

    @Column(name = "type")
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Users [id=" + id + ", user=" + user + ", password=" + password + ",type="+ type +"]";
    }
    public UsersDao(){


    }


}
