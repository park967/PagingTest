package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller // HTML 뷰를 반환하기 위해 @Controller 사용
@RequestMapping("/posts") // 주소는 원하는 대로 변경 가능
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // 1. 게시글 전체 목록 화면
    @GetMapping
    public String list(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts); // 화면(HTML)으로 데이터 전달
        return "post/list";
    }

    // 2. 게시글 상세 조회 화면
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        Post post = postService.findbyId(id);
        model.addAttribute("post", post);
        return "post/detail";
    }

    // 3. 게시글 등록 화면 (Form)
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("post", new Post());
        return "post/Form";
    }

    // 4. 게시글 등록 처리
    @PostMapping("/new")
    public String create(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/posts";
    }

    // 5. 게시글 수정 화면
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        Post post = postService.findbyId(id);
        model.addAttribute("post", post);
        return "post/Form";
    }

    // 6. 게시글 수정 처리
    @PostMapping("/{id}/edit")
    public String update(@PathVariable Long id, @ModelAttribute Post post) {
        postService.update(id, post);
        return "redirect:/posts/" + id;
    }
}