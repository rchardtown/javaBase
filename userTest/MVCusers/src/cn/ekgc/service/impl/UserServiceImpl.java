package cn.ekgc.service.impl;

import java.util.List;

import cn.ekgc.dao.UserDao;
import cn.ekgc.entity.User;
import cn.ekgc.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	/**
	 * <b>�����û���Ϣ</b>
	 */
	@Override
	public boolean saveUser(User user) {

		return userDao.saveUser(user);
	}

	/**
	 * <b>ͨ��id��ѯ�û���Ϣ
	 */
	@Override
	public User findUserById(Long userId) {
		return userDao.getUserById(userId);
	}

	/**
	 * <b>�����û���Ϣ</b>
	 */
	@Override
	public boolean update(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUserByUserId(Long userId) {
		// TODO Auto-generated method stub
		return false;
	}

}