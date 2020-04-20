package cn.ekgc.dao;

import java.util.List;

import cn.ekgc.entity.User;

public interface UserDao {
	/**
	 * <b>��ѯ�û��б���Ϣ
	 * @return
	 */
	List<User> getAllUsers();
	/**
	 * <b>�����û���Ϣ</b>
	 * @param user
	 * @return
	 */
	boolean saveUser(User user);
	/**
	 * <b>ͨ���û�id��ѯ
	 * @param userId
	 * @return
	 */
	User getUserById(Long userId);
	/**
	 * <b>�����û���Ϣ</b>
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
	/**
	 * <b>ɾ���û���Ϣ</b>
	 * @param user
	 * @return
	 */
	boolean deleteUserByUserId(Long userId);

}
