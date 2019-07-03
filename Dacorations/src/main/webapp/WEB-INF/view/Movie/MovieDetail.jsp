<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
  <%@page import="Model.MovieRegisterDTO,java.util.*"%>
  <% MovieRegisterDTO mRdto=(MovieRegisterDTO)request.getAttribute("mRdto"); %>
  <% String img[]=mRdto.getMovieStoreimg().split("-"); %>
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
	<link href="${pageContext.request.contextPath }/CSS/MovieDetail.css" rel="stylesheet" type="text/css">
    <link href="../CSS/header.css" rel="stylesheet" type="text/css">

</head>

<body>
	<jsp:include page="../include/header.jsp" />
	<!-- Contents -->
	<div id="contents">
		<div id="contents_detiail">
		<div id=title>영화상세</div>
		<div id=info>
			<div id="movie_imgbox">
				<div id="movie_img"><img src="Movie/upfile1/<%=img[0] %>"></div>
			</div>
			<div id="movie_infobox">
				<div class="movie_info">
				<h1 style="font-size: 35px"><strong><%=mRdto.getMovieTitel() %></strong> </h1>
			
				</div>
				<div class="movie_info">
					<p>감독 : 애너 보든 , 라이언 플렉 </p>
					<p>배우 : 브리 라슨 , 사무엘 L. 잭슨 , 벤 멘델슨 , 주드 로</p>
					<p>장르 : <%=mRdto.getMovieKind() %>/<%=mRdto.getMovieAge() %></p>
					<p>시간 : <%=mRdto.getMovieTime() %> 시간</p>
				</div>
			
			</div>
		</div>

		<div id=story>
			<p><strong style="font-size: 25px;">영화 줄거리</strong></p>
			<%=mRdto.getMovieInform()%>
		</div>
		<div class="cut_img">
		    <div id="mainImg"><img src="Movie/upfile1/<%=img[0] %>" id="imgchange"></div>
			<div id=cut_subject>스틸컷</div>
			<%for(int i=0; i<img.length; i++){ %>
			<div id=cut_mainimg ><img src="Movie/upfile1/<%=img[i] %>" onclick="imgChange(this.src)"></div>
			<%} %>
		</div>
		<script type="text/javascript">
		
		 function imgChange(a){
			 var img=a.split("/");
			document.getElementById("imgchange").src="Movie/upfile1/"+img[6];
			   }
		</script>
	</div>
	</div>
</body>

</html>