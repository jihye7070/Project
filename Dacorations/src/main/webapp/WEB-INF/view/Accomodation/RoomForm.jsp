<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Javascript Slide Example</title>

<link href="${pageContext.request.contextPath }/CSS/RoomForm.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/JS/RoomForm.js"></script>


</head>

<div id="registeRoom">

	<form action="RoomRegister" name="frm" method="post"
		enctype="multipart/form-data">

		<h2>숙박 등록</h2>
		<br>
		<br>
		<script type="text/javascript">

</script>
		<div>
			<span>객실 종류</span> <select name="aProKind">
				<option>Deluxe</option>
				<option>Twin</option>
				<option>Suite</option>
				<option>Royal Suite</option>

			</select>

		</div>
		<br>
		<div>
			<span>숙박 가격</span> <input type="txet" name=aProPrice
				style="width: 13%;">원
		</div>

		<div>
			<p>객실 인원</p>
			<span>1명</span> ~ <input type="number" id="number" name="count" style="width:30px;">명
		</div>

		<div>
			<p>입실 퇴실 시간</p>

			<span><select name="proAdTime1">
					<option>AM</option>
					<option>PM</option>
			</select></span> <span>
			
			<select name="proAdTime2">

					<%for(int a=0; a<=24; a++){ %>
					<option><%=a %></option>시<%} %>
			</select>시</span> <span>
			
			<select name="proAdTime3">

					<%for(int a=0; a<=60; a++){ %>
					<option><%=a %></option>
					<%} %>
			</select>분</span> ~ <span>
			
			<select name="proExTime1">
					<option>AM</option>
					<option>PM</option>
			</select></span> <span>
			
			<select name="proExTime2">
					<%for(int a=0; a<=24; a++){ %>
					<option><%=a %></option>시<%} %>
			</select>시</span> <span>
			
			<select name="proExTime3">
					<%for(int a=0; a<=60; a++){ %>
					<option><%=a %></option>
					<%} %>
			</select>분</span>

		</div>
		<br>

		<p>사진등록</p>

		<img id="lastone" src="${pageContext.request.contextPath }/images/sunny.jpg" width="5%" height="30px"
			onclick="insRow()" style="cursor: pointer;">
		<table id="addTable" width="400" cellspacing="0" cellpadding="0"
			bgcolor="#FFFFFF" border="0">
			
		</table>

          <input type="hidden" value="${num}" name="num">
		<div id="submit">
			<input type="submit" value="등록하기" style="height: 50px; width: 30%;">
		</div>

	</form>

</div>
</body>

</html>