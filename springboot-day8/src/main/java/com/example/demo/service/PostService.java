package com.example.demo.service;

import com.example.demo.dto.PostDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Post;
import com.example.demo.model.User;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PostDTO updatePost(Long id, PostDTO postDTO) {
        Post post = postRepository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Post not found"));

        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        return modelMapper.map(postRepository.save(post), PostDTO.class);
    }

    public void deletePost(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Post not found"));
        post.setDeleted(true);
        postRepository.save(post);
    }
}
