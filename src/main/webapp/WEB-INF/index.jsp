<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
</head>
<body>
<h1>Survey Sayssss</h1>

<form method="POST" action="/preview">

	<input name="name" type="text" class=form placeholder="your name" >
	
	<select name="location" class="select" >
		<option selected>Select Location:</option>
		<option value="San Jose">San Jose</option>
		<option value="Seattle">Seattle</option>
		<option value="Burbank">Burbank</option>
	</select>
	<select name="language" placeholder="language">
		<option selected>Select Language</option>
		<option value="Python">Python</option>
		<option value="Java" name="language">Java</option>
		<option value="C++">C++</option>
		
	</select>
	
	<span>Comment (Optional)</span>
	<textarea name="comments"></textarea>
	
	<button type="submit" >Submit</button>
	</form>
</body>
</html>