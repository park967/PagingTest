package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="gen1")
    private long Board_Id;
    private String title;
    private String write;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Users users;


}
