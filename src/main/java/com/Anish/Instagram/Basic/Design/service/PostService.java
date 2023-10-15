package com.Anish.Instagram.Basic.Design.service;

import com.Anish.Instagram.Basic.Design.model.Post;
import com.Anish.Instagram.Basic.Design.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepo postRepo;

    public Post savePost(Post post) {
        return postRepo.save(post);
    }

    public Post getPost(Long postId) {
        return postRepo.findById(postId).orElse(null);
    }
}
