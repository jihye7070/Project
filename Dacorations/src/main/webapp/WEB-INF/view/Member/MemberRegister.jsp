<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>SIGN UP</title>
<link href="https://fonts.googleapis.com/css?family=Jua|Play"
	rel="stylesheet">
<!--폰트-->
<!--body { font-family: "Jua", sans-serif;} -->
<link href="${pageContext.request.contextPath }/CSS/MemberRegister.css"
	rel="stylesheet" type="text/css">

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="Dacorations/JS/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="Dacorations/JS/jquery.form.js"></script>

<script src="${pageContext.request.contextPath }/JS/MemberRegister.js">
    </script>
</head>

<body>
	<script type="text/javascript">
     
     $(function(){
		$("#id").keyup(function(){
        var id=$("#id").val();
		$.ajax({
		type:"POST",
		url : "MemberDuplicate",
		data :"id="+id,
		dataType: "html",
		success:function(data){
			$('#idCheck').html(data)
		}
	});
			
		});
	});
	function check() {
		 var duplicate=$("#Duplicate").val();
		
		if(duplicate==""){
			alert("아이디 중복체크를 다시해주세요")
			  return false;
		}
	}
	</script>

	<!-- 헤더 인클루드 하지 말기-->
	<div id="wrap_frm">
		<div id="logo_box">
			<img src="${pageContext.request.contextPath }/images/logo.png"
				id="join_logo" width="300px" height="100px;">
		</div>

		<form method="post" action="MemberJoin" onsubmit="return check()">
			<div id="join_auth">
				<p>회원가입</p>
				<table>
					<tr>
						<th>아이디</th>
						<td><input id="id" type="text" class="textbox" name="id"
							placeholder="   아이디"></td>
					</tr>
					<tr>
						<td><div id="idCheck"></div></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" class="textbox" name="passward"
							placeholder="   비밀번호" style="font-size: 20px"></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="password" class="textbox"
							placeholder="   비밀번호확인" style="font-size: 20px"></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td><input type="email" id="email" name="email"
							class="textbox" placeholder="   이메일"></td>
					</tr>
					<tr>
						<th>이름</th>
						<td><input type="text" id="name" name="name" class="textbox"
							placeholder="   이름"></td>
					</tr>
					<tr>
						<th>성별</th>
						<td><input type="radio" class="gender_radio" value="남"
							name="gender" />남자<input type="radio" class="gender_radio"
							value="여" name="gender" />여자</td>
					</tr>
					<tr>
						<th>연락처</th>
						<td><select name="tell" class="phone_text">
								<option value="010" selected="selected">010</option>
								<option value="011">011</option>
								<option value="016">016</option>
								<option value="017">017</option>
								<option value="018">018</option>
								<option value="019">019</option>
								<option value="0139">0139</option>
						</select> <span>&nbsp-</span> <input type="text" class="phone_text"
							name="tell"> - <input type="text" class="phone_text"
							name="tell"></td>
					</tr>
					<tr>
						<th>주소</th>
						<td><input type="text" class="textbox" id="sample6_postcode"
							placeholder="우편번호"> <input type="button"
							onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
							<input type="text" class="textbox" name="address"
							id="sample6_address" placeholder="   주소"><br> <input
							type="text" class="textbox" name="detailAddress"
							id="sample6_detailAddress" placeholder="상세주소">
					</tr>
					<tr>
						<th colspan="2">
							<p>
								이벤트메일링수신동의여부<input type="checkbox" class="checkbox"
									name="mailConfrim" value="O">
							</p>
						</th>
					</tr>

				</table>
				<p></p>
				<p>
					<input type="submit" id="join_success" value="가입 완료">
				</p>
			</div>
		</form>
	</div>
</body>

</html>