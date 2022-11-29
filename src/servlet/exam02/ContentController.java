package servlet.exam02;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="exam02.ContentController", urlPatterns="/exam02/ContentController")

public class ContentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//클라이언트가 요청할 때 마다 호출 (요청 방식과는 상관 없다)
	//역할 : 요청 처리
	 @Override
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/WEB-INF/views/exam02/content.jsp").forward(request, response);
	}
	

}
