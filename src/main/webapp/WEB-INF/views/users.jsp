<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Geeky แว๊น  Mini Twitter | Users</title>
<link rel="stylesheet" href="resources/style2.css" type="text/css"/>
</head>
<body>
<div class="container">
	<div id="nav">
		<a href="./">Home</a> |

			<a href="users">Users</a> |
			<a href="./">Sign out</a>

	</div>
	<h1>All Users</h1>


	<ul>
		<c:forEach items="${postData}" var="data">
		  <li>${data}</li>
		</c:forEach>
	</ul>



</div>
</body>
</html>