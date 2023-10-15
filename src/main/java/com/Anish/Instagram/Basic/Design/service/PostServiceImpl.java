package com.Anish.Instagram.Basic.Design.service;

import com.Anish.Instagram.Basic.Design.model.Post;
import com.Anish.Instagram.Basic.Design.model.User;
import com.Anish.Instagram.Basic.Design.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepo postRepo;

    @Override
    public Post savePost(Post post) {
        // You might want to add validation logic here
        return postRepo.save(post);
    }

    @Override
    public List<Post> getPostsByUser(User user) {
        return postRepo.findByUser(user);
    }
}
