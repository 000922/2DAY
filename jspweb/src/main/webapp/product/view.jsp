<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/jspweb/css/produtview.css" rel="stylesheet">
</head>
<body>
		<%@include file = "../header.jsp" %>
		
		<%	// 자바를 작성할수 있는 태그 [서블릿] 
			 // 1. 경로에 있는 pno request 요청
			int pno = Integer.parseInt( request.getParameter("pno") );
		
		%>
		<input type="text" value="<%=pno%>" class="pno">
		
		<div class = "container">	<!--  b : container -->
		
			<div class="row">	<!-- b : row -->
				<!-- 대표 이미지 -->
				<div class="col-md-6">		<!-- b : col-md-6 -->
					<img class="pimg" alt="" src="/jspweb/img/바지.jpg">
				</div>
			
				<!-- 상품 정보 -->
				<div class="col-md-6">		<!-- b : col-md-6 -->
					<div class="infobox">
						<!-- 제품명 -->
						<h4 class="pname"> 남성 90'S 루즈핏 블랙 데님 </h4>
						
						<!-- 제품 설명 -->
						<div class="pcomment"> 강한 스톤워시로 SALT PEPPER 룩을 보여주는 데님입니다. </div>
						<!-- 가격 -->
						<div class="pricebox"> <!-- 할인율이 있을 경우 -->
							<span class="pdiscount">30%</span> <!-- 할인율 -->
							<span class="pprice">200,000원</span> <!-- 원가 -->
							<span class="psale">150,000원</span> <!--할인이 적용된 가격 -->
						</div>
						<!-- <div class="pricebox">	할인율이 없을경우
							<span> 200,000원 </span> 	원가
						</div> -->
						
						<!-- 사이즈 종류 -->
						<div class="sizebox">
							
						</div>
						
						<!-- 제품 옵션  -->
						<table class="table into_t"> <!-- b:ta -->
							<tr> <td>배송구분</td> <td> 2,500원 (70,000원 이상 구매시 무료)</td> </tr>
							<tr> <td>카드혜택</td> <td> 무이자 할부 </td> </tr>
							<tr> <td>적립혜택</td> <td> 3000(1%) </td> </tr>
							<!-- 사이즈 선택 행 -->
							<tr> <td> 색상 </td> 
								<td>
									<select class="cselect"> 
										
									</select>
								</td>
							</tr>
							
							<tr> <td> 사이즈 </td> 
								<td> 
									<select class="sselect">
										
									</select>
								</td>
							</tr>
						</table>
						
						<!-- 선택된 제품 목록 -->
						<table class="table select_t">
							<tr>
								 <th width="60%"> 상품명/옵션</th>
								 <th width="25%">수량</th> 
								 <th width="15%"> 가격 </th> </tr>
								 
							<!-- <tr>	아이템 구역
								<td> 선택된 옵션 정보
									<span>미라클 바지</span>
									<br>
									<span> -블랙 / FREE </span>
								</td>
								<td> 옵션 수량 구역
									<div class="row g-0"> b: g-0 하위태그내 모든 여백 제거
										<div class="col-md-6"> 수량 구역
										 	<input class="form-control" value="1"> 
										</div>
										<div class="col-md-4">	수량 버튼 구역
											<button class="amount_btn">▲</button>
											<button class="amount_btn">▼</button>
										</div>
										<div class="col-md-1">	수략 버튼 구역
											<button class="cancel_btn">X</button>
										</div>	
									</div>
								</td>
								<td>
									<span> 20,000원 </span> <br>
									<span class="pointbox"> (포인트) 200 </span>
								</td>
							</tr> -->
							
						</table>
						
						<!-- 선택된 제품들의 총 가격 -->
						<div class="row">
							<div class="col-md-6"> 총 상품금액 </div>
							<div class="col-md-6 totalprice"> 40,000원 </div>
						</div>
						
						<!-- 버튼목록 -->
						<div class="btnbox">
							<button id="btn1">바로 구매</button>
							<button id="btn2">장바구니 담기</button>			
							<button id="btn3">찜하기 ☆</button> <!-- 현재 회원이 찜하기 X -->
						</div>
						
					</div>
				</div>
				
			</div>
			
		</div>

		<script type="text/javascript" src="/jspweb/js/product/productview.js"></script>
</body>
</html>












