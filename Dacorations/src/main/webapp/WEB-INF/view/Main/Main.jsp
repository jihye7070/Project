<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Model.*"%>
<% MemberDTO memberDTO = (MemberDTO)session.getAttribute("memberDTO");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>MAIN</title>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/main.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath }/CSS/jquery-sakura.css"
	rel="stylesheet">
<style></style>


<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/JS/jquery-sakura.js"></script>
<script>
$(window).load(function () {
    $('body').sakura();
});


function slide(id, dir, n)
{
	var o = document.getElementById(id);

	for(var i=0; i<n; i++)
	{
		if(dir == 'left')
		{
			o.appendChild(o.firstChild);
		}
		else if(dir == 'right')
		{
			o.insertBefore(o.lastChild, o.firstChild);
		}
	}
}

</script>
<link href="${pageContext.request.contextPath }/CSS/header.css"
	rel="stylesheet" type="text/css">

<jsp:include page="../include/header.jsp" />
</head>



<body>


	<div class="wrap">
		<div id="schedule">
			<div id="mainimg">
				<img src="images/cherry-blossom.jpg" alt="main" width="100%"
					height="800px" id="m_img">
				<div id="plan" onclick="location.href=''">
					<h2>DATECORATION</h2>
					<div>
						<a href="#">make a plan</a>
					</div>
					<div id="plan_table">
						<a href=""><img src="images/plan_table.JPG" alt="plan_table"></a>
					</div>
				</div>
			</div>

		</div>
		<div id="movie">
			<div class="wrap_movie">
				<div class="main_img"><a href="TheaterMain"><img src="${pageContext.request.contextPath }/images/hotel.jpg" alt=""
				width="600" height="500"></a></div>
				<div class="main_list">
				<ul id="slideShow">
                    <c:forEach items="${movieList}" var="list">
					<li>
					<div class="listContent">
						<div id="img_box">
							<img src="Movie/upfile1/${fn:split(list.movieStoreimg,'-')[0]}" />
						</div>
						<div class="mention" style="line-height: 2em">
							<h2>${list.movieTitel}</h2>
							<h3> ${list.movieKind}</h3>
						</div>
					</div>
					</li>
                   </c:forEach>
				
				</ul>
				</div>
				<div id="controll">
					<a href="javascript:slide('slideShow', 'left', 2)">◀</a> 
					<a href="javascript:slide('slideShow', 'right', 2)">▶</a>
				</div>	
			</div>
	
		</div>
		
		<div id="accommodation">
			<div class="wrap_accommodation">
				<div class="main_img"><a href="Accomodation/AccomodationMain"><img src="${pageContext.request.contextPath }/images/hotel.jpg" alt=""
				width="600" height="500"></a></div>
				<div class="main_list">
				<ul id="slideShow">
                    <c:forEach items="${accomodationList}" var="list">
					<li>
					<div class="listContent">
					<div id="img_box">
						<img src="Accomodation/upfile/${list.accmodationImgstore}" />
					</div>
						<div class="mention" style="line-height: 2em">
 						<h2>${list.accomodationName}</h2>
 						<h3> ${list.accmodationKind}</h3>
					</div>
					</div>
					</li>
                   </c:forEach>
				
				</ul>
				</div>
				<div id="controll">
					<a href="javascript:slide('slideShow', 'left', 2)">◀</a> 
					<a href="javascript:slide('slideShow', 'right', 2)">▶</a>
				</div>
			</div>

		</div>
		<div id="restaurant">
			<div class="wrap_restaurant">
				<div class="main_img"><a href="RestaurantMain"><img src="${pageContext.request.contextPath }/images/restaurantmain.jpg" alt=""
				width="600" height="500"></a></div>
				<div class="main_list">
				<ul id="slideShow">
					<c:forEach items="${restaurantList}" var="list">
						<li>
						<div class="img_list">
							<div id="img_box">
								<img src="Restaurant/upfile/${list.restaurantImgStore }"width="380" height="300" alt="${list.restaurantImgStore }"/>
							</div>
							<div class="mention" style="line-height: 2em">
 								<h2>${list.restaurantName}</h2>
 								<h3> ${list.restaurantKind}</h3>
 							</div>
						</div>
						</li>
					</c:forEach>
				</ul>
				</div>
				<div id="controll">
					<a href="javascript:slide('slideShow', 'left', 2)">◀</a> 
					<a href="javascript:slide('slideShow', 'right', 2)">▶</a>
				</div>
			</div>
			
		</div>
		<div id="festival">
		<%-- 	<div class="wrap_festival">
				<div class="main_img"><a href=""><img src="" alt="" width="600" height="500"></a></div>
				<div class="main_list">
				<ul id="slideShow">
					<c:forEach items="${movieList}" var="list">
						<li><div class="img_list">
							<a href="RestaurantDetail?num=${list.FESTIVALNUM }"><img src="Restaurant/upfile/${list.FESTIVALIMG }"width="380" height="300" alt="${list.FESTIVALIMG }"/></a>
						</div></li>
					</c:forEach>
				</ul>
				</div>
			</div>
			<div id="controll">
				<a href="javascript:slide('slideShow', 'left', 2)">◀</a> 
				<a href="javascript:slide('slideShow', 'right', 2)">▶</a>
			</div> --%>
		</div>
	</div>
</body>
</html>