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
		
		var str = $('#keyword').val();
	
		var key = ConvertSystemSourcetoHtml(str);
		
		e.preventDefault();
		
		var url = "${getBoardURL}";
		url = url + "?searchType=" + $('#searchType').val();
		url = url + "&keyword=" + key;
		location.href = url;
		console.log(url);
		
	});

		   function ConvertSystemSourcetoHtml(str){
		         str = str.replace(/</g,"%3C");
		         str = str.replace(/>/g,"%3E");
		         str = str.replace(/&/g, "%26");
		         str = str.replace(/;/g, "%3B");
		         str = str.replace(/#/g, "%23");
		         str = str.replace(/=/g, "%3D");
		         return str;
		      }
    function search(){
    	var keyword = document.getElementById('keyword').value;
    	var tmpkeyword = document.getElementById('keyword').value.replace(/\s|　/gi, '');
    	
    	if (keyword == null || keyword == "" || tmpkeyword=="") { // null인지 비교한 뒤
	        alert('검색어를 입력하세요'); // 경고창을 띄우고
	        document.getElementById('keyword').focus(); // 해당태그에 포커스를 준뒤
	        return false; // false를 리턴합니다.
	    }
    }
/*       function replace(inum) { // 정규식을 이용한 문자 변경 
    	inum = inum.replace(/&/g, ""); 
    	inum = inum.replace(/\+/g, ""); 
    	return inum; 
    	} 
    function replace(inum) { // 인코딩 함수 이용
    	return encodeURIComponent(inum); 
    }
 */
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
			</select> <input type="text" id="keyword" name="keyword"  >
			<button id="btnSearch" name="btnSearch"  onclick="search();" >검색</button>
			<button id="btnReset" name="btnReset"
				onclick="location.href='BoardList'">초기화</button>
		</fieldset>
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
							<pre><c:out value="${fn:substring(list.boardSubject,0,24) }"  escapeXml="true" />.......</pre>
							</c:when>
							<c:otherwise>
								<pre><c:out value="${list.boardSubject }"  escapeXml="true" /></pre>
							</c:otherwise>
						</c:choose>
							</a></td>
					<td id="t_name">
					<c:choose>
							<c:when test="${fn:length(list.boardName)>11	 }">
							<pre><c:out value="${fn:substring(list.boardName,0,10) }"  escapeXml="true" />.......</pre>
							</c:when>
							<c:otherwise>
								<pre><c:out value="${list.boardName }" escapeXml="true"  /></pre>
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
			<input type="button" class="btn" onclick="location.href='BoardList'" value="글 목록">
		</div>

		<div id="paging" style="text-align: center">
			<c:set var="page" value="${paging.page}" />
			<c:if test="${paging.prev}">
				<a href="?<c:if test="${not empty search.keyword}">searchType=${search.searchType }&keyword=${search.keyword }&</c:if>page=1">◀◀</a>
				<a href="?<c:if test="${not empty search.keyword}">searchType=${search.searchType }&keyword=${search.keyword }&</c:if>page=${paging.startPage-1}">◀</a>
			</c:if>
			<c:forEach step="1" begin="${paging.startPage}"
				end="${paging.endPage}" var="i">
				<c:if test="${i == page}">
					<a style="font-weight: bold">${i}</a>
				</c:if>
				<c:if test="${i != page}">
					<a href="?<c:if test="${not empty search.keyword}">searchType=${search.searchType }&keyword=${search.keyword }&</c:if>page=${i}">${i}</a>
				</c:if>
			</c:forEach>
			<c:if test="${paging.next}">
				<a href="?<c:if test="${not empty search.keyword}">searchType=${search.searchType }&keyword=${search.keyword }&</c:if>page=${paging.endPage+1}">▶</a>
				<a href="?<c:if test="${not empty search.keyword}">searchType=${search.searchType }&keyword=${search.keyword }&</c:if>page=${paging.maxPage}">▶▶</a>
			</c:if>
		</div>
	</div>
</body>
</html>