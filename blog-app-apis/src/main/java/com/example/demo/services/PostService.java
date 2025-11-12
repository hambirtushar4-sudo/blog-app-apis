package com.example.demo.services;

import java.util.List;

import com.example.demo.payloads.PostDto;
import com.example.demo.payloads.PostResponse;

public interface PostService {

    // Create post
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    // Update post
    PostDto updatePost(PostDto postDto, Integer postId);

    // Delete post
    void deletePost(Integer postId);

    //  Get all posts (with pagination and sorting)
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    // Get post by ID
    PostDto getPostById(Integer postId);

    // Get posts by category
    List<PostDto> getPostsByCategory(Integer categoryId);

    // Get posts by user
    List<PostDto> getPostByUser(Integer userId);

    // Search posts by title keyword
    List<PostDto> searchPosts(String keyword);
}
