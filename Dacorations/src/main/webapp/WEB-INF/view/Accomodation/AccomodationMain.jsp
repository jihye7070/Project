<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="Model.AccomodationDTO,java.util.*"%>

<%
	List <AccomodationDTO>accomodationCount = (List)request.getAttribute("AccomodationCount"); 
	%>
<!doctype html>
<html lang="UTF-8">

<head>
	<meta charset="UTF-8">
	<title>accomodation</title>

	<script src="${pageContext.request.contextPath }/JS/AccomodationMain.js"></script>
	<link href="${pageContext.request.contextPath }/CSS/AccomodationMain.css" rel="stylesheet" type="text/css">
</head>



<!-- 헤더 인클루드 밑에 헤더 지우기-->

<body>
	<jsp:include page="../include/header.jsp" />
	<div id="mainHeader">

		<div id="mainHeaderContent">
			<div id="mainHeaderMent">
				<h2>
					<strong>모든 숙소가 한곳에!</strong>
				</h2>
				아늑한 리조트 부터 화려한 호텔까지!
			</div>
			<div id="mainHeaderBox">

				<div class="mainHeaderSerach">
					<div class="top">
						숙소
						<div class="bottom">리조트</div>
					</div>
				</div>
             
				<div class="mainHeaderSerach">
					<div class="top">
						지역
						<div class="bottom">리조트</div>
					</div>
				</div>

				<div class="mainHeaderSerach">
					<div class="top">
						체크인
						<div class="bottom">
							<input type="date">
						</div>
					</div>
				</div>

				<div class="mainHeaderSerach">
					<div class="top">
						체크아웃
						<div class="bottom">
							<input type="date">
						</div>
					</div>
				</div>

				<div class="mainHeaderSerach">
					<div id="serach">검색</div>
				</div>

			</div>
		</div>
	</div>
	<div id="SearchBox">
	<div id="boxKind">ddd</div>
	<div id="boxArea"></div>
	</div>
	<div id="mainContent">
		<div id="listMention">4가지 종류의 숙소를 골라보세요!</div>
		<div id="accomodationList">
		
			<div class="accmodation">
				<img src="${pageContext.request.contextPath }/images/hotel.jpg"><a href="AccomodationListEach?kind=호텔">호텔</a>
			    <p>
				<%if(accomodationCount.get(1).getCount()!=null) {%>
				<%=accomodationCount.get(1).getCount()%><%}else{%>0<% } %>개 호텔</p>
			</div>
		
			<div class="accmodation">
				<img src="${pageContext.request.contextPath }/images/motel.jpg"><a href="AccomodationListEach?kind=모텔" >모텔</a>
				  <p>
				<%if(accomodationCount.get(3).getCount()!=null) {%>
				<%=accomodationCount.get(3).getCount()%><%}else{%>0<% } %>개 모텔</p>
			</div>
			
			<div class="accmodation">
				<img src="${pageContext.request.contextPath }/images/pension.jpg"><a href="AccomodationListEach?kind=펜션" >펜션</a>
				  <p>
				<%if(accomodationCount.get(0).getCount()!=null) {%>
				<%=accomodationCount.get(0).getCount()%><%}else{%>0<% } %>개 펜션</p>
			</div>
			
			<div class="accmodation">
				<img src="${pageContext.request.contextPath }/images/resort.jpg"><a href="AccomodationListEach?kind=리조트" >리조트</a>
				  <p>
				<%if(accomodationCount.get(2).getCount()!=null) {%>
				<%=accomodationCount.get(2).getCount()%><%}else{%>0<% } %>개 리조트</p>
			</div>
		</div>
		
		<div id="accomodationList1">
			<div id="listMention">모든 숙박을 한눈에!</div>
			<div id="list">

				<ul id="slideShow">
                    <c:forEach items="${list}" var="list">
					<li><div class="listContent">
							<img src="Accomodation/upfile/${list.accmodationImgstore}" />
							<div class="mention" style="line-height: 2em">

								<h2>${list.accomodationName} ${list.accmodationKind}</h2>

								<h3>${list.accomodationInform}</h3>
							</div>
                                <h6>객실 평균 가격: ${list.accomodationAvg}원</h6>
						</div></li>
                   </c:forEach>
				
				</ul>
			</div>
			<div id="controll">
				<a href="javascript:slide('slideShow', 'left', 2)">◀</a> <a
					href="javascript:slide('slideShow', 'right', 2)">▶</a>
			</div>
		</div>

	</div>
</body>

</html>