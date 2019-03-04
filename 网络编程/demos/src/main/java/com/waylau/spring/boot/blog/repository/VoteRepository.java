package com.waylau.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waylau.spring.boot.blog.entity.Vote;

/**
 * Vote 仓库.
 *
 * @since
 * @author
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
