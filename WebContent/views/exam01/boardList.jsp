<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, dto.*" %>


<%@ include file="/WEB-INF/views/common/header.jsp" %>

	<div class="card">
		<div class="card-header">boardList.jsp</div>
		<div class="card-body">

			<%
				List<Board> boards = new ArrayList<>();
			%>
			<%
				for (int i = 1; i <= 5; i++) {
					Board board = new Board();
					board.setBno(i);
					board.setBtitle("제목" + i);
					board.setBcontent("내용" + i);
					board.setBwriter("홍길동");
					board.setBdate(new Date());
					
					boards.add(board);

				}
			%>
			
			<table class ="table table-bordered">
				<thead>
					<tr> 
						<th>번호</th>
						<th>제목</th>
						<th>내용</th>
						<th>글쓴이</th>
						<th>날짜</th>
						
					</tr>
				</thead>
				<tbody>
						<%for(Board board : boards) {%>
							<tr>
								<td><%=board.getBno()%></td>
								<td><%=board.getBtitle()%></td>
								<td><%=board.getBcontent()%></td>
								<td><%=board.getBwriter()%></td>
								<td><%=board.getBdate()%></td>
							</tr>
							
						<%} %>
				</tbody>
			</table>
		</div>
	</div>
<%@ include file="/WEB-INF/views/common/footer.jsp" %>



</html>