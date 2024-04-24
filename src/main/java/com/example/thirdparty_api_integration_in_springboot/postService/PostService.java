package com.example.thirdparty_api_integration_in_springboot.postService;

import java.util.List;
import java.util.Map;

public interface PostService {

    List<Map<String, Object>> getPosts();

    Map<String, Object> getPostsById(int id);

    Map<String, Object> insertPost(Map<String, Object> payload);
    Map<String, Object> updatePost(Map<String, Object> payload, int id);
    Map<String, Object> deletePost(int id);
}
