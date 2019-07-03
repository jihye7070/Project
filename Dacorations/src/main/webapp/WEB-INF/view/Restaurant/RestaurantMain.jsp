<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/restaurant.css"
	rel="stylesheet" type="text/css">
</head>
<!--헤더 인클루드-->
<jsp:include page="../include/header.jsp" />
<body>

	<div id="mainHeader">

		<div id="mainHeaderContent">
			<img src="${pageContext.request.contextPath }/images/restaurantmain.jpg" alt=""
				width="1400" height="300">
		</div>
	</div>
	<div class="wrap_contents">
		<div class="hotplace">
			<div class="sub">
				<h3>3가지 종류의 레스토랑을 골라보세요!</h3>
			</div>
			<div class="list_m">
				<!--4개까지..-->
				<ul class="list">
					<li class="list"><a href="RestaurantList?kind=음식점">
							<div class="res_list">
								<ul class="res_list">
									<li><img
										src="${pageContext.request.contextPath }/images/rest.jpg"
										width="300" height="150"></li>
									<li id="name">레스토랑</li>

								</ul>
							</div>
					</a></li>
					<li class="list"><a href="RestaurantList?kind=카페">
							<div class="res_list">
								<ul class="res_list">
									<li><img
										src="${pageContext.request.contextPath }/images/cf.jpg"
										width="300" height="150"></li>
									<li id="name">카페</li>

								</ul>
							</div>
					</a></li>
					<li class="list"><a href="RestaurantList?kind=디저트식당">
							<div class="res_list">
								<ul class="res_list">
									<li><img
										src="${pageContext.request.contextPath }/images/dcdc.jpeg"
										width="300" height="150"></li>
									<li id="name">디저트</li>

								</ul>
							</div>
					</a></li>
				</ul>
			</div>
		</div>
		<div class="newplace">
			<div class="sub">
				<h3>모든 식당을 한눈에</h3>
			</div>
			<div class="list_m">
				<!--4개까지..-->


				<ul class="list">
					<c:forEach items="${list}" var="list">
						<li class="list">
						<a href="RestaurantDetail?num=${list.restaurantNum }">
							<div class="res_list">
								<ul class="res_list">
									<li>
										<img src="Restaurant/upfile/${list.restaurantImgStore }"width="300" height="150"></li>
									<li id="kind">${list.restaurantKind }</li>
									<li id="name">${list.restaurantName }</li>
									<li id="loc">${list.restaurantArea }</li>
								</ul>
							</div>
						</a>
						</li>
					</c:forEach>
				</ul>
				<div id="paging_box">
					<c:forEach begin="${paging.startPage}" end="${paging.endPage }"  step="1" var="i">	
						<a href="?page=${i}">${i}</a>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</body>

</html>