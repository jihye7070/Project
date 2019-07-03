<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%@page import="Model.MovieRegisterDTO,Model.DateMovieDTO,Model.ChargerDTO,java.util.*"%>    
<% ChargerDTO Charge = (ChargerDTO)session.getAttribute("chargerDTO");%>    
<%List <DateMovieDTO> mrdto=(List)request.getAttribute("dMdto");%>
<%Long tnum=(Long)request.getAttribute("num"); %>		



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
  


</head>
<body>
    <div class="footer">
            <fieldset>
                <c:if test="${tRdto.theaterKind =='롯데시네마'}" >
                <legend style="font-size: 40px;"><div id="theaterName"><img src="./images/lottecinema.png"></div></legend>
                </c:if>
                 <c:if test="${tRdto.theaterKind =='메가박스'}" >
                <legend style="font-size: 40px;"><div id="theaterName"><img src="./images/maga.jpg"></div></legend>
                </c:if>
                 <c:if test="${tRdto.theaterKind =='CGV'}" >
                <legend style="font-size: 40px;"><div id="theaterName"><img src="./images/cgv.jpg"></div></legend>
                </c:if>
       
           <div id="screenMention"> <h2> ${tRdto.theaterName}</h2>
            <h3>주소: ${tRdto.theaterAdd}</h3>
           <h3>TELL: ${tRdto.theaterTell}</h3></div>
          <%if(Charge !=null){ %>
           <fieldset>
                <legend style="font-size: 30px;">상영관</legend>
           
           <div id=nowplayings>
                <div class=screen_list><img src="./images/screen.jpg" >
                <div class="movieMention"><h4>상영관 등록</h4>
                <form action="ScreenRagister" method="post" enctype="multipart/form-data">
                <h5><input type="text" placeholder="상영관 이름" name="screenName"></h5>
                <h5> <input type="number"placeholder="행" name="screenRow" style="width: 37px;">
                <input type="number"placeholder="열" name="screenColum" style="width: 37px; margin-left: -2px;"></h5>
                <h5><select name="screenKind" style="height: 25px;">
                <option>상영관 종류</option>
                <option>일반상영관</option>
                <option>스페셜상영관</option>
                </select></h5>
                <h5><select name="screenPlus" style="height: 25px;">
                <option>추가요금</option>
                <option>0</option>
                <option>10000</option>
                <option>15000</option>
                <option>20000</option>
                </select></h5>
                <h5><input type="file" name="screenFile" value="상영관 이미지"></h5>
                <input type="hidden" value="${tRdto.theaterNum }" name="theaterNum" >
                <input type="submit" value="등록하기" style="height:50px; cursor: pointer; ">
                </form>
                </div>
         </div>
          
             <c:forEach items="${sList}" var="sList">
                <div class=screen_list><img src="Movie/upfile2/${sList.screenStoreimg }" >
                <div class="movieMention"><h4>${sList.screenName} </h4>
                <h5>${sList.screenKind}</h5>
                <h5>좌석수: ${sList.screenRow*sList.screenColumn }석</h5>
                <h5>추가요금: +${sList.screenPlus }</h5>
                
                <h5><input type="button" onclick="Register(${tRdto.theaterNum },${sList.screenNum})" style="height: 50px; width: 50%; margin-top: 131px; margin-bottom: -11px; cursor: pointer;" value="영화등록" ></h5>
                </div></div>
             
            </c:forEach>
             </div>
        </fieldset>    
        <%}else{ %>
           <fieldset>
                <legend>상영영화</legend>
            
           <div id=nowplaying>
             <%if(mrdto!=null){
            	 for(int i=0; i<mrdto.size(); i++){

            		 String img[]=mrdto.get(i).getMovieStoreimg().split("-");
            	 %>
                <div class=screen_list><img src="Movie/upfile1/<%=img[0] %>" >
                <div class="movieMention"><h4><%=mrdto.get(i).getScreenName() %></h4>
                 <h3><a href="MovieSeatChoice?no1=<%=mrdto.get(i).getMovieNum() %>&no2=<%=mrdto.get(i).getScreenColumn()%>&no22=<%=mrdto.get(i).getScreenRow()%>&no3=<%=mrdto.get(i).getMoviePrice() %>&no4=<%=img[0]%>&no5=<%=mrdto.get(i).getScreenNum()%>&no6=<%=mrdto.get(i).getMovieTitel() %>&no7=<%=mrdto.get(i).getScreenName()%>&no8=<%=tnum%>"><%=mrdto.get(i).getMovieTitel() %></a> </h3><br><br>
                <h5><%=mrdto.get(i).getScreenKind()%> +<%=mrdto.get(i).getScreenPlus() %>원</h5>
             
              
                </div>
           </div>
             <%}} %>
            </div>   
     
        </fieldset>    
        <%} %>
        </fieldset>
        </div>
<script type="text/javascript">1
function Register(no1,no2){ 
	
	var url='/Dacorations/MovieRegisterIntoScreen?no1='+no1+'&no2='+no2;
		      window.name="parentForm";
		      window.open(url, "childForm","toolbar=no, location=no,status=no,menubar=no, scrollbars=no,resizable=no,width=680, height=870");  
		     
		      self.close();
	}
	
	

</script>
</body>
</html>