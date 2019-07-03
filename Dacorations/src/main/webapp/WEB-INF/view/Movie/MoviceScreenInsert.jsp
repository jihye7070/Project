<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="Model.MovieRegisterDTO,java.util.*"%>   
<%List <MovieRegisterDTO> mrdto=(List)request.getAttribute("Mrdto"); 
String img[];%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Javascript Slide Example</title>

 <link href="${pageContext.request.contextPath }/CSS/MovieMain.css" rel="stylesheet" type="text/css">
</head>

<div id="registeRoom">

	<form  action="MovieScreen" method="post" >

          <div id="time">
			<h3>상영시간</h3>
			<select name="time">
			<%for(int i=1; i<25; i++) 
			{%><option><%=i %></option><%} %>
			</select>시
		    
		    <select name="time">
			<%for(int i=0; i<61; i++) 
			{%><option><%=i %></option><%} %>
			</select >분
		</div><br>
           
		   <div id=nowplaying>
           <%if(mrdto !=null){
            	for(int i=0; i<mrdto.size(); i++){
                img=mrdto.get(i).getMovieStoreimg().split("-");
            	%>
            <div class=screenMovie_list><img src="Movie/upfile1/<%=img[0] %>" >
            <div class="movieMention"><h2><a href="movieDetail?no=<%=mrdto.get(i).getMovieNum()%>&img=<%=img[0]%>"><%=mrdto.get(i).getMovieTitel() %></a></h2><p><b>장르:
            </b></p><P><b>연령:</b> <%=mrdto.get(i).getMovieAge()%></P><P><b>상영시간:</b> <%=mrdto.get(i).getMovieTime()%>시간</div>
           <div><input type="radio" name="MovieNum" value="<%=mrdto.get(i).getMovieNum()%>" style="width:23px;margin-left:42%; height:18px"></div>
           <input type="hidden" name="theaterNum" value="${no1}">
           <input type="hidden" name="screenNum" value="${no2}">
           </div>
          
          <%}} %>
         
        </div>
			<div id="submits"><input type="submit" value="등록하기" style="height: 100px; width:100%;"></div>
		

	</form>
  </div>	
</body>

</html>