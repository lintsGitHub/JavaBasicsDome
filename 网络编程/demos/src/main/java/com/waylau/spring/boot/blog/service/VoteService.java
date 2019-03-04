package com.waylau.spring.boot.blog.service;

import com.waylau.spring.boot.blog.entity.Vote;

/**
 * Vote 服务接口.
 * 
 * @since
 * @author
 */
public interface VoteService {
	/**
	 * 根据id获取 Vote
	 * @param id
	 * @return
	 */
	Vote getVoteById(Long id);
	/**
	 * 删除Vote
	 * @param id
	 * @return
	 */
	void removeVote(Long id);
}
