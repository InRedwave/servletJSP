package servlet.exam04;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam04.ContentController", urlPatterns="/exam04/ContentController")
public class ContentController extends HttpServlet{
	
	//클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("exam03.ContentController.doGet() 실행");
	
		request.getRequestDispatcher("/WEB-INF/views/exam04/content.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("exam04.ContentController.doPost() 실행");
		
		
		
		request.getRequestDispatcher("/WEB-INF/views/exam04/content.jsp").forward(request, response);
	}
	
	
	
	
}
