<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>welcome to register page</h3>
	<form action="save" method="POST">
		<pre>
SHIPMENT MODE:
     <select name="shipMode">
     <option>--select--</option>
     <option>Air</option>
     <option>Truck</option>
     <option>Ship</option>
     <option>Train</option>
     </select>
 SHIPMENT CODE:
     <input type="text" name="shipCode">
  ENABLE SHIPMENT:
       <select name="enbShip">
       <option>--select--</option>
       <option>Yes</option>
       <option>No</option>
       </select>
   SHIPMENT GRADE:
      <input type="radio" name="shipGrade" value="A">A
      <input type="radio" name="shipGrade" value="B">B
      <input type="radio" name="shipGrade" value="C">A
   DESCRIPTION:
      <textarea name="shipDesc"></textarea>
      <input type="submit" value="CREATE SHIPMENT">
      
</pre>
	</form>
	${message}
</body>
</html>