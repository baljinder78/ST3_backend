package com.ST3_Backend.ST3.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetails {

    @Id
    @Column(name = "username",unique = true)
    public String Username;

    @Column(name = "Email",unique = true)
    public String Email;

    @Column(name = "Password",unique = true)
    public String Password;

    @Column(name = "Phone_no",unique = true)
    public Integer Phone_number;

    public UserDetails() {
    }

    public UserDetails(String username, String email, String password, Integer phone_number) {
        Username = username;
        Email = email;
        Password = password;
        Phone_number = phone_number;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        Phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Phone_number=" + Phone_number +
                '}';
    }
}
