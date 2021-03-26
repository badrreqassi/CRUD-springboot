package com.User.CRUDuser.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
 @Id
 @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int id;

    private  String first_name;
    private String last_name;
    private  String email;
    private int salary;


}
