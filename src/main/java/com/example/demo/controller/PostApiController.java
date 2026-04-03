package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "게시판 API", description = "게시글 및 댓글 CRUD")
@RestController
@RequestMapping("/api/posts") // 기본 경로가 /api/posts로 설정됨
@RequiredArgsConstructor
public class PostApiController {

    @Autowired
    PostService postService;

    // 1. 게시글 등록
    @Operation(summary = "게시글 등록")
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savedPost = postService.save(post);
        return ResponseEntity.ok(savedPost);
    }

    // 2. 게시글 목록 조회
    @Operation(summary = "게시글 목록 조회")
    @GetMapping
    public ResponseEntity<List<Post>> getPostList() {
        List<Post> posts = postService.findAll();
        return ResponseEntity.ok(posts);
    }

    // 3. 게시글 단건 조회
    @Operation(summary = "게시글 상세 조회")
    @GetMapping("/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Long id) {
        Post post = postService.findbyId(id);
        return ResponseEntity.ok(post);
    }

    /* 4. 게시글 수정


    // 5. 게시글 삭제

    */

}