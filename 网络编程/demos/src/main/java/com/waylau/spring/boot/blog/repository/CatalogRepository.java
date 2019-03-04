package com.waylau.spring.boot.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waylau.spring.boot.blog.entity.Catalog;
import com.waylau.spring.boot.blog.entity.User;

/**
 * Catalog 仓库.
 *
 * @since
 * @author
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	
	/**
	 * 根据用户查询
	 * @param user
	 * @return
	 */
	List<Catalog> findByUser(User user);
	
	/**
	 * 根据用户查询
	 * @param user
	 * @param name
	 * @return
	 */
	List<Catalog> findByUserAndName(User user, String name);
}
