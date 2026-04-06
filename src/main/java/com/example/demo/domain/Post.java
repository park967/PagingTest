package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;
    private String title;
    private String content;
    private String author;
    private long cnt;
    @CreatedDate
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;


    public String getTitle() {

        return title;
    }

    public String getContent() {
        return content;
    }


    public String getAuthor() {

        return author;
    }

}





