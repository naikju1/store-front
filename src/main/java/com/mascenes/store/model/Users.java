package com.mascenes.store.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String userName;
    private String password;
    private char role;

    protected Users(){}

    protected  Users(String username, String Password, char role){
        this.password = Password;
        this.userName = username;
        this.role = role;
    }
    public  long getId(){
        return  id;
    }
    public void setId(long id){
        this.id =id;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
    public  String getPassword(){
        return password;
    }
    public void setRole(char Role) {
        this.role = Role;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + userName + ", role=" + (role == 'A' ?"Admin":"Sales") + "]";
    }

}
