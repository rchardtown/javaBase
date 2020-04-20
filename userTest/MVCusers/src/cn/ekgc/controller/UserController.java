package cn.ekgc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ekgc.entity.User;
import cn.ekgc.service.UserService;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���ñ����ʽ
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// ��ȡuri
		String uri = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/"));
		// �ַ�uri

		if ("/list".equals(uri)) {
			// ��ѯ�û��б�
			List<User> userList = userService.findAllUsers();
			// ���ص�������
			request.setAttribute("userList", userList);
			// ͨ��dispatcher ����ת��
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/user/lis.jsp");
			dispatcher.forward(request, response);
		} else if ("/add".equals(uri)) {
			// ת��������ҳ��
			// dispatcher ����
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/user/add.jsp");
			dispatcher.forward(request, response);
		} else if ("/update".equals(uri)) {
			// �޸��û���Ϣ
			// ͨ��id ��ѯ
			Long userId = Long.parseLong(request.getParameter("user_id"));
			User user = userService.findUserById(userId);
			// ���ص�������
			request.setAttribute("user", user);
			// ת������ѯҳ��
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/user/update.jsp");
			dispatcher.forward(request, response);

		} else if ("/delete".equals(uri)) {
			// ɾ���û���Ϣ
			// ����idɾ��
			Long userId = Long.parseLong(request.getParameter("id"));
			//���÷���ɾ��
			boolean flag = userService.deleteUserByUserId(userId);
			response.sendRedirect(request.getContextPath()+"/user/list");
		}else if ("detail".equals(uri)) {
			//չʾ����
			//��ȡ�û���Ϣ
			Long userId =Long.parseLong(request.getParameter("id"));
			User user = userService.findUserById(userId);
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/user/detail.jsp");
			dispatcher.forward(request, response);
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���ñ����ʽ
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// ��ȡuri
		String uri = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/"));
		if ("/add".equals(uri)) {
			// ��ȡ����
			String username = request.getParameter("username");
			String cellphone = request.getParameter("cellphone");
			// ���ύ�����ݼ���
			if (username != null && "".equals(username.trim()) && cellphone != null && "".equals(cellphone.trim())) {
				// ���ݷ�װ
				User user = new User();
				user.setUsername(username);
				user.setCellphone(cellphone);
				// ����
				boolean flag = userService.saveUser(user);
				if (flag) {
					response.sendRedirect(request.getContextPath() + "/user/list");
				} else {
					response.sendRedirect(request.getContextPath() + "/user/add");
				}
			}

		} else if ("/update".equals(uri)) {
			// �޸��û���Ϣ

			// ��ȡ����
			Long userId = Long.parseLong(request.getParameter("userId"));
			String username = request.getParameter("username");
			String cellphone = request.getParameter("cellphone");
			// ��������
			if (username != null && !"".equals(username.trim()) && cellphone != null && !"".equals(cellphone)) {
				// ��װ����
				User user = new User();
				user.setUserId(userId);
				user.setUsername(username);
				user.setCellphone(cellphone);

				// ����
				boolean flag = userService.update(user);
				// �ض��򵽽����Ӧ��ҳ��
				if (flag) {
					response.sendRedirect(request.getContextPath() + "/user/list");
					return;
				} else {
					response.sendRedirect(request.getContextPath() + "/user/update");
				}
			}

		}
	}
}