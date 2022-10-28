<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

		<link href="/jspweb/css/main.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

		<%@include file="header.jsp" %>
		
	<!-- 대문 [ 이미지 슬라이드 - 캐러셀 ]  -->
	<div id="carouselExampleControls" class="carousel slide carousel-fade" data-bs-ride="carousel" data-bs-interval="1000">
													<!-- carousel-fade: 덮여씌우기 /  data-bs-interval : 밀리초 -->
	
  		<div class="carousel-inner">
   			<div class="carousel-item active">
      			<img src="/jspweb/img/mainimg01.jpg" class="d-block w-100" alt="...">
    		</div>
    		<div class="carousel-item">
     			 <img src="/jspweb/img/mainimg02.jpg" class="d-block w-100" alt="...">
    		</div>
    		<div class="carousel-item">
      			<img src="/jspweb/img/mainimg03.jpg" class="d-block w-100" alt="...">
    		</div>
  		</div>
  		
  	<!-- 왼쪽 버튼 -->
  	<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
   	 	<span class="carousel-control-prev-icon" aria-hidden="true"></span>
  	 	<span class="visually-hidden">Previous</span>
  	</button>
  	
  	<!-- 오른쪽 버튼 -->
  	<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    	<span class="carousel-control-next-icon" aria-hidden="true"></span>
    	<span class="visually-hidden">Next</span>
 	 </button>
	</div>
	
	
	<!-- 제품 출력 -->
	<div class="container"> <!-- 부트스트랩 : container 박스권 -->
	
		<h6 class="box_title"> Calvin Klein BEST </h6>
		
		<div class="itemlist"> <!--  일정 구역 -->
			
					

		</div> <!-- 일정구역 end -->		
	</div>
	
	
	<!-- js -->
	<script type="text/javascript" src="/jspweb/js/admin/index.js"></script>
	
	
	
	
	<!-- 메인 -->
	
<!-- 	<img alt="" src="img/mainimg.gif" width="100%">
	
	<div class="webbox"> 
		<h3> 메인 페이지 </h3>
	</div>  -->

</body>
</html>