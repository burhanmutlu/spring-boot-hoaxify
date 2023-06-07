package com.hoaxify.ws.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users { // User ismini kullanma özel isim çünkü karışıyor

    @Id
    @GeneratedValue
    private long id;

    private String username;
    private String displayName;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", displayName='" + displayName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
