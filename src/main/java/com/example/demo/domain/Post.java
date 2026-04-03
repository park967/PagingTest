package com.example.demo.domain;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "uid")
    private users author;
    private long cnt;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;


    public String getTitle(){

        return title;
    }

    public String getContent() {
        return content;
    }


}

