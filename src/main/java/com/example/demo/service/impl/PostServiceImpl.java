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

    @Autowired
    PostRepository postRepository;

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> findAll() {

        return postRepository.findAll();
    }

    @Override
    public Post findbyId(long id) {
        return postRepository.findById(id).orElseThrow(() -> new RuntimeException("Camping not found"));
    }

  //  @Override
   // public Post update(long id, Post post) {
       // Post post = findbyId(id);

      //  return ;
   // }

  //  @Override public void delete(long id) {
   //     postRepository.deleteById(id);

   // }
}
