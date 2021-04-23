package com.ST3_Backend.ST3.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhoneDir")
public class PhoneDir {

    @Id
    @Column(name = "username",unique = true)
    public String Username;

    @Column(name = "Name")
    public String Name;

    @Column(name = "Email",unique = true)
    public String Email;

    @Column(name = "Phone_no",unique = true)
    public String Phone_number;

    public PhoneDir() {
    }


    public PhoneDir(String username, String name, String email, String phone_number) {
        Username = username;
        Name = name;
        Email = email;
        Phone_number = phone_number;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "PhoneDir{" +
                "Username='" + Username + '\'' +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone_number='" + Phone_number + '\'' +
                '}';
    }
}
