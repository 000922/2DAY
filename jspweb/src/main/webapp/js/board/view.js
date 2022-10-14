
bview()

function bview(){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/view" , 
		success : function( re ){ 
			let board  = JSON.parse( re )
			console.log( board )
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('.btitle').innerHTML = board.btitle;
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			document.querySelector('.mid').innerHTML = board.mid;
			/* 절대경로 : http://localhost:8080/jspweb/board/filedown */
			/* 상대경로 : 현재 우치 기준 [ http://localhost:8080/jspweb/js/view.js ] 
						../board/filedown
			*/
			/*
				<a href="URL?변수명=데이터">	: get메소드로 해당 URL 데이터 전송가능
				'<a href="URL?변수명='+qustnaud+'">'
			*/
			console.log(board.bfile )
			
			if( board.bfile ){	// null , undefined , 0 , false 
				alert( 'null 이 아닌경우.' )
				let filelink = '<a href=" http://localhost:8080/jspweb/board/filedown?bfile='+board.bfile+'">'+board.bfile+'</a>'
				// '' : 전체 문자열 처리
				// " " : 전체 문자열내 문자열 구분
				document.querySelector('.bfile').innerHTML = filelink;
			}
			// 아직 못함 3:42
			console.log( board.btnaction )
			let btnbox = document.querySelector('.btnbox')
			// 삭제 버튼 활성화 
			let deletebtn = '<button onclick="bdelete( '+board.bno+')"> 삭제 </button>'
			btnbox.innerHTML += deletebtn;
			// 수정 버튼 활성화
			let updatebtn = '<button><a href="../board/update.jsp">수정</a></button>'
			btnbox.innerHTML += updatebtn;
			
		}
	})
}

function bdelete( bno ){
	
	$.ajax({
		url : "http://localhost:8080/jspweb/board/bdelete" ,
		data : { "bno" : bno } , 	// 삭제할 게시물의 식별번호[pk -> bno ]
		success : function( re ){ 
			if( re === 'true'){
				alert('글삭제 성공');
				location.href="../board/list.jsp"
			}
			else{ alert('글삭제 실패 : [관리자에게문의]' ) }	
		}
	})
}





















