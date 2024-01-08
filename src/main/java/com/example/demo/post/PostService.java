package com.example.demo.post;

import java.util.List;

public class PostService {
    private PostRepository postRepository;

    PostService(){
        this.postRepository = new PostRepository();
    }

    List<Post> findAll(){
        return postRepository.findAll();
    }
}
