<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/restaurant_list.css"
	rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}" var="list">
		<div class="accomodationList">
			<img src="Restaurant/upfile/${list.restaurantImage }" />
			<div class="detailContent">
				<h3>
					<a href="RestaurantDetail?num=${list.restaurantNum }">${list.restaurantName }</a>
				</h3>
				<p>주소:${list.restaurantAdd }</p>
				<p>번호: ${list.restaurantTell }</p>
				<p>종류: ${list.restaurantKind }</p>
				<b>${list.restaurantInfo }</b>
			</div>
		</div>
	</c:forEach>
		<div id="paging_box">
			<c:forEach begin="${paging.startPage}" end="${paging.endPage }"  step="1" var="i">	
						<a href="?page=${i}">${i}</a>
			</c:forEach>
	
		</div>
</body>
</html>