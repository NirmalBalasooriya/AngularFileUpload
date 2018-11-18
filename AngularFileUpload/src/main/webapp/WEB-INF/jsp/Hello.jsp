<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<body>
 Welcome to Spring Boot JSP page
 <br>
 Message: ${message}
 <br>
 <br>
 List of countries from DB: ${countries}
 
 
		<form method="POST" enctype="multipart/form-data" action="uploadfile">
			<table>
				<tr><td>File to upload:</td><td><input type="file" name="file" /></td></tr>
				<tr><td></td><td><input type="submit" value="Upload" /></td></tr>
			</table>
		</form>
 
</body>
</html>