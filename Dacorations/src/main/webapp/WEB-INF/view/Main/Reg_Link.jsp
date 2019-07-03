<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style></style>
<script></script>
<link href="https://fonts.googleapis.com/css?family=Jua|Play" rel="stylesheet">
<link href="${pageContext.request.contextPath }/CSS/header.css" rel="stylesheet" type="text/css">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/reg_link.css" rel="stylesheet" type="text/css">
</head>
<!--헤더인클루드-->

<body>
	<jsp:include page="../include/header.jsp" />
	<div class="wrap_contents">
		<div class="movie">
			<a href="TheaterRegister"><img src="images/sk.jpg" alt="" width="400" height="500">
				<p>영화 등록</p> </a>
		</div>
		<div class="restaurant">
			<a href="RestaurantRegister"><img src="images/restaurant.jpg" alt="" width="400" height="500">
				<p>레스토랑 등록</p> </a>
		</div>
		<div class="accommodation">
			<a href="AccomodationForm"><img src="images/hotel.jpg" alt="" width="400" height="500">
				<p>숙소 등록</p> </a>
		</div>
	</div>
</body>

</html>