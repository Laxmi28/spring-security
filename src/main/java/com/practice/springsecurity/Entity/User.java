package com.practice.springsecurity.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_tb_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String password;
    private String userFirstName;
    private String userLastName;
    
}
