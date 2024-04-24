package com.example.thirdparty_api_integration_in_springboot.controller;

import com.example.thirdparty_api_integration_in_springboot.postService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/getPosts")
    List<Map<String, Object>> getAllPosts() {
        return postService.getPosts();
    }

    @GetMapping("/getPostsById/{id}")
    Map<String, Object> getPostsById(@PathVariable int id) {
        return postService.getPostsById(id);
    }

    @PostMapping("/insertPosts")
    Map<String, Object> insertPosts(@RequestBody Map<String, Object> payload) {
        return postService.insertPost(payload);
    }

    @PutMapping("/updatePosts/{id}")
    Map<String, Object> updatePosts(@RequestBody Map<String, Object> payload, @PathVariable int id) {
        return postService.updatePost(payload, id);
    }

    @DeleteMapping("/deletePosts/{id}")
    Map<String, Object> deletePosts(@PathVariable int id) {
        return postService.deletePost(id);
    }
}
