package cn.ekgc.service;

import java.util.List;

import cn.ekgc.entity.User;

public interface UserService {
	/**
	 * <b>查询用户列表信息</b>
	 * 
	 * @return
	 */
	List<User> findAllUsers();

	/**
	 * <b>添加用户信息
	 * 
	 * @param user
	 * @return
	 */
	boolean saveUser(User user);

	/**
	 * <b>通过用户id 查询
	 * 
	 * @param userId
	 * @return
	 */
	User findUserById(Long userId);

	/**
	 * <b>更新用户信息</b>
	 * 
	 * @param user
	 * @return
	 */
	boolean update(User user);

	/**
	 * <b>通过id删除用户信息</b>
	 * 
	 * @param userId
	 * @return
	 */
	boolean deleteUserByUserId(Long userId);

}
