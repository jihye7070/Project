<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, Model.*"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>음식</title>

<!-- 기본 설정  => 여기서부터 -->
<meta name="viewport"
	content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
<!-- font 설정 -->
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->

<!--Jquery, JqueryUI설정-->
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
	integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
	crossorigin="anonymous"></script>

<!--css 설정(기본값)-->
<link href="/css/body.css" rel="stylesheet" type="text/css">
<link href="/css/header.css" rel="stylesheet" type="text/css">
<link href="/css/footer.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->
<script src="../js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<link href="${pageContext.request.contextPath }/CSS/FestivalOption_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->


</head>
<body>


	<jsp:include page="../include/header.jsp" />
	<!-- Header 끝 -->
	<!-- Content 시작(내용 첨가) -->
	<div class="wrap_contents">
		<div class="order">

			<div class="order_info">
				<table>
					<tr>
						<td colspan="3">
							<p id="info_box">옵션선택</p>
						</td>
					</tr>
					<tr>
						<td rowspan="9">
						<img src="Restaurant/upfile/${fdto.foodImgStore}" alt="" width="400" height="400">
						</td>
					</tr>
					<tr>
						<td id="sub">타입</td>
						<td id="con">${fdto.foodType} <input type="hidden" value="레스토랑"> </td>
					</tr>
					<tr>
						<td id="sub">이름</td>
						<td id="con">${fdto.foodName}</td>
					</tr>
					<tr>
						<td id="sub">날짜</td>
						 
						 
							<td id="con"><fmt:formatDate pattern="yyyy-MM-dd"
									value="${command.foodDate}" /><span style="color: red;"></span> 
					</tr>
					
					<tr>
						<td id="sub">가격</td>
						<td id="con">${fdto.foodPrice} 원</td>
					</tr>
					<tr>
						<td id="sub">옵션</td>
						<td><select id="option" name="op">
								<option selected="selected">옵션을 선택해주세요</option>
								<option value="곱빼기">곱빼기 +2,000원</option>
								<option value="같은">같은 +2,000원</option>
						</select></td>
					</tr>
					<tr>
						<td colspan="3"><button type="submit" value="예약하기" id="paybtn">예약</button></td>
					</tr>
				</table>
			</div>
		</div>



	</div>
</body>
</html>