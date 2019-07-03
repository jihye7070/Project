<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Model.MovieRegisterDTO,Model.ChargerDTO,java.util.*"%>  
<% ChargerDTO Charge = (ChargerDTO)session.getAttribute("chargerDTO");%>
<% int num=(int)request.getAttribute("num"); %>

<%--  <%int chargeNum = Charge.getChargeNum(); %> --%>

<%--  <%if(Charge !=null){ %>
<% chargeNum = Charge.getChargeNum();} %> --%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>공지사항 상세정보</title>

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
<link href="CSS/NoticeDetail.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->


</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../include/header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->

<div class="contents">
    <form method="post">
    
            <table>
			                     
                <tr>
                    <td colspan="6">
                        <div id="sub" align="center">
                            <h2>문의글</h2>
                        </div>
                    </td>
                </tr>
                  <tr>
               
                <td colspan="2" id="tdsub">
                    구분
                </td>
                <td colspan="2" id="tdsub">
                  ${detail.getBoardKind() }	
                </td>
                
            </tr>
            
                <tr>
                   
                    <td colspan="2" id="tdsub">
                       제목
                    </td>
                    <td colspan="2" id="tdsub">
                      ${detail.getBoardTitle() }
                    </td>
                </tr>
                <tr>
                    <td id="tdsub">
                     내용
                    </td>
                    <td colspan="5" id="tdcon">
                         ${detail.getBoardContent() }
                    </td>
                </tr>
           
              <tr>
             	 <td id="tdsub" >
              	답변
              	</td>
              <c:set var="loginId" value="${memberDTO.getMemberId() }" />
                	<c:if test="${loginId != null }"> 
                  <td colspan="5" id="tdcon">
			                     <textarea rows="20" cols="80" readonly="readonly" name="AnswerContent">${answerinfo.getAnswerContent() }</textarea>        
                    </td> 
                    </c:if> 
                    
                   <c:set var="AdminloginId" value="${chargerDTO.getChargeId()}" />
                	<c:if test="${AdminloginId != null}">
                	<td colspan="5" id="tdcon">
                				
			                     <textarea rows="20" cols="80" name="AnswerContent" >${answerinfo.getAnswerContent() }</textarea>           
			                      <input type="hidden" name="BoardNum"  value="<%=num%>">
			                     <%if(Charge !=null){ %>
                           <% int chargeNum = Charge.getChargeNum();%>
                           <input type="hidden" name="ChargeNum"  value="<%=chargeNum%>">
                              <%} %>
			            
			                     <button onclick="location.href='Main'" type="submit">확인</button>
			                      
                    </td>
                     </c:if> 
                </tr>
    
                <tr>
                    <td colspan="6" align="center">
                        <div id="btn">
                            <button type="button" onclick="location.href='CustomerMain' ">목록으로</button>
                        </div>
                    </td>
    
                </tr>
            </table>
        </div>
</form>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<%-- <jsp:include page="Footer.jsp" /> --%>
<!-- Footer 끝 -->
</body>
</html>