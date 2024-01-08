package com.example.demo.post;
public class Post {
    private final int id;
    private final String title;
    private final String contents;
    private final String author;

    public Post(int id, String title, String contents, String author) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getAuthor() {
        return author;
    }
}
