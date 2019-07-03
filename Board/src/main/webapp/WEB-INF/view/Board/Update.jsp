<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 날짜변환때문에 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="Model.BoardDTO"%>
<%
	BoardDTO board = (BoardDTO)request.getAttribute("board");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath }/CSS/BoardUpdate.css" 	rel="stylesheet" type="text/css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
function formCheck(){
	    var title = document.forms[0].boardTitle.value;
	    var content = document.forms[0].boardContent.value;

	    if (title == null || title == "") { // null인지 비교한 뒤
	        alert('제목을 입력하세요'); // 경고창을 띄우고
	        document.forms[0].boardTitle.focus(); // 해당태그에 포커스를 준뒤
	        return false; // false를 리턴합니다.
	    }
	    if (content == null || content == "") {
	        alert('글 내용을 입력하세요');
	        document.forms[0].boardContent.focus();
	        return false;
	    }
	}
function keyup(obj, maxByte) {
	 
    var strValue = obj.value;
    var strLen = strValue.length;
    var totalByte = 0;
    var len = 0;
    var oneChar = "";
    var str2 = "";

    for (var i = 0; i < strLen; i++) {
        oneChar = strValue.charAt(i);
        if (escape(oneChar).length > 4) {
            totalByte += 2;
        } else {
            totalByte++;
        }

        // 입력한 문자 길이보다 넘치면 잘라내기 위해 저장
        if (totalByte <= maxByte) {
            len = i + 1;
        }
    }

    // 넘어가는 글자는 자른다.
    if (totalByte > maxByte) {
    	if(maxByte==120){
    		alert("제목은 "+40 + "자를 초과 입력 할 수 없습니다.");
    	}
/*     	if(maxByte==4000){
    		alert("내용은 "+1333 + "자를 초과 입력 할 수 없습니다.");
    	} */
        str2 = strValue.substr(0, len);
        obj.value = str2;
        chkword(obj, 4000);
    }
}
document.getElementById('textarea').addEventListener('keyup', checkByte);
var countSpan = document.getElementById('count');
var message = '';
var MAX_MESSAGE_BYTE = 4000;
document.getElementById('max-count').innerHTML = MAX_MESSAGE_BYTE.toString();

function count(message) {
    var totalByte = 0;

    for (var index = 0, length = message.length; index < length; index++) {
        var currentByte = message.charCodeAt(index);
        (currentByte > 128) ? totalByte += 3 : totalByte+=2;
    }
    return totalByte;
}
function checkByte(event) {
    const totalByte = count(event.target.value);

    if (totalByte <= MAX_MESSAGE_BYTE) {
        countSpan.innerText = totalByte.toString();
        message = event.target.value;
    } else {
        alert(MAX_MESSAGE_BYTE + "바이트까지 전송가능합니다.");
        countSpan.innerText = count(message).toString();
        event.target.value = message;
    }
}
</script>
<title>글 수정하기</title>
</head>
<body>
	<form:form method="post" action="BoardUpdate" id="reset" onsubmit="return formCheck();">
		<div class="wrap_content">
			<div class="wrap_list">
				<ul id="list">
					<li id="title">글제목</li>
					<li id="title_detail"><input type="text" name="boardTitle" id="boardTitle"
						value="<%=board.getBoardSubject() %>" onkeyup="keyup(this,120)"></li>
					<input type="hidden" name = "boardNum" value="<%=board.getBoardNum() %>">
			
				
					<li id="name">이 름</li>
					<li id="name_detail"><c:choose>
							<c:when test="${fn:length(board.boardName)>11	 }">
							<c:out value="${fn:substring(board.boardName,0,10) }" />.......
							</c:when>
							<c:otherwise>
								<c:out value="${board.boardName }" />
							</c:otherwise>
						</c:choose></li>
				</ul>
			</div>
			<div class="content_wrap">
				<ul id="list">
					<li id="content_detail">
					<textarea name="boardContent" id="textarea" cols="120" rows="15" onkeyup="keyup(4000)">${board.boardContent }</textarea>
					<span id="count">0</span>/<span id="max-count">4000</span></li>
				</ul>
			</div>
			
			<div id="btn_wrap">
				<input type="submit" value="수정완료"  id="btn" >
				<input type="button" value="초기화" onclick="location.href='BoardUpdate?num=${board.boardNum }'"  id="btn" />
				<input type="button" value="목록" onclick="location.href='BoardList'"  id="btn" />
			</div>
			
		</div>
	</form:form>
</body>
</html>