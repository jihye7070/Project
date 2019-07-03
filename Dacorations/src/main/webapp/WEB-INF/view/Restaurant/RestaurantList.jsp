<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%String kind=(String)request.getAttribute("kind"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
<title></title>
<style></style>
<script></script>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/restaurant_list.css"
	rel="stylesheet" type="text/css">
<!--Jquery, JqueryUI설정-->
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
	integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
	crossorigin="anonymous"></script>
		
<script src = "../js/header.js"></script>

<script>
        function area(val) {
            var val = val;
            $.ajax({
                type: "POST",
                url: "RestaurantKind",
                data: "area=" + val + "&kind=<%=kind%>",
                datatype: "html",
                success: function (data) {
                    $("#ajax").html(data);
                }
            });
        }

        function newRestaurant() {
            var val = val;
            $.ajax({
                type: "POST",
                url: "RestaurantNew",
                data: "kind=<%=kind%>",
                datatype: "html",
                success: function (data) {
                    $("#ajax").html(data);
                }
            });
        }
    </script>

</head>
<jsp:include page="../include/header.jsp" />
<body>
	<div id="main">


		<div id="detailMention">
			데이코레이션
			<%=kind %>
			리스트
		</div>
		<div id="optionList">
			<div class="option">
				<select style="height: 25px; width: 150px;"
					onchange="area(this.value)" id="selects">

					<option>서울</option>
					<option>경기</option>
					<option>인천</option>
					<option>강원</option>
					<option>제주</option>
					<option>대전</option>
					<option>세종</option>
					<option>충북</option>
					<option>충남</option>
					<option>부산</option>
					<option>울산</option>
					<option>경남</option>
					<option>대구</option>
					<option>경북</option>
					<option>광주</option>
					<option>전남</option>
					<option>전북</option>

				</select>

			</div>
			<div class="option" onclick="newRestaurant()">최신등록순</div>
			<div class="option">후기순</div>
		</div>

		<div id="detailList">
			<div id="ajax">
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
			</div>
		</div>
	</div>


</body>
</html>