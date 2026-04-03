package com.example.demo.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="gen1")
    private long uid;
    private String name;

    public String getName(){
        return name;
    }

}
