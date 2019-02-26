package com.waylau.spring.boot.blog.service;

import com.waylau.spring.boot.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 * @since
 * @author
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
