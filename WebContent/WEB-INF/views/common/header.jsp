<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>SpringFramework</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
		<div class="d-flex flex-column vh-100">
			<nav class="navbar navbar-dark bg-dark text-white font-weight-bold">
				<a class="navbar-brand" href="/"> 
					<img src="/servletjsp/resources/images/tomcat.png" width="40" height="30" class="d-inline-block align-top">
					Servlet/JSP
				</a>
				<div>
					<div>
						<a href="#" class="btn btn-success btn-sm">로그인</a>
					</div>
				</div>
			</nav>
	
			<div class="flex-grow-1 container-fluid">
				<div class="row h-100">
					<div class="col-md-4 p-3 bg-dark">
						<div class="h-100 d-flex flex-column">
							<div class="flex-grow-1" style="height: 0px; overflow-y: auto; overflow-x: hidden;">
								<%@ include file="/WEB-INF/views/common/menu.jsp" %>
							</div>
						</div>
					</div>
	
					<div class="col-md-8 p-3">
						<div class=" h-100 d-flex flex-column">
							<div class="flex-grow-1 overflow-auto pr-3" style="height: 0px">