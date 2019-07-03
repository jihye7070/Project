<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<% int duplicate =(int)request.getAttribute("result"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%if(duplicate==1){ %>
	<div id="Duplicate" style="color: red" value="1">아이디가 이미 존재합니다.</div>

	<%}else{ %>
	<div id="idDuplicateCheck" style="color: green">아이디 사용이 가능합니다.</div>

	<script type="text/javascript">

	
</script>
	<%} %>
</body>
</html>