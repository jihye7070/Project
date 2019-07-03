<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style></style>

<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/product.css"
	rel="stylesheet" type="text/css">
	
<script type="text/javascript" src="./JS/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="./JS/jquery.form.js"></script>
<script
  src="http://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>

<script>
function list(kind){

	$.ajax({
		type : "get",
		url : "Productkind",
		data : "kind="+kind,
			datatype : "html",
			success : function(data) {
				$("#ajax").html(data);
			}
		});
	}
</script>

</head>

<body>

	<div class="wrap_product">
		<p id="p">상품 관리</p>

		<div class="option" onclick="list('영화')">영화</div>
		<div class="option" onclick="list('숙소')">숙소</div>
		<div class="option" onclick="list('레스토랑')">레스토랑</div>
		<div id="ajax">
			<table id="table">
				<tr>
					<td colspan="4" id="sub">전체</td>
				</tr>

				<tr>
					<td id="sub">이름</td>
					<td id="sub">정보</td>
					<td id="sub">주소</td>
					<td id="sub">연락처</td>
				</tr>

			</table>
		</div>
	</div>
</body>
</html>
