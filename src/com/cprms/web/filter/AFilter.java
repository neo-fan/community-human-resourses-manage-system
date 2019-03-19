package com.cprms.web.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/user/welcome.jsp" })
public class AFilter implements Filter {
	private FilterConfig fConfig;
    public AFilter() {
    }
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//ServletContext applicatoin =fConfig.getServletContext();
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		if (session.getAttribute("user") != null) {
			chain.doFilter(request, response);	
		}else {
			String path = request.getServletContext().getContextPath();
			System.out.println(path);
			response.setCharacterEncoding("utf8");
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("<p>请登录！</p> <a href='"+path+"/user/login.jsp'>登录</a>");
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}
}
