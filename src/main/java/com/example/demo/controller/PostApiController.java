package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.repositories.PostRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "게시판 API", description = "게시글 및 댓글 CRUD")
@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostApiController {

    @Autowired
    private PostRepository postRepository;





        /*
    @Operation(summary = "게시글 목록 조회")
    @GetMapping
    public ResponseEntity<List<Post>> getPostList() {
        return ResponseEntity.ok(null);
    }
*/
}



