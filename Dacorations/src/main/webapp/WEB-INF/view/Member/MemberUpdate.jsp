<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="Model.MemberDTO"%>
<% 	MemberDTO memberDTO = (MemberDTO)session.getAttribute("memberDTO");
%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER UPDATE</title>
<style></style>
<script></script>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/member_update.css" rel="stylesheet" type="text/css">
<link href="../CSS/header.css" rel="stylesheet" type="text/css">

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
    <script type="text/javascript" src="Dacorations/JS/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="Dacorations/JS/jquery.form.js"></script>    
    
    <script src="../JS/MemberRegister.js">  </script>
</head>

<!-- 헤더 인클루드-->
<body>
	<jsp:include page="/WEB-INF/view/include/header.jsp" />
	<div class="wrap_mypage">
		<div class="page_menu">
			<ul>
				<li><a href="">회원정보보기</a></li>
				<li><a href="">주문내역</a></li>
				<li><a href="">결제내역</a></li>
			</ul>
		</div>
		<form action="MemberUpdate" method="post">
			<div class="member_info">
				<table>
					<tr>
						<td id="sub">아이디</td>
						<td id="con"><%=memberDTO.getMemberId() %></td>
						<input type="hidden" name="id" value="<%=memberDTO.getMemberId()%>">
					</tr>
					<tr>
						<td id="sub">이름</td>
						<td id="con"><%=memberDTO.getMemberName() %></td>
						<input type="hidden" name="name" value="<%=memberDTO.getMemberName() %>">
					</tr>
					<tr>
						<td id="sub">비밀번호</td>
						<td id="con"><input type="password" class="textbox" name="password"
							placeholder="   비밀번호" value="<%=memberDTO.getMemberPw() %>"></td>
					</tr>
					<tr>
						<td id="sub">비밀번호 확인</td>
						<td id="con"><input type="password" class="textbox"
							placeholder="   비밀번호확인" value="<%=memberDTO.getMemberPw() %>"></td>
					</tr>
					<tr>
						<td id="sub">이메일</td>
						<td id="con"><input type="email" id="email" name="email"
							class="textbox" value="<%=memberDTO.getMemberMail() %>"></td>
					</tr>
 
					<tr>
						<td id="sub">연락처</td>
						<td id="con"><select name="tell" class="phone_text">
								<option value="010" selected="selected">010</option>
								<option value="011">011</option>
								<option value="016">016</option>
								<option value="017">017</option>
								<option value="018">018</option>
								<option value="019">019</option>
								<option value="0139">0139</option>
								<% String phone = memberDTO.getMemberTell(); %>
						</select> <span>&nbsp-</span> 
						<input type="text" class="phone_text" name="tell" value="<%=phone.substring(3,7)%>"> - <input type="text" class="phone_text" name="tell" value="<%=phone.substring(7,11)%>"></td>
					</tr>
					<tr>
						<td id="sub">주소</td>
						<td id="con"><input type="text" id="sample6_postcode" placeholder="우편번호"> 
						<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
						<input type="text" class="textbox"name="address" id="sample6_address" placeholder="   주소"><br> 
						<input type="text" class="textbox" name="detailAddress" id="sample6_detailAddress" placeholder="   상세주소"> 
						<input type="text" class="textbox" name="sample6_extraAddress" id="sample6_extraAddress" placeholder="참고항목"></td>
					</tr>
					<tr>
						<th colspan="2">
							<p>
								이벤트메일링수신동의여부<input type="checkbox" class="checkbox" name="mailConfrim" value="O">
							</p>
						</th>
					</tr>

				</table>
				<div id="btn">
					<button type="submit" id="update_btn">회원정보수정</button>
				</div>
			</div>
		</form>
	</div>
</body>

</html>