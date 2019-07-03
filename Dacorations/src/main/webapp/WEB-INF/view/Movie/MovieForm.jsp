<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Javascript Slide Example</title>

<link href="${pageContext.request.contextPath }/CSS/RoomForm.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/JS/MovieForm.js"></script>
</head>

<div id="registeRoom">

	<form  method="post" enctype="multipart/form-data">
        <h2>영화 등록</h2>
		<br>
		<br>
		<script type="text/javascript">

</script>
		<span>영화제목</span>
		<input type="text" name="movieTitle" style="width:20%;"><br><br>
		<div>
			<span>영화 장르</span> <select name="movieKind">
				<option>영화장르</option>
				<option>공포,스릴러,호로</option>
				<option>SF,액션,어드벤처</option>
				<option>로맨스,감동</option>
				<option>코미디,재미</option>

			</select></div><br>
		<div>
			<span>영화 연령</span> <select name="movieAge">
				<option>전체이용가</option>
				<option>12세</option>
				<option>15세</option>
				<option>19세</option>

			</select></div><br>
		
		<div>
			<span>영화 상영시간</span>
			<input type="number" id="number" name="movieTime"> 시간
		</div><br>
		
		<div>
			<span>영화 가격</span> <input type="text" name="moviePrice"
				style="width: 13%;">원
		</div><br>

			<p>영화 정보</p>
			<textarea name="movieInform" cols="67" rows="10"></textarea><br>
		

		<p>사진등록</p>

		<img id="lastone" src="${pageContext.request.contextPath }/images/sunny.jpg" width="5%" height="30px"
			onclick="insRow()">
		<table id="addTable" width="400" cellspacing="0" cellpadding="0"
			bgcolor="#FFFFFF" border="0">
			
		</table>

     <div id="submit">
			<input type="submit" value="등록하기" style="height: 50px; width: 30%;">
		</div>

	</form>
  </div>	
</body>

</html>