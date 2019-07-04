<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 날짜변환때문에 -->
<%@ page import="java.util.*"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="Model.BoardDTO"%>
<%
	BoardDTO board = (BoardDTO)request.getAttribute("board");
%>
<!DOCTYPE html PUBLIC "-//W3C//Ddiv HTML 4.01 divansitional//EN" "http://www.w3.org/div/html4/loose.ddiv">
<html>
<head>
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath }/CSS/BoardDetail.css"
	rel="stylesheet" type="text/css">
<title>상세 게시글</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>

<script type="text/javascript">
function del(num) {
	var pass = prompt("글 비밀번호 입력","");	
	if( pass == "${board.boardPass }"){
		var result = confirm("정말 삭제하시겠습니까?");
		if(result){
			location.href='BoardDelete?num='+num
		}
	}else{
		alert("비밀번호가 맞지 않습니다.")
		prompt("글 비밀번호 입력","");	
		return false;
	}
}

</script>
</head>
<body>
	<div class="wrap_content">
		<div class="list_wrap">
			<ul id="list">
				<li id="title">제목</li>
				<li id="title_detail">
					<c:choose>
						<c:when test="${fn:length(board.boardSubject)>24 }">
							<pre><c:out value="${fn:substring(board.boardSubject,0,23) }" />....</pre>
							</c:when>
						<c:otherwise>
							<pre><c:out value="${board.boardSubject }" /></pre>
						</c:otherwise>
					</c:choose></li>
				<input type="hidden" name="boardNum" value="${board.boardNum }">
				<input type="hidden" name="boardPass" value="${board.boardPass }">
				<li id="date">작성일</li>
				<li id="date_detail"><fmt:formatDate pattern="yy/MM/dd" value="<%=board.getBoardDate()%>" /></li>
				<li id="name">작성자</li>
				<li id="name_detail">
				<c:choose>
						<c:when test="${fn:length(board.boardName)>14	 }">
							<pre><c:out value="${fn:substring(board.boardName,0,13) }" />....</pre>
							</c:when>
						<c:otherwise>
							<pre><c:out value="${board.boardName }" /></pre>
						</c:otherwise>
				</c:choose>
				</li>
			</ul>
		</div>

		<div class="content_wrap">
			<div id="content_detail" ><pre style="white-space: pre-wrap;"><c:out value="${board.boardContent}" escapeXml="true" /></pre></div>
		</div>
		<div id="link_wrap">
			<ul id="list_link">
				<li><input type="button" class="btn" onclick="location.href='BoardUpdate?num=${board.boardNum }'" value="수정"></li>
				<li><input type="button" class="btn"  onclick="location.href='BoardList'" value="목록"></li>
				<li><input type="button" class="btn"  onclick="del(${board.boardNum })" value="삭제"></li>
			</ul>
			<div style="color: red;">${message }</div>
		</div>
	</div>
</body>
</html>