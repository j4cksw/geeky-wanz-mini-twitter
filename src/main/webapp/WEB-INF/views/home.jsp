<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<fmt:setLocale value="en_US"/>
<head>
<title>Geeky แว๊น  Mini Twitter | Home</title>
<link rel="stylesheet" href="resources/style2.css" type="text/css"/>
</head>
<body>
<div class="container">
	<div id="nav">
		<a href="/">Home</a> |

			<a href="/users/">Users</a> |
			<a href="/logout/">Sign out</a>

	</div>
	<h1>Geeky แว๊น  Mini Twitter</h1>


	<p>Welcome user1!
	Here you can store and share bookmarks!</p>

	<p>Hi user1!
      What is on your mind?</p> 
    <form method="post" action="add">
		<div style='display:none'>
			<input type='hidden' name='userID' id="userID" value='user1' />
		</div>
		<p>
			<label for="id_content">Say it:</label> 
			<textarea cols="40" rows="10" maxlength="140" name="message" id="message"></textarea>
		</p>
	<input type="submit" value="post" />
	</form>

	<table class="microposts">
		<c:forEach items="${postData}" var="data" varStatus="index">
		  <tr>
			<td colspan="1">
			  <span class="user">
				<a href="/users/1/">${data.userID}</a>
			  </span>
			  <span class="content">as ${data.message}</span>
			  <span class="timestamp">Posted <fmt:formatDate pattern="MMMM d, yyyy, hh:mm a" value="${data.created}" /></span>
			</td>
			
				<td colspan="0">
					<a href="delete?userID=${data.userID}&delete_index=${index.count}">delete</a>	    
				</td>
			
		  </tr>
		</c:forEach>
	</table>



</div>
</body>
</html>