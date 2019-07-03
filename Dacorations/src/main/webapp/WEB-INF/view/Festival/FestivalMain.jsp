<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, Model.FestivalDTO" %>
	<%List<FestivalDTO> list = (List)request.getAttribute("Festivallist"); %> 
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>축제</title>

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
<link href="CSS/FestivalMain_content.css" rel="stylesheet" type="text/css"> 
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->


</head>
<body>
<script type="text/javascript">
function areaClick(area){
 	$.ajax({
		type:"POST",
		url : "areaSelect",
		data :"area="+area,
		dataType: "html",
		success:function(data){
			$('.festivalarea1111').html(data)
		}
	});
}

</script>





<!-- Header 시작 -->
<jsp:include page="../include/header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
<form method="get">
<div id="festival_main_view"><img src="images/Festival_main.png"></div>
		<div id="festival_title"><h3>지역축제</h3></div>
		<div id="area_info">
			<ul>
				<li class="festivalarea"><a href="javascript:areaClick('');">전체</a></li>
				<li class="festivalarea"><a href="javascript:areaClick('영등포구');">영등포구</a></li>
				<li class="festivalarea"><a href="javascript:areaClick('용산구');">용산구</a></li>
				<li class="festivalarea"><a href="javascript:areaClick('강북구');">강북구</a></li>
				<li class="festivalarea"><a href="javascript:areaClick('중랑구');">중랑구</a></li>
				<li class="festivalarea"><a href="javascript:areaClick('동대문구');">동대문구</a></li>
			</ul>
		</div>
		
		<div class="festivalarea1111">
				<c:forEach items="${Festivallist}" var="festivallist">
					<div class="festival_infobox">
						<div id="festival_infoview">
							<img src="Festival/${festivallist.getFESTIVALIMG()}">
						</div>
						<div id="festival_info">
							<p id="info">
								<strong><a
									href="FestivalDetail?fno=${festivallist.getFESTIVALNUM()}">${festivallist.getFESTIVALNAME()}</a></strong></span>
							<p>
								입장료 : <span style="color: red;">${festivallist.getFESTIVALFARE()}</span>원
							</p>
							<p>
								기간: ${festivallist.getFESTIVALTERM() }<br> 장소:
								${festivallist.getFESTIVALAREA()}<br> 문의:
								${festivallist.getFESTIVALTELL()}
							</p>
							</p>
						</div>
					</div>
				</c:forEach>
		
	
		<div id="paging_box">
			<c:forEach begin="${paging.startPage}" end="${paging.endPage }"  step="1" var="i">	
						<a href="?page=${i}">${i}</a>
			</c:forEach>
	
		</div>
	</div>	
		</form>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<%-- <jsp:include page="Footer.jsp" /> --%>
<!-- Footer 끝 -->
</body>
</html>