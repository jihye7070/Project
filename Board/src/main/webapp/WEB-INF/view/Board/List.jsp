<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 날짜변환때문에 -->
<%@ page import="java.util.*"%>
<%@ page import="Model.BoardDTO"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	ArrayList<BoardDTO> list = null;
	if (request.getAttribute("list") != null) {
		list = (ArrayList<BoardDTO>) request.getAttribute("list");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath }/CSS/Board.css"
	rel="stylesheet" type="text/css">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>

<c:url var="getBoardURL" value="/BoardList"></c:url>
<script type="text/javascript">
	$(document).on('click', '#btnSearch', function(e) {

		e.preventDefault();

		var url = "${getBoardURL}";
		url = url + "?searchType=" + $('#searchType').val();
		url = url + "&keyword=" + $('#keyword').val();
		location.href = url;
		console.log(url);

	});
</script>


<title>게시글 리스트</title>
</head>
<body>



	<div class="wrap_content">
		<fieldset id="field">
			<legend>검색</legend>
			<select name="searchType" id="searchType">
				<option value="title">글제목</option>
				<option value="content">글내용</option>
				<option value="ticon">제목+내용</option>
				<option value="name">작성자</option>
			</select> <input type="text" id="keyword" name="keyword">
			<button id="btnSearch" name="btnSearch">검색</button>
			<button id="btnReset" name="btnReset"
				onclick="location.href='BoardList'">초기화</button>
		</fieldset>
		<!-- 		<p>Total 10897, Page 1 / 1090</p> -->
		<div class="wrap_list">
			<ul id="list">
				<li id="num">글 번호</li>
				<li id="title">글 제목</li>
				<li id="name">작성자</li>
				<li id="date">등록일</li>
			</ul>
		</div>
		<%
			if (list.size() == 0) {
		%>

		<div style="text-align: center">글이 존재하지 않습니다.</div>

		<%
			}
			%>
		<c:forEach items="${list}" var="list">
			<div class="wrap_table">
			<table>
				<tr>
					<td id="t_num">${list.rowNum }</td>
					<td id="t_title"><a
						href="BoardDetail?num=${list.boardNum}">
						<c:choose>
							<c:when test="${fn:length(list.boardSubject)>25 }">
							<c:out value="${fn:substring(list.boardSubject,0,24) }" />.......
							</c:when>
							<c:otherwise>
								<c:out value="${list.boardSubject }" />
							</c:otherwise>
						</c:choose>
							</a></td>
					<td id="t_name">
					<c:choose>
							<c:when test="${fn:length(list.boardName)>11	 }">
							<c:out value="${fn:substring(list.boardName,0,10) }" />.......
							</c:when>
							<c:otherwise>
								<c:out value="${list.boardName }" />
							</c:otherwise>
						</c:choose></td>
					<td id="t_date" colspan="2"><fmt:formatDate
							pattern="yy/MM/dd HH:mm" value="${list.boardDate}" /></td>
				</tr>
			</table>
		</div>
			
		</c:forEach>
		
		
		<div class="wirte">
			<input type="button" class="btn" onclick="location.href='BoardWriteForm'" value="글 작성">
		</div>

		<div id="paging" style="text-align: center">
			<c:set var="page" value="${paging.page}" />
			<c:if test="${paging.prev}">
			<!-- ?searchType=${search.searchType }&keyword=${search.kekword } -->
				<a href="?page=1">◀◀</a>
				<a href="?page=${paging.startPage-1}">◀</a>
			</c:if>
			<c:forEach step="1" begin="${paging.startPage}"
				end="${paging.endPage}" var="i">
				<c:if test="${i == page}">
					<a style="font-weight: bold">${i}</a>
				</c:if>
				<c:if test="${i != page}">
					<a href="?page=${i}">${i}</a>
				</c:if>
			</c:forEach>
			<c:if test="${paging.next}">
				<a href="?page=${paging.endPage+1}">▶</a>
				<a href="?page=${paging.maxPage}">▶▶</a>
			</c:if>
		</div>
	</div>
</body>
</html>