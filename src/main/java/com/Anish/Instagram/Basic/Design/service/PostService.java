package com.Anish.Instagram.Basic.Design.service;

import com.Anish.Instagram.Basic.Design.model.Post;
import com.Anish.Instagram.Basic.Design.model.User;
import java.util.List;

public interface PostService {
      Post savePost(Post post);
    List<Post> getPostsByUser(User user);
}