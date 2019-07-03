<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*, Model.FestivalDTO" %>
 <%FestivalDTO detail = (FestivalDTO)request.getAttribute("Festivaldetail"); %> 
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>축제 상세정보</title>

<!-- 기본 설정  => 여기서부터 -->
<meta name="viewport" content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
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
<script src = "../js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<link href="CSS/FestivalDetail_content.css" rel="stylesheet" type="text/css"> 
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->


</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../include/header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
<div id="festival_title">${Festivaldetail.getFESTIVALNAME()}</div>
		<div id="festival_img_box"><img src="Festival/${Festivaldetail.getFESTIVALIMG()}"></div>
		<form action="OptionMain" method="post">
		<table id="festival_info">
			<tr>
				<td class="subject">개최지역</td>
				 <td class="info">${Festivaldetail.FESTIVALAREA }</td>
			</tr>
			<tr>
				<td class="subject">개최기간</td>
		<td class="info">${Festivaldetail.FESTIVALTERM }</td>
			</tr>
			<tr>
				<td class="subject">축제성격</td>
			<td class="info">${Festivaldetail.FESTIVALKING }</td> 
			</tr>
		<!-- 	<tr>
				<td class="subject">관련 누리집</td>
				<td class="info">http://www.hallimpark.co.kr</td>
			</tr> -->
			<tr>
				<td class="subject">축제장소</td>
			<td class="info">${Festivaldetail.FESTIVALADD }</td> 
			</tr>
			<!-- <tr>
				<td class="subject">오시는길</td>
				<td class="info">제주시외버스터미널 - 29.2km - 한림 - 2.7km - 한림공원 - 25.7km - 대정 -18.7km - 중문-13.2km - 서귀포시외버스터미날</td>
			</tr> -->
			<tr>
				<td class="subject">요금</td>
				<td class="info">${Festivaldetail.FESTIVALFARE }원</td> 
			</tr>
			<!-- <tr>
				<td class="subject">소요시간</td>
				<td class="info">시간내 자유</td>
			</tr>
			<tr>
				<td class="subject">연령제한</td>
				<td class="info">시간내 자유</td>
			</tr> -->
			<tr>
				<td class="subject">주최기간</td>
			<td class="info">${Festivaldetail.FESTIVALAREA }</td> 
			</tr>
			<tr>
				<td class="subject">문의</td>
			<td class="info">${Festivaldetail.FESTIVALTELL }</td> 
			</tr>
			
		</table>
		<input type="hidden" name="foodName" class="check" value="0"> 
		<input type="hidden" name="productType" value="축제">
		<input type="hidden" name="productName" value="${Festivaldetail.FESTIVALNAME }">
		<input type="hidden" name="optionTime" value="">
		<input type="hidden" name="productNum" value="${Festivaldetail.PRODUCTNUM }">
		<input type="hidden" name="optionPrice" value="${Festivaldetail.FESTIVALFARE }">
		<input type="hidden" name="optionimg" value="${Festivaldetail.FESTIVALIMG }">

	<!--<input type="hidden" name="optionSeat" value="">
		<input type="hidden" name="optionCheckin" value="0">
	   <input type="hidden" name="optionCheckout" value="0"> -->
	   <input type="hidden" id="x" name="categoryNum" value="1">

		<input type="hidden" name="optionSeat" value="">
 		
 		<input type="date" name="optionCheckin"  style="border: none; color: white;">
	    <input type="date" name="optionCheckout" style="border: none; color: white;"> 
	   <input type="hidden" id="x" name="count" value="0">

		<div id="festival_contents">	
		${Festivaldetail.getFESTIVALINFORM() } 
		</div>
		
		
		
		<div id="festival_list">
			<button type="submit">예약하러가기</button>
			<button type="button" onclick="location.href='FestivalMain' ">목록</button>
			
		</div>
		</form>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<%-- <jsp:include page="Footer.jsp" /> --%>
<!-- Footer 끝 -->
</body>
</html>