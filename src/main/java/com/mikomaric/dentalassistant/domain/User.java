package com.mikomaric.dentalassistant.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class User extends Person{
    
    private String username;
    private String password;


    public User() {
    }

    public User(String usernamme, String password) {
        this.username = usernamme;
        this.password = password;
    }
    
    public User(String usernamme, String password, String email, String firstname, String lastname) {
        super(firstname,lastname,email);
        this.username = usernamme;
        this.password = password;
    }

    public User(String usernamme, String password, String email, String firstname, String lastname, String address, String phone) {
        super(firstname,lastname,email,address,phone);
        this.username = usernamme;
        this.password = password;
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "User{" + "username=" + username + '}';
    }
}
