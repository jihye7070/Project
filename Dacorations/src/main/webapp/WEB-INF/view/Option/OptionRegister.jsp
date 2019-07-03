<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath }/CSS/OptionRegister.css"
	rel="stylesheet" type="text/css">
</head>
<body>
<div class="wrap_option_reg">
		<form action="OptionRegister" method="POST">
			<p id="sub">옵션 등록</p>
			<table class="table">
				<tr>
					<td>옵션 구분</td>
					<td><select id="option" name="optionSoration">
							<option selected="selected">타입을 선택해주세요</option>
							<option value="숙박">숙박</option>
							<option value="레스토랑">레스토랑</option>
							<option value="축제">축제</option>
							<option value="영화">영화</option>
					</select></td>
				</tr>
				<tr>
					<td>옵션 이름</td>
					<td><input type="text" name="optionProduct" class="textbox" placeholder="    옵션 이름"></td>
				</tr>

				<tr>
					<td>옵션 가격</td>
					<td><input type="text" name="optionPrice" class="textbox" placeholder="    옵션 가격"></td>
				</tr>
			</table>
			<p></p>
			<p>
				<input type="submit" id="regist_success" value="완료">
			</p>
		</form>
	</div>
</body>
</html>