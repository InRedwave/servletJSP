package servlet.exam01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;

@WebServlet(name="exam01.ContentController", urlPatterns="/exam01/ContentController")
public class ContentController extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {

		System.out.println("ContentController.init() 실행");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("service() 실행");

		// JSP로 이동
		request.getRequestDispatcher("/WEB-INF/views/exam01/content.jsp").forward(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("ContentController.destory() 실행");
	}

}
