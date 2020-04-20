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
	 * 查询用户列表信息
	 */
	@Override
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<User>();
		// SQL
		String sql = "select user_id ,username ,cellphone from sys_user";
		try {
			// 创建statement对象
			Statement statement = connection.createStatement();
			// 执行查询
			ResultSet resultSet = statement.executeQuery(sql);
			// 封装 查询对象为List类型
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
			// 除了查询之外都是executeUpdate
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
	 * <b>通过id查询用户信息</b>
	 */
	@Override
	public User getUserById(Long userId) {
		User user = new User();
		// sql
		String sql = "select user_id ,username ,cellphone from sys_user where user_id =?";
		try {
			// 创建PreparedStatement
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
	 * 删除用户信息
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
