package servlet.exam04;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam04.FileResponseController", urlPatterns="/exam04/FileResponseController")
public class FileResponseController extends HttpServlet{
	
	//클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = "사진1.jpg"; //사용자가 올린 파일 이름
		String filePath = "C:/Temp/photo1.jpg"; //실제로 저장된 파일 이름
		String contentType = "image/jpeg"; //contentType
		
		
/*		PrintWriter pw = response.getWriter();*/
		//이미지 파일이므로 ServletOutputStream 사용해야 한다.
		
		//HTTP 응답에 Content-Type 헤더를 추가
		response.setContentType("contentType");
		/*response.setHeader("Content-Type", contentType);*/
		//동일한 표현, 많이 사용되어서 setContentType 메소드를 만들어 놓음.
		
		
		//Browser의 종류 얻기
		String userAgent = request.getHeader("User-Agent");
		if(userAgent.contains("Trident") || userAgent.contains("MSIE")) {
			//IE (internet Explorer) Trident = IE 11ver. 이하는 MSIE 포함됨.
			fileName = URLEncoder.encode(fileName, "UTF-8");
		} else {
			//Chrome, Edge, FireFox, Safari 일 경우
			fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		}
		System.out.println(fileName);
		
		
		
		
		
		//HTTP 응답에 Content-Disposition 헤더를 추가
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		
		//HTTP 응답 본문에 파일 데이터 출력하기
		ServletOutputStream sos = response.getOutputStream();
		
		
		
		//내부적으로 close가 되어서 close 해주지 않아도 된다.
		
		
		/* 방법 1자바 : 817page 
		FileInputStream fis = new FileInputStream(filePath);
		byte[] data = new byte[1024];
		
		while (true) {
			int readByteNum = fis.read(data);
			if(readByteNum == -1) break; //더 읽을 내용이 없다.
			sos.write(data, 0, readByteNum);
		}
		sos.flush();
		fis.close();
		sos.close();
		*/
		
		//방법2
		Path path = Paths.get(filePath);
		Files.copy(path, sos);
		sos.flush();
		sos.close();
		
		
		
		
		
	}
	
	
	
	
	
}
