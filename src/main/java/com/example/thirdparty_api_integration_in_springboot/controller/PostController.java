package com.example.thirdparty_api_integration_in_springboot.controller;

import com.example.thirdparty_api_integration_in_springboot.postService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
