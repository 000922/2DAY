alert('view')

bview()

function bview(){
	$.ajax({
		url : "http://localhost:8282/jsptset/view" ,
		async : false ,
		success : function( re ){
		let board  = JSON.parse( re )
		console.log( board )
		document.querySelector('.bno').innerHTML = board.bno;
		document.querySelector('.btitle').innerHTML = board.btitle;
		document.querySelector('.bcontent').innerHTML = board.bcontent;
		document.querySelector('.mid').innerHTML = board.mid;	
		document.querySelector('.bwrite').innerHTML = board.bwrite;
		document.querySelector('. bdate').innerHTML = board.bdate;
		document.querySelector('.bview').innerHTML = board.bview;
		
		
		}
	})
}
