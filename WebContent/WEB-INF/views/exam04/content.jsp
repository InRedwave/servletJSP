<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
	<div class="card-header">
		content.jsp
	</div>
	<div class="card-body">

		<a href="/servletjsp/exam04/HtmlResponseController" class ="btn btn-info btn-sm">HTML 응답 생성</a>
		<a href="/servletjsp/exam04/JsonResponseController" class ="btn btn-info btn-sm">JSON 응답 생성</a>
		<a href="/servletjsp/exam04/FileResponseController" class ="btn btn-info btn-sm">파일 다운로드 응답 생성</a>
		
			
	</div>
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>