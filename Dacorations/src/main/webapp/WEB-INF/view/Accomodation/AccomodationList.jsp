<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%String kind=(String)request.getAttribute("kind"); %>
<%Integer count=(Integer)request.getAttribute("count"); %>

<!doctype html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>accomodation</title>
<link href="${pageContext.request.contextPath }/CSS/AccomodationList.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="../JS/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="../JS/jquery.form.js"></script>   
    
    
</head>

<body>
	<jsp:include page="../include/header.jsp" />
    <div id="main">
<div id="accomodationDetailMain">

<script>
function area(val){
	var val=val;
	$.ajax({
		type : "POST",
		url : "AccomodationKind",
		data : "area=" + val+"&kind=<%=kind%>",
		datatype : "html",
		success : function(data){
			$("#ajax").html(data);
		}
});
}

function hightPrice(){
	var val=val;
	$.ajax({
		type : "POST",
		url : "AccomodationPrice",
		data : "kind=<%=kind%>",
		datatype : "html",
		success : function(data){
			$("#ajax").html(data);
		}
});
}
function lowPrice(){
	var val=val;
	$.ajax({
		type : "POST",
		url : "AccomodationLowPrice",
		data : "kind=<%=kind%>",
			datatype : "html",
			success : function(data) {
				$("#ajax").html(data);
			}
		});
	}
</script>

<div id="detailList">

<div id="detailMention">데이코레이션 <%=kind %> 리스트</div>
<div id="optionList"><div class="option"><select style="height: 25px; width: 150px;" onchange="area(this.value)" id="selects">	
    
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
   
 </div><div class="option" onclick="hightPrice()">높은가격순</div><div class="option" onclick="lowPrice()">낮은가격순</div><div class="option">후기순</div></div>
<div id="ajax">
<c:forEach items="${list}" var="list">
<div class="accomodationList"> <img src="Accomodation/upfile/${list.accmodationImgstore}" />
<div class="detailContent">
    <h1><a href="RoomList?num=${list.accomodationNum}">${list.accomodationName } <b id="c">-${list.accmodationArea }-</b></a></h1>
    <p>주소: ${list.accomodationAdd }</p>  
    <p>숙소 번호: ${list.accmodationTell }</p> 
    <p>객실 평균 가격: <b id="b">${list.accomodationAvg }</b>원</p> 
    <b>${list.accomodationInform}</b>
</div>
</div>
</c:forEach>
</div>
 </div> 
</div>

</div>
</div>
</body>

</html>