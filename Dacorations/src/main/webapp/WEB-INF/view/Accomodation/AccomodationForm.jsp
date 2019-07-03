<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Javascript Slide Example</title>

<link href="${pageContext.request.contextPath }/CSS/Accomodation.css" rel="stylesheet" type="text/css">
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="${pageContext.request.contextPath }/JS/Accomodation.js"></script>
</head>

<form method="post" enctype="multipart/form-data"
	action="AccomodationRegister">
	<div id="accomodation">
		<h2>숙박 등록</h2>

		<div>
			<p>숙박시설명</p>

			<input name="bFacilityName" id="name" type="text" size="10"
				maxlength="10" value="" />
		</div>

		<div class="addreses">
			<p>숙박시설 주소</p>
			<input class="address" type="text" id="sample6_postcode"
				placeholder="우편번호"> <input class="address" type="button"
				onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>

			<input class="address" type="text" id="sample6_address"
				placeholder="주소" name="address"><br> <input
				class="address" type="text" id="sample6_detailAddress"
				placeholder="상세주소" name="addressDetail">
		</div>

		<div>
			<p>숙박시설 종류</p>
			<select name="AccomodationKind" class="kind">
				<option value="모텔" selected="selected">모텔</option>
				<option value="호텔">호텔</option>
				<option value="리조트">리조트</option>
				<option value="펜션">펜션</option>
			</select>
		</div>

		<div>
			<p>숙박시설장 연락처</p>
			<select name="tell" class="phone_text">
				<option value="010" selected="selected">010</option>
				<option value="011">011</option>
				<option value="016">016</option>
				<option value="017">017</option>
				<option value="018">018</option>
				<option value="019">019</option>
				<option value="0139">0139</option>
			</select> <span>&nbsp-</span> <input type="text" class="phone_text"
				name="tell"> - <input type="text" class="phone_text"
				name="tell">
		</div>
		<div>
			<p>숙박시설 정보</p>
			<textarea name="bFacilityImform" cols="67" rows="15"></textarea>
		</div>
		<div>
			<p>파일 첨부</p>
			<input name="boardFile" type="file" />
		</div>
		
		<input type="submit" value="전송">

	</div>
</form>
</body>

</html>