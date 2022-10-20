alert('aa')

let pageinfo = {  // js 객체 선언 
 	listsize : 5 ,  // 한페이지당 게시물 표시 개수 
	page  : 1 ,		// 현재 페이지 번호 
	key : '' ,		// 검색 키
	keyword : '' ,	// 검색 키워드 
}


list( 1 )

function list( page ){
	
	pageinfo.page = page;
	
	$.ajax({
		url : "http://localhost:8282/jsptset/list" ,
		data :  pageinfo ,
		success : function( re ){
			let boards = JSON.parse(re)
			console.log( boards )
			
			let boardlist = boards.data
			
			console.log( boardlist )
			
		}
		
	})
	
}