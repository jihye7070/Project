--<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, Model.FestivalDTO"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">

    <!--제목 설정-->
    <title>옵션메인</title>

    <!-- 기본 설정  => 여기서부터 -->
    <meta name="viewport" content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
    <!-- font 설정 -->
    <link href="https://fonts.googleapis.com/css?family=Jua|Play" rel="stylesheet">
    <!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR" rel="stylesheet">
    <!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->

    <!--Jquery, JqueryUI설정-->
    <script src="https://code.jquery.com/jquery-3.3.1.js"
        integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
        integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30=" crossorigin="anonymous"></script>
    <link href="/css/body.css" rel="stylesheet" type="text/css">
    <link href="/css/header.css" rel="stylesheet" type="text/css">
    <link href="/css/footer.css" rel="stylesheet" type="text/css">


    <script src="../js/header.js"></script>

    <link href="${pageContext.request.contextPath }/CSS/FestivalOption_content.css" rel="stylesheet" type="text/css">



</head>

<body>


    <!-- Header 시작 -->
    <jsp:include page="../include/header.jsp" />
    <!-- Header 끝 -->
    <!-- Content 시작(내용 첨가) -->
   <form action="OrderMain" method="post">
    <div class="wrap_contents">
        <div class="order">

            <div class="order_info">
              
                    <table>
                        <tr>
                            <td colspan="3">
                                <p id="info_box">옵션선택</p>
                            </td>
                        </tr>
                        <tr>
                            <td rowspan="16"><img src="Product/date/${command.optionimg }" alt="" width="400"
                                    height="400"></td>
                        </tr>


                        <tr>

                            <td class="sub">상품</td>
                            <td id="con">${command.productType }</td>

                        </tr>
                        <tr>
                            <td class="sub">이름</td>
                            <td id="con">${command.productName }</td>
                        </tr>
                        <tr>
                            <td class="sub">날짜</td>
                            <td id="con">
                                <input type="date" name="optionDate" >
                            </td>


                        </tr>

                        <tr>
                            <td class="sub">시간</td>

                            <td id="con">${command.optionTime }</td>
                        </tr>
                        <tr>
                            <td class="sub">체크인</td>
                            <td>${command.optionCheckin }</td>
                        </tr>
                        <tr>
                            <td class="sub">체크아웃</td>
                            <td>${command.optionCheckout }</td>
                        </tr>
                        <tr>
                            <td class="sub">좌석</td>
                            <td id="con">${command.optionSeat }</td>
                        </tr>
                        <%--  <tr>
                        <td class="sub">가격</td>
                        <td id="con">${command.festivalPrice }원</td>
                    </tr> --%>
  
                        <tr>
                            <td class="sub">옵션</td>
                            <td id="con">
                                <select id="option" name="option" onchange="changePrice(this.value)">
                                    <option selected="selected">선택해주세요</option>
                                    <c:forEach items="${opt}" var="op">
                                        <option id="options">${op.optionNum}+${op.optionProduct }+${op.optionPrice }</option>
                                    </c:forEach>
                                </select>
                            </td>

                        </tr>

                        <tr>
                            <td class="sub">가격</td>
                            <td id="plus">${command.optionPrice }</td>

                        </tr>
                        <tr>
                            <td>
                                <input type="hidden" name="productNum" value="${command.productNum }">
                                <input type="hidden" name="categoryNum" value="${command.categoryNum }">
                                <input type="hidden" name="optionSeat" value="${command.optionSeat }">
                                <input type="hidden" name="optionTime" value="${command.optionTime }">
                                <input type="hidden" name="optionCheckin" value="${command.optionCheckin } ">
                                <input type="hidden" name="optionCheckout" value="${command.optionCheckout } ">
                                <input type="hidden" id="price" name="optionPrice" value="${command.optionPrice }">
                                <%-- <input type="hidden" name="optionDate" value="${command.optionDate }"> --%>
                            </td>
                        </tr>
                   
                    </table>
               
            </div>
            <div class="pay_info">
                <table>
                    <tr>
                        <td colspan="3">
                            <p id="info_box">결제</p>
                        </td>
                    </tr>
                    
                        <tr>

                            <td class="sub">예약자</td>
                            <td id="con"><input type="text" name="name"></td>

                        </tr>
                        <tr>
                            <td class="sub">예약자번호</td>
                            <td id="con"><input type="text" name="tell"></td>
                        </tr>
                    <tr>
                        <td class="sub">카드사</td>
                        <td>
                            <select name="cardName">
                                <option value="KB">KB</option>
                                <option value="NH">NH</option>
                                <option value="BC">BC</option>
                                <option value="롯데">롯데</option>
                                <option value="삼성">삼성</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="sub">카드 번호</td>
                        <td>
                            <input type="text" size="4" name="cardNum">
                            <input type="text" size="4" name="cardNum">
                            <input type="text" size="4" name="cardNum">
                            <input type="text" size="4" name="cardNum">
                        </td>
                    </tr>
                    <tr>
                        <td class="sub">할부기간</td>
                        <td>
                            <select name="cardTerm">
                                <option >일시불</option>
                                <option >2개월</option>
                                <option >3개월</option>
                            </select>
                        </td>
                    </tr>
                        <tr>
                            <td colspan="2" id="btn"><button type="submit" value="예약하기" id="paybtn">예약</button></td>
                        </tr>
                           </form>
                </table>
 
            </div>
        </div>
     
     
     
     
     
     
        <script type="text/javascript">
            var price;
            var b = document.getElementById("plus").innerHTML;
            var a;
            var c;
            function changePrice(a) {
                var price = a.split("+");
                a = eval(price[2]);
                c = eval(b);
                price = a + c;
                document.getElementById("plus").innerHTML = price;
                document.getElementById("price").value=price;
            
            }
            document.getElementById("plus").innerHTML = b;
            
            
            price = 0;
        </script>


    </div>
    <!-- Content 끝 -->
    <!-- Footer 시작 -->
    <%-- <jsp:include page="Footer.jsp" /> --%>
    <!-- Footer 끝 -->
</body>

</html>