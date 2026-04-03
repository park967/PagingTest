package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="gen1")
    private long postId;
    private String title;
    private String context;
    private long author; // SQL에서 INT 타입이므로 int로 선언
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;


    public String getTitle(){
        return title;
    }

}

