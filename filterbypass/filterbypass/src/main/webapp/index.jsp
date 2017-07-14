<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>XSS Filter Bypass Example</title>
</head>
<body>

<div align="center" style="margin-top: 50px;">

    <form action="SanitizerServlet">
        Please enter your Text:  <input type="text" name="maltext" size="20px"> <br>
        <input type="submit" value="submit">
    </form>

</div>

</body>
</html>