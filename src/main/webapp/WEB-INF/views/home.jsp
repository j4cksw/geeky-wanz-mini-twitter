<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Geeky ·«Íπ  Mini Twitter | Home</title>
<link rel="stylesheet" href="resources/style2.css" type="text/css"/>
</head>
<body>
<div class="container">
	<div id="nav">
		<a href="/">Home</a> |
		
			<a href="/users/">Users</a> |
			<a href="/logout/">Sign out</a>
		
	</div>
	<h1>Geeky ·«Íπ  Mini Twitter</h1>
	

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
	
		<c:forEach items="${postData}" var="data">
		  <tr>
			<td colspan="1">
			  <span class="user">
				<a href="/users/1/">${data.userID}
				<c:out value="${data.message}" />
				</a>
			  </span>
			  <span class="content">as ${data.message}</span>
			  <span class="timestamp">${data.create}</span>
			</td>
			
				<td colspan="0">
				</td>
			
		  </tr>
		</c:forEach>
	</table>
	


</div>
</body>
</html>