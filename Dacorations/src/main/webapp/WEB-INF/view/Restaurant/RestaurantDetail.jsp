<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="Model.*, java.util.*"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
	ChargerDTO chargerDTO = (ChargerDTO) session.getAttribute("chargerDTO");
	List<FoodDTO> list = (List) request.getAttribute("list");
	int plz=0;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style></style>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath }/JS/datepicker.js"></script>
<script src="${pageContext.request.contextPath }/JS/datepicker.min.js"></script>

<script>


$(function () {

    $('.date').datepicker({
        language: {
            days: ["일", "월", "화", "수", "목", "금", "토"],
            daysShort: ["1", "2", "3", "4", "5", "6", "7"],
            daysMin: ["일", "월", "화", "수", "목", "금", "토"],
            months: ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
            monthsShort: ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
            today: "오늘",
            clear: "1주일",
            dateFormat: "yyyy.mm.dd",
            timeFormat: "hh:ii",
            firstDay: 1
        },
        navTitles: {
            days: " <i class='date-pic-year'>yyyy</i>MM"
        },

    });
});


    </script>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link
	href="${pageContext.request.contextPath }/CSS/restaurant_datail.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath }/CSS/datepicker.min.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/JS/RestaurantDetail.js"></script>
</head>
<!--헤더 인클루드-->
<jsp:include page="../include/header.jsp" />
<body>
		<form action="OptionMain" method="post">
	<div class="wrap_contents">
		<%
			if (chargerDTO != null) {
		%>
		<a href="" onclick="roomRegister(${rdto.restaurantNum })"> 음식등록하기
		</a>
		<%
			}
		%>
		<p id="sub">레스토랑 예약하기</p>
		<div class="food_img">
			<img src="Restaurant/upfile/${rdto.restaurantImgStore }" alt="ymym"
				width="700" height="400">
		</div>
		<div class="res">
			<div class="res_info">
				<ul class="info">
					<li id="name">${rdto.restaurantName }</li>
					<li id="kind">${rdto.restaurantKind }</li>
					<li id="loc">${rdto.restaurantArea }</li>
					<li id="tel">${rdto.restaurantTell }</li>
				</ul>
				<ul class="info_detail">
					<li id="de_info_sub">매장정보</li>
					<li id="de_info">${rdto.restaurantInfo }</li>
					<li id="de_addr">${rdto.restaurantAdd }</li>
				</ul>
			</div>

		</div>

		<div class="res_food_list">
			<div id="h2">
				<p>메뉴 선택</p>
			</div>

			<ul class="re_menu">
				<div class="res_table">
		
		</div>
			<%if(list !=null){ 
			for(int i=0; i<list.size(); i++){
			 plz++;
			%>
                
					<li class="re_menu_li">
						<input type="radio" name="foodName" class="check" value="<%=list.get(i).getFoodNum()%>"> 
						<input type="hidden" name="productType" value="레스토랑">
						<input type="hidden" name="productName" value="<%= list.get(i).getFoodName() %>">
						<input type="hidden" name="optionTime" value="--">
						<input type="hidden" name="productNum" value="<%=list.get(i).getPRODUCTNUM()%>">
						<input type="hidden" name="optionPrice" value="<%= list.get(i).getFoodPrice() %>">
						<input type="hidden" name="optionimg" value="<%=list.get(i).getFoodImgStore()%>">
						<input type="hidden" name="optionSeat" value="--">
						<input type="hidden" id="x" name="count">
		                <input type="hidden" id="x" name="categoryNum" value="4">
			            
						<label for="" id="chk"><%=list.get(i).getFoodName()%></label> 
						<span>
							<img src="Product/date/<%=list.get(i).getFoodImgStore() %>" alt="" width="180" height="160">
						</span>
						<div>
							<p>
								<span>가격</span><%= list.get(i).getFoodPrice() %>
							</p>
						</div> 
						<a href="FoodDetail?num=<%=list.get(i).getFoodNum()%>" class="">
							<img src="${pageContext.request.contextPath }/images/detail.png" alt="상세보기" width="100" height="12">
						</a>
					  <div id="btn">
			            <button type="submit" onclick="plz(<%=plz%>)">예약하러가기</button></div>
					</li>
				<%} %>
			</ul>
		</div>
		<%} %>

				
			<script type="text/javascript">
				function plz(plz) {
					
					alert(plz)
					document.getElementById("x").value=plz;
					alert(document.getElementById("x").value)
					document.getElementById('frm').submit()
				}
				</script>
		
		

	</div>
	</form>
</body>
</html>