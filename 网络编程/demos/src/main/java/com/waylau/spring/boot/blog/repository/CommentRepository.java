package com.waylau.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waylau.spring.boot.blog.entity.Comment;

/**
 * Comment 仓库.
 *
 * @since
 * @author
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
