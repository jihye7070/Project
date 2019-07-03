<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="Model.MemberDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% 	MemberDTO memberDTO = (MemberDTO)session.getAttribute("memberDTO");
	MemberDTO mem = (MemberDTO)request.getAttribute("mem");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER INFO</title>
<style></style>
<script></script>
<link href="${pageContext.request.contextPath }/CSS/member_info.css" rel="stylesheet" type="text/css">
<link href="../CSS/header.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->


</head>

<!-- 헤더 인클루드-->
<body>
	<jsp:include page="../include/header.jsp" />
	<div class="wrap_mypage">
		<div class="page_menu">
			<ul>
				<li><a href="MemberInfo">내정보보기</a></li>
				<li><a href="">주문내역</a></li>
				<li><a href="">결제내역</a></li>
			</ul>
		</div>
		<form action="MemberUpdate">
			<div class="member_info">
				<table>
					<tr>
						<td id="sub">아이디</td>
						<td id="con"><%=mem.getMemberId() %></td>
					</tr>
					<tr>
						<td id="sub">이름</td>
						<td id="con"><%=mem.getMemberName() %></td>
					</tr>
					<tr>
						<td id="sub">이메일</td>
						<td id="con"><%=mem.getMemberMail() %></td>
					</tr>
					<tr>
						<td id="sub">성별</td>
						<td id="con"><%=mem.getMemberGender()%></td>
					</tr>
					<tr>
						<td id="sub">연락처</td>
						<td id="con"><%=mem.getMemberTell() %></td>
					</tr>
					<tr>
						<td id="sub">주소</td>
						<td id="con"><%=memberDTO.getMemberAdd() %></td>
					</tr>
					<tr>
						<td id="sub">비밀번호 변경일</td>
						<td id="con"><fmt:formatDate pattern="yy/MM/dd" value="<%=mem.getPassChangeDate()%>"/></td>
					</tr>
				</table>
				<div id="btn">
					<button type="submit" id="info_btn">회원정보수정</button>
				</div>
			</div>
		</form>
	</div>
</body>

</html>