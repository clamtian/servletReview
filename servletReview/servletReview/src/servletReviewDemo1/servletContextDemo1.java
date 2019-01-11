package servletReviewDemo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在Demo1中创建数据
 * 使用ServletContext在Demo2中访问该数据
 *@author clam
 *
 */
public class servletContextDemo1 extends HttpServlet {
	/*
	 * data是在Demo2中将要访问的数据
	 */
	private String data = "This is clam";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 获得ServletContext对象
		 * 使用ServletConfig中的getServletContext()方法
		 */
		ServletContext context = this.getServletConfig().getServletContext();
		/*
		 * 将data放入context域中
		 */
		context.setAttribute("data", data);
	}
}
