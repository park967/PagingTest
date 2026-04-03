package com.example.demo.service.impl;

import com.example.demo.domain.Post;
import com.example.demo.repositories.PostRepository;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    PostRepository postRepository;

    @Override
    public long count() {
        return postRepository.count();
    }
    // 조회수

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
    //저장하기

    @Override
    public Optional<Post> findById(long id) {
        return postRepository.findById(id);
    }
    //찾기
}
