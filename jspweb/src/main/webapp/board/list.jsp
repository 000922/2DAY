<%@page import="jspweb.model.dao.BoardDao"%>
<%@page import="jspweb.model.dao.MemberDao"%>
<%@page import="jspweb.model.dto.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	

</head>
<body>
		<%@include file="../header.jsp" %>
		
		<div class="webbox">
		<a href="write.jsp"> 글쓰기 </a>
		<!-- JSP로 테이블 표시   [ 서블릿,js 제외한 ] -->
<%-- 		<table>
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th> 작성자 </th>
			</tr>
			<%  // 스크립트 태그 : html에 java 작성할수 있는 공간
			
			ArrayList<BoardDto> list 
				= BoardDao.getInstance().getlist();
			
			for( int i = 0 ; i<list.size() ; i++ ){
			%>
				<tr>
					<td> <%= list.get(i).getBno() %></td>
					<td> <%= list.get(i).getBtitle() %></td>
					<td> <%= list.get(i).getMno() %></td>
				</tr>
			<% 
			}			// <%= 표현식(호출) 
			%>
		</table> --%>
		
		<!-- JS로 테이블 표시    [ HTML(JSP) --- JS ---- 서블릿 --- DAO ] -->
		<div>게시물수 : <span class="totalsize"></span><div></div>
		
		<div>
			<select class="listsize" onchange="blistsize()">
				<option value="5"> 5 </option>
				<option value="10"> 10 </option>
				<option value="15"> 15 </option>
				<option value="20"> 20 </option>
			</select>
		
		</div>
		
		
		
		<table class="btalbe table">
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th>작성자</th> 
				<th> 작성일 </th> <th> 조회수 </th>
			</tr>
		</table>
		
		<div class="pagebox">	<!-- 페이징처리  --> <!-- 22-10-19 -->
		
		</div>
		
		<div> <!-- 검색처리 -->
		
			<select class="key">
				<option value="b.btitle">제목</option>
				<option value="b.bcontent">내용</option>
				<option value="m.mid">작성자</option>
				
			</select>
			<input class="keyword" type="text" placeholder="검색어">
			<button type="button" onclick="bsearch()">검색</button>
		</div>
		
		
		
	</div>
		
		
	
	
	
	<script type="text/javascript" src="../js/board/list.js"></script>


</body>
</html>
