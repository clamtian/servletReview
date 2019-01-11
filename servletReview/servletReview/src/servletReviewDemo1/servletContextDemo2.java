package servletReviewDemo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在Demo2中访问data数据
 *@author clam
 *
 */
public class servletContextDemo2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 获取ServletContext对象
		 * 使用Servlet中的getServletContext()方法
		 */
		ServletContext context = this.getServletContext();
		/*
		 * 获取data元素
		 */
		String data = (String) context.getAttribute("data");
		
		response.getWriter().println(data);
	}

}
