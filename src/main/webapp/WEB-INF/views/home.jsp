<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user1 Mini Twitter</title>
<link rel="stylesheet" href="resources/style2.css" type="text/css"/>
</head>
<body align="center">

	<h1>Geek แว๊น Mini Twitter</h1>
	
	

	<p>Welcome user1!<br>Here you can store and share bookmarks!</p>
	
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
						
						<input type="submit" value="post" />
					</td>
				</tr>
			</table>
	</form>
	<div align="center">
		<table class="microposts">
			<% for(int i=0;i<10;i++) {%>
				  <tr>
					<td colspan="1">
					  <span class="user">
						user1
					  </span>
					  <span class="content">Item  </span>
					  <span class="timestamp">Posted July 6, 2013, 9:22 p.m.</span>
					</td>
					<td colspan="0">	      
					</td>
					
				  </tr>
			<%}%>
		</table>
	</div>
	
	</body>
</html>