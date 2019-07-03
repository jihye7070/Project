<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="../CSS/AccomodationList.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list}" var="list">
<div class="accomodationList"> <img src="./upfile/${list.accmodationImgstore}" />
<div class="detailContent">
    <h1><a href="RoomList?num=${list.accomodationNum}">${list.accomodationName } <b id="c">-${list.accmodationArea }-</b></a></h1>
    <p>주소: ${list.accomodationAdd }</p>  
    <p>숙소 번호: ${list.accmodationTell }</p> 
    <p>객실 평균 가격: <b id="b">${list.accomodationAvg }</b>원</p> 
    <b>${list.accomodationInform}</b>
</div>
</div>
</c:forEach>
</body>
</html>