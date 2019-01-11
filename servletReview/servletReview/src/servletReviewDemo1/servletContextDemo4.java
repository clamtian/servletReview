package servletReviewDemo1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用ServletContext实现请求转发
 *@author clam
 *
 */
public class servletContextDemo4 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("This is demo4");
		
		ServletContext context = this.getServletContext();
		
		RequestDispatcher dispatcher = context.getRequestDispatcher("/contextdemo5");//获取请求转发对象
		
		dispatcher.forward(request, response);//请求转发
	}
}
