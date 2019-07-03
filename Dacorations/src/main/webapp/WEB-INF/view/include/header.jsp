<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Model.*"%>
<% 	MemberDTO memberDTO = (MemberDTO)session.getAttribute("memberDTO");
	ChargerDTO chargerDTO =(ChargerDTO)session.getAttribute("chargerDTO");
%>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script>
var su=1;
var su1=1
var d;
var oTbl; 


function OptionRegister(){

	var url='OptionRegister'
	    window.name="parentForm";
	    window.open(url, "childForm","toolbar=no, location=no,status=no,menubar=no, scrollbars=no,resizable=no,width=600, height=500");  
	     
	    self.close();
}

</script>

    <link href="https://fonts.googleapis.com/css?family=Jua|Play" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/CSS/header.css" rel="stylesheet" type="text/css">

    <div id="header">
        <div id="header_menu">
            <h1>
                <a href="Main" class="logo"><img src="${pageContext.request.contextPath }/images/dc1.png" width="100%" height="100%"></a>
            </h1>
            <ul id="menu_list">
                <li>
                    <ul id="h_menu">

						
                        <% if( chargerDTO != null){ %>
                        <li><a href="" onclick="OptionRegister()">옵션등록하기</a></li>
                        <li><a href="OptionList">옵션리스트</a></li>
                        <li><a href="Reg_Link">상품등록하기</a></li><!--담당자 로그인때만 보여지게-->
                        <%} %>
                        <%if(memberDTO==null && chargerDTO==null){ %>
                        <li><a href="Login"> LOGIN </a></li>
                        <li><a href="CLogin"> CHARGER LOGIN </a></li>
                        <li><a href="MemberRegister"> SIGN UP </a></li>
                        <%} %>
                        <%if(memberDTO!=null || chargerDTO != null){ %>
                        <li><a href="Logout"> LOGOUT </a></li>
                        <%} %>
                        <%if(chargerDTO != null){ %>
                        <li><a href="memberList"> MEMBERLIST </a></li>
                        <li><a href="Product"> PRODUCT </a></li>
                        <%} %>
                        
                    </ul>
                </li>
                <li>
                    <ul id="mainmenu">

                     <% if( chargerDTO != null){ %>

                        <li><a href="TheaterMain"> MOVIE </a></li>
                        <li><a href="RestaurantMain"> RESTAURANT </a></li>
                        <li><a href="FestivalMain"> FESTIVAL </a></li>
                        <li><a href="AccomodationMain"> ACCOMMODATION </a></li>
                        <li><a href="CustomerMain"> CUSTOMERSERVICE </a></li>
                     <%} %>
                     <%if(memberDTO != null){ %>
                        <li><a href=""> SCHEDULE </a></li>
                        <li><a href="MemberInfo"> MY PAGE </a></li>
                        <li><a href="Order"> ORDER INFO </a></li>
                        <li><a href="CustomerMain"> CUSTOMERSERVICE </a></li>
                     <%} %>
                    </ul>
                </li>
            </ul>
        </div>
    </div>