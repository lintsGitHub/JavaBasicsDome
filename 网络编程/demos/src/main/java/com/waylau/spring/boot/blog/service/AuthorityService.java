package com.waylau.spring.boot.blog.service;

import com.waylau.spring.boot.blog.entity.Authority;

/**
 * Authority 服务接口.
 * 
 * @since
 * @author
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param 用户ID
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
