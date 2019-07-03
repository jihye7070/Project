<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주문내역</title>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->

<link href="${pageContext.request.contextPath }/CSS/f_order.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="wrap_mypage">
		<div class="table">
			<div class="o_menu">
				<ul>
					<li><a href="OrderDetail?num=1">MOVIE</a></li>
					<li><a href="OrderDetail?num=2">RESTAURANT</a></li>
					<li><a href="OrderDetail?num=3">ACCOMMODATION</a></li>
					<li><a href="OrderDetail?num=4">FESTIVAL</a></li>
				</ul>
			</div>
			<table id="o_table">
				<tr>
					<td colspan="4" align="center">
						<h2>나의 주문내역</h2>
					</td>
					<td align="center"><a href=""><u>결제내역보기</u></a></td>
				</tr>
				<tr>
<%-- 					<td rowspan="7"><img src="Product/date/${list.imgStore }" alt="" width="200" height="200"></td>
 --%>				</tr>
				<tr>
					<td id="s_num">상품명</td>
					<td id="num">${list.productName }</td>

				</tr>
				<tr>
					<td id="sub">체크인</td>
					<td>${list.checkIn }</td>
					<td id="sub">체크아웃</td>
					<td>${list.checkOut }</td>
				</tr>
				<tr>
					<td id="s_num">좌석</td>
					<td>${list.seatNum }</td>
					<td id="sub">옵션상품</td>
					<td>${list.productName }</td>
				</tr>
				<tr>
					<td colspan="2" id="sub">예약날짜</td>
					<td colspan="2">${list.reserveDate }</td>
				</tr>
				<tr>
					<td colspan="2" id="sub">예약시간</td>
					<td colspan="2">${list.reserveTime }</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>