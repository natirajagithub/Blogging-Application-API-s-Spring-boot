package com.Natiraj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Natiraj.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
