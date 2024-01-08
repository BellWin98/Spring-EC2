package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    List<Post> posts;
    PostRepository(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1, "title1", "contents1", "bellwin"));
        this.posts.add(new Post(2, "title2", "contents2", "minji"));
        this.posts.add(new Post(3, "title3", "contents3", "jongseung"));
        this.posts.add(new Post(4, "title4", "contents4", "sinsung"));
    }

    public List<Post> findAll(){
        return this.posts;
    }
}
