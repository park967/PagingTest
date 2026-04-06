package com.example.demo.service.impl;


import com.example.demo.domain.Post;
import com.example.demo.repositories.PostRepository;
import com.example.demo.service.PostService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {


    private final PostRepository postRepository;

    @Override
    public Post save(Post post) {
        Post postSave = Post.builder()
                .title(post.getTitle())
                .content(post.getContent())
                .author(post.getAuthor())
                .build();

        return postRepository.save(postSave);
    }

    @Override
    public List<Post> findAll() {

        return postRepository.findAll();
    }

    @Override
    public Post findbyId(long id) {
        return postRepository.findById(id).orElseThrow(() -> new RuntimeException("Camping not found"));
    }

    // update
    @Override
    @Transactional // 중요: 트랜잭션 안에서 엔티티를 변경해야 변경 감지가 동작합니다.
    public Post update(long id, Post post) {
        // 1. 수정할 기존 데이터를 먼저 조회합니다.
        Post postUpdate = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found with id: " + id));
        postUpdate.setTitle(post.getTitle());
        postUpdate.setContent(post.getContent());


        return postUpdate;
    }

    @Override public void delete(long id) {
       postRepository.deleteById(id);

   }
}
