<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="UTF-8">
<title>SIGN IN</title>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->

<link href="${pageContext.request.contextPath }/CSS/sign_in.css"
	rel="stylesheet" type="text/css">

</head>

<body>
	<!-- 헤더 인클루드 하지 말기-->
	<form action="CLogin" method="post">
		<div class="wrap_login">
			<a href="">
				<div id="log_logo">
					<img src="images/dc1.png" alt="" width="100%" height="300px">
				</div>
			</a>
			<p id="sub">담당자 로그인</p>
			<div id="log_box">
				<input type="text" name="id" id="id" placeholder="아이디"> <input
					type="password" name="password" id="password" placeholder="비밀번호">
			</div>
			<div class="login_info">
				<a href="">아이디 찾기</a> <span>|</span> <a href="">비밀번호 찾기</a> <span>|</span>
				<a href="">회원가입</a>
			</div>
			<div id="btn">
				<button type="submit" id="login_btn">
					<span>로그인</span>
				</button>
			</div>
		</div>
	</form>
</body>
</html>