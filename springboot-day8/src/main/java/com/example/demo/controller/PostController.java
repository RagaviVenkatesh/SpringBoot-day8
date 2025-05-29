package com.example.demo.controller;

import com.example.demo.dto.PostDTO;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PutMapping("/{id}")
    public PostDTO updatePost(@PathVariable Long id, @RequestBody PostDTO postDTO) {
        return postService.updatePost(id, postDTO);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return "Post deleted (soft delete)";
    }
}
