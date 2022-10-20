
alert('dd')

function write(){
	
	let form = document.querySelector('from')
	console.log( from )
	
	let formdata = new FormData( from )
	console.log( from )
	
	$.ajax({
		url : "http://localhost:8282/jsptset/write" ,
		data : formdata ,
		type : 'POST' ,
		contentType : false , 
		processData : false ,
		success : function( re ){
			if( re === 'true'){ 
				alert('글등록'); 
				
			}
			else{ alert('글등록실패') }
		}
	}) // $.ajax end
	
} // function end
