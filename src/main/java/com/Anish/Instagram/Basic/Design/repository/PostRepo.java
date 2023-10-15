package com.Anish.Instagram.Basic.Design.repository;

import com.Anish.Instagram.Basic.Design.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Long> {
}
