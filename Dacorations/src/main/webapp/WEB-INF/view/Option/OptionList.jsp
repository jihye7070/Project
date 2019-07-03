<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ page import="java.util.*"%>
<%@ page import="Model.*"%>
<%
	ArrayList<OptionDTO> options = null;
	if (request.getAttribute("options") != null) {
		options = (ArrayList<OptionDTO>) request.getAttribute("options");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>옵션리스트</title>
<style type="text/css">
html, body {
    margin: 0 auto;
    padding: 0;
    text-align: center;
    font-family: "Jua", sans-serif;
    background-color: rgba(252, 252, 252, 0.829);
}
.wrap_op_list {
    width: 800px;
    margin: 200px auto;
    border: 1px solid rgb(204, 198, 198);
    padding: 20px 50px 50px 50px;
    display: inline-block;
    text-align: center;
    background-color: white;
}
#sub {
    font-size: 30px;
}
.table{
    text-align: center;    margin: 20px auto;
}
#ta_sub{
    font-size: 25px;

}
.table tr {
    /* border:1px solid black;  */
    padding: 10px 0px 7px 0px;
    font-size: 18px;
    text-align: center;
}
.table td{
  
}
#num {
    width: 130px;
}

#sortation {
    width: 200px;
}

#product {
    width:300px;
}

#price {
    width: 150px;
}

</style>
</head>
<jsp:include page="../include/header.jsp" />
<body>
<div class="wrap_op_list">
		<p id="sub">옵션 관리</p>
		<table class="table">
			<tr id="ta_sub">
				
				<td id="sortation">구분</td>
				<td id="product">이름</td>
				<td id="price">가격</td>
			</tr>
			<tr><td colspan="3"><br></td></tr>
			<%
				if (options.size() ==0){
			%>
			<tr>
				<td colspan="4" style="text-align: center">옵션이 존재하지 않습니다.</td>
			</tr>
			<%} else { 
				 	for(int i = 0; i<options.size(); i++){	
			%>

			<tr id="ta_sub">
				
				<td id="sortation"><%=options.get(i).getOptionSoration() %></td>
				<td id="product"><%=options.get(i).getOptionProduct() %></td>
				<td id="price"><%=options.get(i).getOptionPrice() %></td>
			</tr>
			
			<%}
			}%>
		</table>
	</div>
</body>
</html>