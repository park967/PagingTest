package com.example.demo.service;

import com.example.demo.domain.Post;


import java.util.Optional;

public interface PostService {

    long count();
    Post save(Post post);
    Optional<Post> findById(long id);

}
