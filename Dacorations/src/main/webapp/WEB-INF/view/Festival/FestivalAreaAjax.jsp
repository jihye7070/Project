<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <%@ page import="java.util.*, Model.FestivalDTO" %>
    <%List<FestivalDTO> list = (List)request.getAttribute("area"); %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="festivalarea1111">
	<c:forEach items="${area}" var="arealist">
		<div class="festival_infobox">
			<div id="festival_infoview"><img src="Festival/${arealist.getFESTIVALIMG()}"></div>
			<div id="festival_info">
					<p id="info"><strong><a href="FestivalDetail?fno=${arealist.getFESTIVALNUM()}">${arealist.getFESTIVALNAME()}</a></strong></span>
				<p>입장료 :  <span style="color: red;">${arealist.getFESTIVALFARE()}</span>원  </p>
				<p>
					기간: ${arealist.getFESTIVALTERM() }<br>
					장소: ${arealist.getFESTIVALAREA()}<br>
					문의: ${arealist.getFESTIVALTELL()}
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
</body>
</html>