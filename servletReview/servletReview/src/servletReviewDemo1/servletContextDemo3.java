package servletReviewDemo1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用ServletContext获取项目初始化参数
 *@author clam
 *
 */
public class servletContextDemo3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 获取context对象
		 */
		ServletContext context = this.getServletContext();
		/*
		 * 获取初始化参数
		 */
		String value = (String) context.getInitParameter("url");
		response.getWriter().println("name = url");
		response.getWriter().println("value = " + value);
	}
}
