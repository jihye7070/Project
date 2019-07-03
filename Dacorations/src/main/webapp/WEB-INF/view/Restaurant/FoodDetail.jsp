<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="Model.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style></style>
    <script></script>
    <link href="https://fonts.googleapis.com/css?family=Jua|Play" rel="stylesheet">
    <!--폰트-->
    <!--body { font-family: "Jua", sans-serif;} -->
    <link href="${pageContext.request.contextPath }/CSS/food_detail.css" rel="stylesheet" type="text/css">
</head>

<body>
    <div class="wrap_food_detail">
        <p id="sub">음식 정보</p>
        <table class="table">
            <tr>
                <td>음식 이름</td>
                <td>${fdto.foodName }</td>
            </tr>
            <tr>
                <td>음식 타입</td>
                <td>${fdto.foodType }</td>
            </tr>
            <tr>
                <td>음식 가격</td>
                <td>${fdto.foodPrice }원</td>
            </tr>
            <tr>
                <td>음식 이미지</td>
                <td><img src="Product/date//${fdto.foodImgStore}" width="200" height="200" alt=""></td>
            </tr>
            <tr>
                <td>음식 정보</td>
                <td>${fdto.foodInfo }</td>
            </tr>
        </table>
    </div>
</body>
</html>