package com.example.demo;

import com.example.demo.domain.Post;
import com.example.demo.domain.users;
import com.example.demo.repositories.PostRepository;
import com.example.demo.repositories.PostRepository;
import com.example.demo.repositories.UsersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    PostRepository postRepository;

    @Test
    void contextLoads() {
        List<users> User = usersRepository.findAll();

        for (users user: User){
            System.out.println("이름" + user.getName());
        }

        List<Post> Post = postRepository.findAll();

        for (Post post: Post){
            System.out.println(post.getTitle());
        }




    }


}
