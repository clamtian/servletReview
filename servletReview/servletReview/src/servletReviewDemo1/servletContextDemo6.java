package servletReviewDemo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用ServletContext读取文件资源
 *@author clam
 *
 */
public class servletContextDemo6 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/c3p0.properties");
		
		InputStream in = new FileInputStream(path);
		
		Properties prop = new Properties();
		prop.load(in);
		
		String driver = prop.getProperty("c3p0.driverClass");
		String url = prop.getProperty("c3p0.jdbcUrl");
		String user = prop.getProperty("c3p0.user");
		String password = prop.getProperty("c3p0.password");

		response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},user={2},password={3}", 
                        driver,url, user, password));
		
		
	}

}
