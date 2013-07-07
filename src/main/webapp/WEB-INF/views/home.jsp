<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user1 Mini Twitter</title>
<link rel="stylesheet" href="resources/style2.css" type="text/css"/>
</head>
<body align="center">

	<h1>Geek แว๊น Mini Twitter</h1>
	

	<p>Welcome noppakrit_t!<br>Here you can store and share bookmarks!</p>
	
	<p>Hi user1!<br>What is on your mind?</p> 
    <form method="post" action="add">
		<p>
			<table align="center">
				<tr valign="top">
					<td><label for="id_content">Say it:</label></td>
					<td>
						<input type="hidden" name="userID" id="userID" value="user1">
						<textarea cols="40" rows="10" maxlength="140" name="message" id="message"></textarea>
					</td>
				</tr>
				<tr valign="top">
					<td />
					<td >
						
						<input type="submit" value="      post      " />
					</td>
				</tr>
			</table>
	</form>
	<div align="center">
		<table class="microposts">
		
		  <tr >
			<td colspan="1">
			  <span class="user">
				<a href="/users/5/">noppakrit_t</a>
			  </span>
			  <span class="content">as</span>
			  <span class="timestamp">Posted July 6, 2013, 9:34 p.m.</span>
			</td>
			
				<td colspan="0">
				</td>
			
		  </tr>
		  <tr>
			<td colspan="1">
			  <span class="user">
				<a href="/users/5/">noppakrit_t</a>
			  </span>
			  <span class="content">as</span>
			  <span class="timestamp">Posted July 6, 2013, 9:34 p.m.</span>
			</td>
			
				<td colspan="0">
				</td>
			
		  </tr>
		  <tr>
			<td colspan="1">
			  <span class="user">
				<a href="/users/5/">noppakrit_t</a>
			  </span>
			  <span class="content">as</span>
			  <span class="timestamp">Posted July 6, 2013, 9:34 p.m.</span>
			</td>
			
				<td colspan="0">
				</td>
			
		  </tr>
		  <tr>
			<td colspan="1">
			  <span class="user">
				<a href="/users/5/">noppakrit_t</a>
			  </span>
			  <span class="content">as</span>
			  <span class="timestamp">Posted July 6, 2013, 9:34 p.m.</span>
			</td>
			
				<td colspan="0">
				</td>
			
		  </tr>
		</table>
	</div>
	
	</body>
</html>