package com.example.thirdparty_api_integration_in_springboot.postService;

import java.util.List;
import java.util.Map;

public interface PostService {

    List<Map<String, Object>> getPosts();
}
