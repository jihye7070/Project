<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="Model.MovieRegisterDTO,Model.ChargerDTO,java.util.*"%>    
<%List <MovieRegisterDTO> mrdto=(List)request.getAttribute("Mrdto"); 
String img[];
%>
<% 
ChargerDTO Charge = null;
if(session.getAttribute("chargerDTO") != null){
	Charge =(ChargerDTO)session.getAttribute("chargerDTO");
}
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!--제목 설정-->
    <title>
        메인
    </title>
    <!-- 기본 설정 -->
    <meta name="viewport" content="width = device-width, initial-scale = 1.0, 
	maximum-scale = 1.0 minimum-scale = 1.0">
    <!--Jquery설정-->
    <script src="https://code.jquery.com/jquery-3.3.1.js"
        integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"></script>
    <!--폰트설정-->
    <link href="https://fonts.googleapis.com/css?family=Do+Hyeon" rel="stylesheet">
    <!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR" rel="stylesheet">
    <!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->
    <link href="https://fonts.googleapis.com/css?family=Noto+Serif+KR" rel="stylesheet">
    <!-- css 적용 : font-family: 'Noto Serif KR', serif; -->
    <!--css 설정(기본값)-->
  
    <link href="${pageContext.request.contextPath }/CSS/MovieMain.css" rel="stylesheet" type="text/css">
       <link href="../CSS/header.css" rel="stylesheet" type="text/css">


<script type="text/javascript" src="../JS/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="../JS/jquery.form.js"></script>   
<script src="JS/MovieMain.js"></script>

</head>

<body>
    <jsp:include page="../include/header.jsp" />
    <div id="contents">
     
        <div id="ad_img">
            <p><img src="./images/movies0.jpg" onclick="location.href='#'"></p>
        </div>
       
       
    </div>
     <div class="theraterSerch">
      <div id="therater">영화관 찾기</div>
      <h3>영화관 종류: <select style="height: 30px; width: 50%;" id="TheaterKind">
          <option>영화관을 선택해주세요</option>
          <option>메가박스</option>
          <option>롯데시네마</option>
          <option>CGV</option>
    </select></h3>
    <h3>영화관 지역: <select style="height: 30px; width: 50%;" onchange="area(this.value)">
            <option>지역을선택해주세요</option>  
            <option>서울</option>  
            <option>경기</option>  
            <option>인천</option>  
            <option>강원</option>  
            <option>제주</option>  
            <option>대전</option>  
            <option>세종</option>  
            <option>충북</option>  
            <option>충남</option>  
            <option>부산</option>  
            <option>울산</option>  
            <option>경남</option>  
            <option>대구</option>
            <option>경북</option>  
            <option>광주</option>  
            <option>전남</option>
            <option>전북</option>  
      </select></h3>
     
      <div id="movieAjax">
      <h3>영화관 선택:
       <select style="height: 30px; width: 50%;">
            <option>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ</option>  
           
      </select></h3></div>

     </div>
     <div id="movieScreen">
     <div class="footer">
            <fieldset>
                <legend>영화관</legend>
           <h1>영화관 찾기를 먼저해주세요</h1>
           </fieldset>
            </div>   
      </div>
        
     <div class="footers">
        
        <fieldset>
            <legend>개봉영화</legend>
           
        <div id=nowplaying>
           <div id="movieregister">
           <%if(Charge !=null){ %><div class="movieBox"><a onclick="MovieRegister()">영화등록</a></div>
           <%} else { %>
           <div class="movieBox">
           <select>
           <option>연령</option>
           <option>전체이용가</option>
           <option>12세</option>
           <option>15세</option>
           <option>19세</option>
           </select>
           
           </div>
           <div class="movieBox">
           <select>
           <option>장르</option>
           <option>공포</option>
           <option>SF</option>
           <option>로맨스</option>
           <option>코미디</option>
           </select>
           </div>
          <%} %>
           </div>
            <%if(mrdto !=null){
            	for(int i=0; i<mrdto.size(); i++){
                img=mrdto.get(i).getMovieStoreimg().split("-");
            	%>
            <div class=movie_list><img src="Movie/upfile1/<%=img[0] %>" >
            <div class="movieMention"><div style="border-bottom: 1px solid #dedede; height:32px;  margin-top: 3%;"><h2><a href="movieDetail?no=<%=mrdto.get(i).getMovieNum()%>&img=<%=img[0]%>"><%=mrdto.get(i).getMovieTitel() %></a>
            <span style="border-radius:75px; height: 70px; width: 45px; background-color: blue; color: white;">상영중</span>
            </h2></div>
            <b style="margin-top: 5%; color: gray;"><%=mrdto.get(i).getMovieAge()%> 이용가</b>
            </div></div>
          
          <%}} %>
         
        </div>
        </fieldset>
    </div>
<script>
$(function () {
    var n = 1
    $('.next').click(function () {
        n++
        if (n == 6) {
            n = 1
        }
        $('p img').attr('src', './images/movies'+n+'.jpg')
    })
    $('.prev').click(function () {
        n--
        if (n == 0) {
            n = 5
        }
        $('p img').attr('src', './images/movies' + n + '.jpg')
    })
})
	
</script>
</body>

</html>