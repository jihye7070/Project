<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script>
function complete(){
	self.close();
}
</script>
<style>
#container{
	width:100%;
	height:100%;
	text-align:center;
}
#complete{
    font-size:40px;
    display:inline-block;
   	margin-top:300px;
    margin-bottom:20px;
}
</style>
<body>
<div id="container">
<div id="complete">등록이 완료되었습니다</div><br>
<button onclick="complete();">닫기</button>
</div>
</body>
</html>