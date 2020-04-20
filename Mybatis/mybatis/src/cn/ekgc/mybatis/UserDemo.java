package cn.ekgc.mybatis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.ekgc.mybatis.entity.User;

public class UserDemo {
	@Test
	public void addUser() throws Exception {
		InputStream inputStream = UserDemo.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		User user = new User("´ÞÌÎ", "123456");
		int count = sqlSession.insert("userMapper.saveUser", user);

		if (count > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
	}

	@Test
	public void updateUser() throws Exception {
		InputStream inputStream = UserDemo.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		User user = new User(1L, "Æ½Æ½", "123-14564");
		int count = sqlSession.update("userMapper.updateUser", user);
		if (count > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
	}
	
	@Test
	public void deleteUser()throws Exception {
		InputStream inputStream = UserDemo.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

			int cont =sqlSession.delete("userMapper.deleteUserById",10L);
		if (cont >0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
	}
	
	@Test
	public void findAllUser()throws Exception{
		
		InputStream inputStream = UserDemo.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		List<User> userList = sqlSession.selectList("userMapper.findAllUsers");
		for (User user : userList) {
			System.out.println(user.getCellphone() +"    "+user.getUsername());
		} 
	}
}
