package com.cprms.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cprms.domain.User;
import com.cprms.service.UserService;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		request.setCharacterEncoding("utf-8");
		
		UserService uService = new UserService();
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		User form = new User(username,password,null);
		try {
			uService.regist(form);
			response.getWriter().print("<h1>注册成功，<a href='"+request.getContextPath()+"/user/login.jsp'>点击登录</a>");
		} catch (Exception e) {
			String msg = e.getMessage();
			request.setAttribute("msg", msg);
			request.setAttribute("form", form);
			request.getRequestDispatcher("/user/regist.jsp").forward(request, response);
		}
		
		
	}

}
