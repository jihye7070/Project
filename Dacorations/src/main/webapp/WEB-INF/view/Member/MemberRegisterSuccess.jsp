<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>SUCCESS SIGN UP</title>
    <style></style>
    <script></script>
    <link href="https://fonts.googleapis.com/css?family=Jua|Play" rel="stylesheet">
    <!--폰트-->
    <!--body { font-family: "Jua", sans-serif;} -->

    <link href="../CSS/success.css" rel="stylesheet" type="text/css">
</head>

    <!-- 헤더 인클루드 하지 말기-->
<body>
    <div class="wrap_success">
        <a href="">
            <div id="logo">
                <img src="../images/logo.png" alt="" width="100%" height="300px">
            </div>
        </a><br>
        <div class="success_box">
            <h1>회원가입 완료</h2>
            <div class="h2"><h2>아이디: ${mDto.memberId}</h2></div>
          <div class="h2"><h2>이  름 : ${mDto.memberName}</h2></div>
            <div class="h2"><h2>이메일: ${mDto.memberMail}</h2></div>
        </div>
        <div id="link">
           <ul>
               <li><a href="Login">로그인하기</a></li>
           </ul>
        </div>
    </div>
</body>

</html>