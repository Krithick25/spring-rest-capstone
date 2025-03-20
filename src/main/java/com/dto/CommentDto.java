package com.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CommentDto {
    private Long id;
    private Long blogId;
    
    @NotBlank
    @Size(min = 3, max = 200)
    private String comment;

    // Constructor
    public CommentDto(Long id, String comment, Long blogId) {
        this.id = id;
        this.comment = comment;
        this.blogId = blogId;
    }

    // Default constructor
    public CommentDto() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }
}
