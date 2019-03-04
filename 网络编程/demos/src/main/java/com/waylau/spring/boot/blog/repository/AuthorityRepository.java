package com.waylau.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waylau.spring.boot.blog.entity.Authority;

/**
 * Authority 仓库.
 *
 * @since
 * @author
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
