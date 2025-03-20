package com.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BlogDto {
    private Long id;

    @NotBlank(message = "Title cannot be empty")
    @Size(min = 3, max = 100)
    private String title;

    @NotBlank(message = "Content cannot be empty")
    @Size(min = 3, max = 200)
    private String content;

    public BlogDto() {
    }

    public BlogDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}