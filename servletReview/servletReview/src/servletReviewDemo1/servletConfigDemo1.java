package servletReviewDemo1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 当servlet配置了初始化参数后，web容器在创建servlet实例对象时
 * 会自动将这些初始化参数封装到ServletConfig对象中
 * 并在调用servlet的init方法时，将ServletConfig对象传递给servlet
 * 进而，我们通过ServletConfig对象就可以得到当前servlet的初始化参数信息
 *@author clam
 *
 */
public class servletConfigDemo1 extends HttpServlet {
	/**
	 * 定义ServletConfig对象
	 * 用来接收初始化参数
	 */
	private ServletConfig config;
	/**
	 * 接收初始化参数
	 */
	public void init(ServletConfig config){
		this.config = config;
	}
	/**
	 * 检验初始化参数的接收
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param1 = this.config.getInitParameter("name");
		/*
		 * 输出name的value值
		 */
		PrintWriter out = response.getWriter();
		
		out.println(param1);
		
		Enumeration<String> params = this.config.getInitParameterNames();
		/*
		 * 输出全部参数的name和value值
		 */
		while(params.hasMoreElements()){
			String name = params.nextElement();
			out.println("name = "+ name);
			out.println("value = " + this.config.getInitParameter(name));
		}
	}

	

}
