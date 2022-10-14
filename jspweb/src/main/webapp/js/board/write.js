
/* 썸머노트 실행 */
$(document).ready(function() {
  //$('#summernote').summernote( {설정객체} );
  $('#summernote').summernote( {
	
		plasceholder : '내용 입력 해주세요' , 
		maxHeight : null , 
		minHeight : 300, 
		lang: 'ko-KR' // default: 'en-US'
		
	});
  
}); 

function bwrite(){
	
	
	// form 버전
	let form = document.querySelector('form')	// 1. form 태크 호출
	console.log( form )
	
	let formdata = new FormData( form )			// 2. 객체화된 form 정보 호출 
	console.log( formdata )						// [ form안에 입력 받은 데이터 input 모두 가져오기]
	
	$.ajax({ // ajax 통신 전송타입 : 문자열 
		url : "http://localhost:8080/jspweb/board/write",	// 1. 서블릿주소
		data : formdata , 									// 2. ajax 기본값으로 form 전송 불가능
		
		// 첨부파일 전송시 : 아레 코드 추가 [ 1. post방식[get방식불가] ]
		type : 'POST' , // http 메소드 [ get vs post ]		
		contentType : false , 
		// application / x-www-form-urlencoded; charset = UTF-8 : 기본값  : 바이트 [ 첨부파일 지원 X ]
		// vs 
		// false : multipart/form-date				: 대용량 바이트 [ 첨부파일 지원O ]
		processData : false , // 전송시 사용되는 타입 
		// 기본값 : 젖놋url 데이터 명시 
		// VS
		// false : 
		success : function( re ){ alert( re ) 
			if( re === 'true'){ alert('글등록'); location.href="list.jsp"}
			else{ alert('글등록실패') }
		}
		
	})
	
	
	
	
	
	/* form 없는 버전
	let inputs = document.querySelectorAll('input')
	console.log( inputs ) // inputs[0] : 헤더에 검색 입력창
	let data = {
		btitle : inputs[1].value , 	
		bcontent : inputs[2].value
	}
	console.log( data )
	
	
	
	
	
	$.ajax({
		url : "http://localhost:8080/jspweb/board/write" ,
		data : data ,
		success : function ( re ){
			if( re === 'true'){ alert('글등록'); location.href="list.jsp"}
			else{ alert('글등록실패') }
		 }
	})
	*/
}

/*
	let 객체 = { 속성명 : 데이터 , 속성명 : 데이터 ~~ }
*/