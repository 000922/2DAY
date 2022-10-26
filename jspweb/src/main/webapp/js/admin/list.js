
getproduct()
// 1. 모든 제품 호출 메소드 
function getproduct(){
	$.ajax({
		url :"/jspweb/admin/regist" ,
		type : "get", 
		success : function( re ){
			let json = JSON.parse( re )
			console.log( json )
			let html = ""
			for( let i = 0 ;  i<json.length ; i++){
				let p = json[i]
				console.log( list ) 
				html += '<tr>' +
							'<td>'+pno+'</td>'+
							'<td onclick="viewload('+p.name+')">'+pcomment+'</td>'+
							'<td>'+pprice+'</td>'+
							'<td>'+pdiscount+'</td>'+
							'<td>'+pactive+'</td>'+
							'<td>'+pimg+'</td>'+
							'<td>'+pdate+'</td>'+
							'<td>'+pcno+'</td>'+
						'</tr>';
			} // for end 
				console.log( html )
			document.querySelector('.json').innerHTML = html
		
		}
	})
}