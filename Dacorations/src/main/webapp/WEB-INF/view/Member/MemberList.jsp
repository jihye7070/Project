<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.util.*"%>
<%@ page import="Model.MemberDTO"%>
<%
	ArrayList<MemberDTO> members = null;
	if (request.getAttribute("members") != null) {
		members = (ArrayList<MemberDTO>) request.getAttribute("members");
	}
%>
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
<link href="${pageContext.request.contextPath }/CSS/member_list.css" 	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath }/CSS/header.css"	rel="stylesheet" type="text/css">
</head>

<body>
	<jsp:include page="../include/header.jsp" />
	<div class="wrap_mem_list">
		<p id="sub">회원 관리</p>
		<table class="table">
			<tr id="ta_sub">
				<td id="name">회원 이름</td>
				<td id="id">회원 아이디</td>
				<td id="email">회원 이메일</td>
				<td id="gender">회원 성별</td>
				<td id="phone">회원 연락처</td>
				<td id="addr">회원 지역</td>
				<td id="agree">메일수신</td>
				<td id="date">가입일</td>
				<td id="last_date">마지막접속일</td>
			</tr>
			<%
				if (members.size() == 0) {
			%>
			<tr>
				<td colspan="9" style="text-align: center">회원이 존재하지 않습니다.</td>
			</tr>
			<%
				} else {
					for (int a = 0; a < members.size(); a++) {
			%>
			<tr>
				<td id="name"><%=members.get(a).getMemberName()%></td>
				<td id="id"><%=members.get(a).getMemberId()%></td>
				<td id="email"><%=members.get(a).getMemberMail()%></td>
				<td id="gender"><%=members.get(a).getMemberGender()%></td>
				<td id="phone"><%=members.get(a).getMemberTell()%></td>
				<td id="addr"><%=members.get(a).getMemberArea()%></td>
				<td id="agree"><%=members.get(a).getMailConfrim()%></td>
				<td id="date"><fmt:formatDate pattern="yy/MM/dd" value="<%=members.get(a).getMemberDate()%>"/> </td>
				<td id="last_date"><%=members.get(a).getMemberLastDate()%></td>
			</tr>
			<%
				}
			%>

			<%
				}
			%>
		</table>
	</div>
</body>

</html>