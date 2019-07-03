<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>

<link
	href="${pageContext.request.contextPath }/CSS/restaurant_regist.css"
	rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/JS/MemberRegister.js">
    </script>
</head>


<div class="wrap_res_reg">
	<form action="TheaterRegister" enctype="multipart/form-data" method="POST">
		<p id="sub">영화관랑 등록</p>
		<table class="table">
			<tr>
				<td>영화관 이름</td>
				<td><input type="text" class="textbox"
					placeholder="    영화관 이름" name="theaterName"></td>
			</tr>
			<tr>
				<td>영화관 종류</td>
				<td><select id="kindSelect" name="theaterKind">
				<option>메가박스</option>
				<option>CGV</option>
				<option>롯데시네마</option>
				</select></td>
			</tr>
			<tr>
				<td>영화관 주소</td>
				<td><input type="text" class="textbox" id="sample6_postcode"
					placeholder="   우편번호"> <input type="button"
					onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
					<input type="text" class="textbox" name="address"
					id="sample6_address" placeholder="     주소"><br> <input
					type="text" class="textbox" name="addressDetail"
					id="sample6_detailAddress" placeholder="     상세주소">
			</tr>
			
			<tr>
				<td>영화관 전화번호</td>
				<td><input type="text" class="phone_text" name="tell">
					<span>&nbsp-</span> <input type="text" class="phone_text"
					name="tell"> - <input type="text"
					class="phone_text" name="tell"></td>
			</tr>
			
		
		</table>
		<p></p>
		<p>
			<input type="submit" id="regist_success" value="완료">
		</p>
	</form>
</div>
</body>

</html>