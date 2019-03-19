package com.cprms.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cprms.domain.User;
import com.cprms.domain.UserException;
import com.cprms.service.UserService;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User form = new User(username,password,null);
		
		UserService uService = new UserService();
		User user;
		try {
			user = uService.login(form);
		} catch (UserException e) {
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			request.getRequestDispatcher("/user/login.jsp").forward(request, response);
			return;
		}
		HttpSession session = request.getSession();
		session.setAttribute("user",user);
		response.sendRedirect(request.getContextPath()+"/user/welcome.jsp");
		
	}

}
