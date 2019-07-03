<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%@page import="Model.*,java.util.*"%> 
<%  List<String> seat =(List)request.getAttribute("List"); 
    Long pNum=(Long)request.getAttribute("dNum");
String seats[];
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
<%if(seat!=null){%>
<%  for(int i=0; i< seat.size(); i++){
  seats=seat.get(i).split("_");	%>
#seat_<%=seats[1]%>_<%=seats[2]%>{
	width:10%; 
	float:left; 
	height:20px; 
	margin:1px; 
	background-color:red; 
	border:1px solid #ccc;}



<%}}%>

</style>
<script type="text/javascript">
document.getElementById("pNum").value="<%=pNum%>";

</script>
</head>
<body>

</body>
</html>