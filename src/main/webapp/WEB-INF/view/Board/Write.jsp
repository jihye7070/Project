<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta>
<link href="${pageContext.request.contextPath }/CSS/BoardWrite.css"
	rel="stylesheet" type="text/css">
<title>글 쓰기</title>
<!-- 
<link href="/css/footer.css" rel="stylesheet" type="text/css">

<script src = "../js/header.js"></script>
설정(기본값) -->
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script>
	$(document).ready(function(){
		$(function() {
		      $('#boardContent').keyup(function (e){
		          var content = $(this).val(); 
		          $('#counter').html(content.length + '/1300');
		      });
		      $('#boardContent').keyup();
		});
		
		/*  $(function(){
	          var title = $("#boardTitle");
	          var name = $("#boardName");
	          var blank_pattern = /^\s+|\s+$/g;


	          
 	          title.blur(function(){
	             if(title.val().replace(blank_pattern,'')==""){
	                   alert("제목에 공백만 사용할수 없습니다.");
	                    title.focusout();
	                    title.focusin();
	                    return false;
	                }
	          });
	          
	          name.blur(function(){
		         if(name.val().replace(blank_pattern,'')==""){
		         	alert("이름에 공백만 사용할수 없습니다.");
		         	name.focusout();
		            name.focusin();
		            return false;  
		        	}
		       	});
	       });  */
	             
	}); 


     function formCheck(){
    	// 사용하기 쉽도록 변수를 선언하여 담아주고,
    	    var title = document.forms[0].boardTitle.value;
    	    var writer = document.forms[0].boardName.value;
    	    var pass = document.forms[0].boardPass.value;
    	    var content = document.forms[0].boardContent.value;
    	    
    	    var tmptitle = document.forms[0].boardTitle.value.replace(/\s|　/gi, '');
    	    var tmpwriter = document.forms[0].boardName.value.replace(/\s|　/gi, '');
    	    var tmppass = document.forms[0].boardPass.value.replace(/\s|　/gi, '');
    	    var tmpcontent = document.forms[0].boardContent.value.replace(/\s|　/gi, '');

            var passwd = $("#boardPass").val();
            var pattern = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,20}$/;
            
    	    if (title == null || title == "" || tmptitle=="") { // null인지 비교한 뒤
    	        alert('제목을 입력하세요'); // 경고창을 띄우고
    	        document.forms[0].boardTitle.focus(); // 해당태그에 포커스를 준뒤
    	        return false; // false를 리턴합니다.
    	    }
    	    if (writer == null || writer == "" || tmpwriter=="") {
    	        alert('작성자를 입력하세요');
    	        document.forms[0].boardName.focus();
    	        return false;
    	    }
    	    if (pass == null || pass == "" || tmppass=="") {
    	        alert('비밀번호를 입력하세요');
    	        document.forms[0].boardPass.focus();
    	        return false;
    	    }

            if (!pattern.test(passwd)) {
            	alert('비밀번호는 숫자+영문자+특수문자 조합으로 8자리 이상 사용해야 합니다.');
                $('#boardPass').val('').focus();
                return false;
            }
    	    if (content == null || content == "" || tmpcontent=="") {
    	        alert('글 내용을 입력하세요');
    	        document.forms[0].boardContent.focus();
    	        return false;
    	    }
    }

	    function keyup(obj, maxByte) {
	    	 
	        var strValue = obj.value;
	        var strLen = strValue.length;
	        var totalByte = 0;
	        var len = 0;
	        var oneChar = "";
	        var str2 = "";
	        
	        for (var i = 0; i < strLen; i++) {
	            oneChar = strValue.charAt(i);
	            if (escape(oneChar).length > 4) {
	                totalByte ++;
	            } else {
	                totalByte++;
	            }
	 
	            // 입력한 문자 길이보다 넘치면 잘라내기 위해 저장
	            if (totalByte <= maxByte) {
	                len = i + 1;
	            }
	        }
	 
	        // 넘어가는 글자는 자른다.
	        if (totalByte > maxByte) {
	        	if(maxByte==40){
	        		alert("제목은 "+40 + "자를 초과 입력 할 수 없습니다.");
	        		

	        	}
	        	if(maxByte==20){
	        		alert("이름은"+20 + "자를 초과 입력 할 수 없습니다.");
	        	}
	        	if(maxByte==1300){
	        		alert("내용은 "+1300 + "자를 초과 입력 할 수 없습니다.");
	        	}
	            str2 = strValue.substr(0, len);
	            obj.value = str2;
	        }   
	        var title = $('#boardTitle').val().replace(/^\s+$/g,'');
	        $('#boardTitle').val(title);
	        var name = $('#boardName').val().replace(/^\s+$/g,'');
	        $('#boardName').val(name);
	        
	    }

     
</script>
</head>
<body>
	<form:form method="post" action="BoardWrite" id="reset"
		onsubmit="return formCheck();"  enctype="multipart/form-data">
		<div class="wrap_content">
			<div class="wrap_list">
			<ul id="list">
				<li id="title">제 목</li>
				<li id="title_detail"><input type="text" name="boardTitle" id="boardTitle"
					class="byteLimit" onkeyup="keyup(this,40)"></li>

				<li id="name">이 름</li>
				<li id="name_detail"><input type="text" name="boardName" id="boardName"
					class="byteLimit" onkeyup="keyup(this,20)"></li>
				<li id="pass">비밀번호</li>
				<li id="pass_detail"><input type="password" name="boardPass" id="boardPass" 
					class="byteLimit" >
				<div class="error" id="pw_error">8~16글자만 입력하세요</div>
				<div class="error" id="pw_error2">영문,숫자,특수문자를 조합하세요</div>
				</li>
			</ul>
			</div>
			<div class="content_wrap">
				<ul id="list">
					<li id="content_detail">
					<div class="wrap">
						<textarea name="boardContent" id="boardContent" cols="120" rows="150" onkeyup="keyup(this,1300)"></textarea>
						<span id="counter" >0</span>
					</div>
					</li>
					<li><input type="file" name="files" multiple/></li>
				</ul>
			</div>
			
			<div>
				<div id="btn_wrap">
					<input type="submit" value="등록" id="btn" /> 
					<input type="button" value="목록" onclick="location.href='BoardList'" id="btn1" />
					<input type="reset" value="초기화" id="btn1" />
				</div>
			</div>             
		</div>
	</form:form>
</body>
</html>        