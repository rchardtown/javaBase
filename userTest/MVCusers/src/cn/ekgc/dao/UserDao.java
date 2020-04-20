package cn.ekgc.dao;

import java.util.List;

import cn.ekgc.entity.User;

public interface UserDao {
	/**
	 * <b>查询用户列表信息
	 * @return
	 */
	List<User> getAllUsers();
	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 */
	boolean saveUser(User user);
	/**
	 * <b>通过用户id查询
	 * @param userId
	 * @return
	 */
	User getUserById(Long userId);
	/**
	 * <b>更新用户信息</b>
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
	/**
	 * <b>删除用户信息</b>
	 * @param user
	 * @return
	 */
	boolean deleteUserByUserId(Long userId);

}
