package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller; // @RestController 아님!
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller // HTML 화면을 반환하기 위해 @Controller 사용
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // 게시글 작성 페이지 띄우기 (post가 없는 상태)
    @GetMapping("/posts/new")
    public String newPost(Model model) {
        model.addAttribute("post", null); // post를 null로 보내서 '작성' 모드로 띄움
        return "form"; // HTML 파일 이름 (form.html 이라면 "form")
    }

    // 게시글 수정 페이지 띄우기 (post가 있는 상태)
    @GetMapping("/posts/{id}/edit")
    public String editPost(@PathVariable Long id, Model model) {
        Post post = postService.findbyId(id);
        model.addAttribute("post", post); // 수정할 데이터를 담아서 보냄
        return "form"; // 같은 HTML 파일을 '수정' 모드로 재사용
    }
}