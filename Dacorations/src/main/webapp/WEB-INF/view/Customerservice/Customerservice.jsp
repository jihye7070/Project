<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="Model.ChargerDTO,java.util.*"%>  
	<% ChargerDTO Charge = (ChargerDTO)session.getAttribute("chargerDTO");%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>고객센터</title>

<!-- 기본 설정  => 여기서부터 -->
<meta name="viewport" content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
<!-- font 설정 -->
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->

<!--Jquery, JqueryUI설정-->
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
	integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
	crossorigin="anonymous"></script>

<!--css 설정(기본값)-->
<link href="/css/body.css" rel="stylesheet" type="text/css">
<link href="/css/header.css" rel="stylesheet" type="text/css">
<link href="/css/footer.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->
<script src = "../js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<link href="CSS/Customerservice.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->


</head>
<body>
<!-- Header 시작 -->
<%-- <jsp:include page="Header.jsp" /> --%>
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<jsp:include page="../include/header.jsp" />

  <div class="contents">
        <div class="custom_menu">
            <ul>
                <li><a href="">고객센터</a></li>
            </ul>
			<input type="hidden" name="MemberId" value="아이디" />
            <table class="custom_con">
                <thead>
                    <tr>
                   
                        <!-- <th id="num">번호</th> -->
                        <th id="kind">카테고리</th>
                        <th id="sub">제목</th>
                        <th id="writer">작성자</th>
                        <th id="date">작성일</th>
                    </tr>
                </thead>
                <c:forEach items="${notice}" var="notice">
                <tr>
                    <%-- <th id="num"><a href="Detail?fno=${notice.getBoardNum() }">${notice.getBoardNum() }</a></th> --%>
                    <th id="kind" style="color: red;">${notice.getBoardKind() }</th>
                    <th id="sub"><a href="CustomerDetail?fno=${notice.getBoardNum() }">${notice.getBoardTitle() }</a></th>
                    <th id="writer">${notice.getMemberId() }</th>
                    <th id="date"><fmt:formatDate pattern="yyyy-MM-dd" value="${notice.getBoardDate() }"/></th>
                </tr>
                </c:forEach>
                <!-- 회원 화면 -> 답변완료 -->
                <c:forEach items="${customerservice}" var="list">
                <tr>
                	 <c:set var="loginId" value="${memberDTO.getMemberId() }" />
                	<c:if test="${list.getMemberId() == loginId}"> 
                	<c:if test="${list.getChargeNum() != null }">
                   <%--  <th id="num"><a href="Detail?fno=${list.getBoardNum() }">${list.getBoardNum() }</a></th> --%>
                    <th id="kind">${list.getBoardKind() }</th>
                    <th id="sub"><a href="CustomerDetail?fno=${list.getBoardNum() }">${list.getBoardTitle() }</a><span style="color: red;">&nbsp;[답변완료]</span>
                    </th> 
                    <th id="writer">${list.getMemberId() }</th>
                    <th id="date"><fmt:formatDate pattern="yyyy-MM-dd" value="${list.getBoardDate() }"/></th>
                	</c:if>
                  </c:if>
                
                </tr>
                </c:forEach>
                <!--회원 화면 -> 답변대기 -->
                <c:forEach items="${customerservice}" var="list">
                <tr>
                	 <c:set var="loginId" value="${memberDTO.getMemberId() }" />
                	<c:if test="${list.getMemberId() == loginId}"> 
                	<c:if test="${list.getChargeNum() == null }">
                   <%--  <th id="num"><a href="Detail?fno=${list.getBoardNum() }">${list.getBoardNum() }</a></th> --%>
                    <th id="kind">${list.getBoardKind() }</th>
                    <th id="sub"><a href="CustomerDetail?fno=${list.getBoardNum() }">${list.getBoardTitle() }</a><span style="color: black;">&nbsp;[답변대기]</span>
                    </th> 
                    <th id="writer">${list.getMemberId() }</th>
                    <th id="date"><fmt:formatDate pattern="yyyy-MM-dd" value="${list.getBoardDate() }"/></th>
                	</c:if>
                  </c:if>
                
                </tr>
                </c:forEach>
                
                
                <!--  -->
                
                <!-- 관리자화면 -> 답변 완료 -->
                <c:forEach items="${customerservice}" var="list">
                <tr>
               		
                	<c:set var="AdminloginId" value="${chargerDTO.getChargeId() }" />
                	<c:if test="${AdminloginId != null}">
                	<c:if test="${list.getChargeNum() != null }">
                   <%--  <th id="num"><a href="Detail?fno=${list.getBoardNum() }">${list.getBoardNum() }</a></th> --%>
                    <th id="kind">${list.getBoardKind() }</th>
                    <th id="sub"><a href="CustomerDetail?fno=${list.getBoardNum() }">${list.getBoardTitle() }</a><span style="color: red;">&nbsp;[답변완료]</span></th>
                    
                    <th id="writer">${list.getMemberId() }</th>
                    <th id="date"><fmt:formatDate pattern="yyyy-MM-dd" value="${list.getBoardDate() }"/></th>
                    	</c:if>
                    </c:if>
                </tr>
              </c:forEach>
              <!-- 관리자 화면 -> 답변대기 -->
               <c:forEach items="${customerservice}" var="list">
                <tr>
               		
                	<c:set var="AdminloginId" value="${chargerDTO.getChargeId() }" />
                	<c:if test="${AdminloginId != null}">
                	<c:if test="${list.getChargeNum() == null }">
                   <%--  <th id="num"><a href="Detail?fno=${list.getBoardNum() }">${list.getBoardNum() }</a></th> --%>
                    <th id="kind">${list.getBoardKind() }</th>
                    <th id="sub"><a href="CustomerDetail?fno=${list.getBoardNum() }">${list.getBoardTitle() }</a><span style="color: black;">&nbsp;[답변대기]</th>
                    
                    <th id="writer">${list.getMemberId() }</th>
                    <th id="date"><fmt:formatDate pattern="yyyy-MM-dd" value="${list.getBoardDate() }"/></th>
                    	</c:if>
                    </c:if>
                </tr>
              </c:forEach>
            </table>
				<button onclick="location.href='Write'">문의하기</button>
            <div class="paging">
                <ol>
                    <p><a href=""><img src="http://img.echosting.cafe24.com/skin/base_ko_KR/common/btn_page_prev.gif"
                                alt="이전 페이지" /></a></p>
                    <li class=""><a href="" class="other">1</a></li>
                    <li class=""><a href="" class="other">2</a></li>
                    <li class=""><a href="" class="other">3</a></li>
                    <li class=""><a href="" class="other">4</a></li>
                    <li class=""><a href="" class="other">5</a></li>
                    <p><a href=""><img src="http://img.echosting.cafe24.com/skin/base_ko_KR/common/btn_page_next.gif"
                                alt="다음 페이지" /></a></p>
                </ol>

            </div>
        </div>
    </div>

<!-- Content 끝 -->
<!-- Footer 시작 -->
<%-- <jsp:include page="Footer.jsp" /> --%>
<!-- Footer 끝 -->
</body>
</html>