<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>FIND ID</title>
    <style></style>
    <script></script>
    <link href="https://fonts.googleapis.com/css?family=Jua|Play" rel="stylesheet">
    <!--폰트-->
    <!--body { font-family: "Jua", sans-serif;} -->

    <link href="${pageContext.request.contextPath }/CSS/find.css" rel="stylesheet" type="text/css">
</head>

    <!-- 헤더 인클루드 하지말기-->
<body>
    <div class="wrap_find">
        <a href="Main">
            <div id="logo">
                <img src="images/dc1.png" alt="" width="100%" height="300px">
            </div>
        </a>
        <div id="find_box">
            <h2>아이디 찾기</h2>
            <input type="text" name="email" id="email" placeholder="이메일을 입력해주세요">
        </div>
        <div id="btn">
            <button type="submit" id="find_btn"><span>ID 찾기</span></button>
        </div>
    </div>
</body>

</html>