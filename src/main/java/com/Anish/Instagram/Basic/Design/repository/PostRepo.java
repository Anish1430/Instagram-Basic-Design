package com.Anish.Instagram.Basic.Design.repository;

import com.Anish.Instagram.Basic.Design.model.Post;
import com.Anish.Instagram.Basic.Design.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Long> {
    List<Post> findByUser(User user);
}
