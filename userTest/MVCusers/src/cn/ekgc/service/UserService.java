package cn.ekgc.service;

import java.util.List;

import cn.ekgc.entity.User;

public interface UserService {
	/**
	 * <b>��ѯ�û��б���Ϣ</b>
	 * 
	 * @return
	 */
	List<User> findAllUsers();

	/**
	 * <b>�����û���Ϣ
	 * 
	 * @param user
	 * @return
	 */
	boolean saveUser(User user);

	/**
	 * <b>ͨ���û�id ��ѯ
	 * 
	 * @param userId
	 * @return
	 */
	User findUserById(Long userId);

	/**
	 * <b>�����û���Ϣ</b>
	 * 
	 * @param user
	 * @return
	 */
	boolean update(User user);

	/**
	 * <b>ͨ��idɾ���û���Ϣ</b>
	 * 
	 * @param userId
	 * @return
	 */
	boolean deleteUserByUserId(Long userId);

}