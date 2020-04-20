package cn.ekgc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.ekgc.dao.UserDao;
import cn.ekgc.entity.User;
import cn.ekgc.util.ConnectionUtil;

public class UserDaoImpl implements UserDao {
	Connection connection = ConnectionUtil.getConnection();

	/**
	 * ��ѯ�û��б���Ϣ
	 */
	@Override
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<User>();
		// SQL
		String sql = "select user_id ,username ,cellphone from sys_user";
		try {
			// ����statement����
			Statement statement = connection.createStatement();
			// ִ�в�ѯ
			ResultSet resultSet = statement.executeQuery(sql);
			// ��װ ��ѯ����ΪList����
			while (resultSet != null) {
				User user = new User();
				user.setUserId(resultSet.getLong("user_id"));
				user.setUsername(resultSet.getString("username"));
				user.setCellphone(resultSet.getString("cellphone"));
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;

	}

	@Override
	public boolean saveUser(User user) {
		// Sql
		String sql = "insert into sys_user (username,cellphone)values(?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getCellphone());
			// ���˲�ѯ֮�ⶼ��executeUpdate
			int conut = statement.executeUpdate(sql);
			if (conut > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * <b>ͨ��id��ѯ�û���Ϣ</b>
	 */
	@Override
	public User getUserById(Long userId) {
		User user = new User();
		// sql
		String sql = "select user_id ,username ,cellphone from sys_user where user_id =?";
		try {
			// ����PreparedStatement
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setLong(1, userId);
			ResultSet resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				user.setUserId(resultSet.getLong("user_id"));
				user.setUsername(resultSet.getString("username"));
				user.setCellphone(resultSet.getString("cellphone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean updateUser(User user) {
		String sql = "update sys_user set username=? ,cellphone=? where user_id =?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getCellphone());
			statement.setLong(3, user.getUserId());
			int count = statement.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * ɾ���û���Ϣ
	 */
	@Override
	public boolean deleteUserByUserId(Long userId) {
		String sql = "delete from sys_user where user_id =?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setLong(1, userId);
			int cont = statement.executeUpdate();
			if (cont > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
