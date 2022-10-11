

/*------------------회원정보 호출 ------------------------------ */

$.ajax({
	url : "/jspweb/member/info" ,
	success : function( result ) { 
		alert( result )
		// HTTP 스트림(바이트단위) json 형식의 문자타입을 JSON 타입으로 형변환
		let member = JSON.parse(result) 
		
		document.querySelector("#mno").innerHTML = member.mno
		document.querySelector("#mid").innerHTML = member.mid
		document.querySelector("#mname").innerHTML = member.mname
		document.querySelector("#mphone").innerHTML = member.mphone
		document.querySelector("#memmail").innerHTML = member.memmail
		document.querySelector("#maddress").innerHTML = member.maddress
		document.querySelector("#mdate").innerHTML = member.mdate
		document.querySelector("#mpoint").innerHTML = member.mpoint
		memberlist()
	}
});

/* ----------------- 모든 회원 호출 ----------------------- */
function memberlist(){
	$.ajax({
		url : "/jspweb/member/infolist",
		success : function( result ){
			let memberlist = JSON.parse(result)
			
			// 1. tag 가져오기
			 let table = document.querySelector("#memberlisttable")
			 alert( table )
			 
			 // 2. table 에 넣을 html 문자열 
			 let tag = 	'<tr>' +
						'<th> 번호 </th>' +
						'<th> 아이디 </th>' +
						'<th> 이름 </th>' +
						'<th> 연락처 </th>' +
						'<th> 이메일 </th>' +
						'<th> 주소 </th>' +
						'<th> 날짜 </th>' +
						'<th> 포인트  </th>' +
					'</tr>';
	
			 // 3. tag 값 넣기
			 for( let i = 0 ; i < memberlist.length ; i++ ){
				// 3. 해당 인덱스의 객체호출
				let m = memberlist[i]
				// 5. 해당 인덱스의 객체호출
				tag += 	'<tr>' +
						'<th> '+m.mno+' </td>' +
						'<th> '+m.mid+' </td>' +
						'<th> '+m.mname+' </td>' +
						'<th> '+m.mphone+' </td>' +
						'<th> '+m.memmail+' </td>' +
						'<th> '+m.maddress+' </td>' +
						'<th> '+m.mdate+' </td>' +
						'<th> '+m.mpoint+'  </td>' +
					'</tr>';
				// 6. 
				table.innerHTML = tag
				
			}
		}
	})
}
/*-------------------------회원 탈퇴------------------------- */

function viewdelete(){
	// 1. tag 가져오기
	let deletbox = document.querySelector("#deletbox")
	// 2. tag에 넣으 html 구성
	let tag =
			'<span> ! 정말 탈되 하시겠습니까? </span>' +
			'<input type="password" id="mpassword" >'+
			'<button onclick="mdelete()">확인</button>';
	// 3. tag 에 html 넣기
	deletbox.innerHTML = tag
}

function mdelete() {
	// 1. tag 입략된 비밀번호 가져오기 
	let mpassword = document.querySelector("#mpassword").value
	// 2. ajax 를 이용한 회원탈퇴 처리
	alert(2) 
	$.ajax({
		url : "http://localhost:8080/jspweb/member/delete",
		data : { "mpassword" : mpassword } ,
		success : function( result ){ 
			alert(result) 
			if( result === 'true'){
				alert('탈퇴 성공');
				location.href = 'http://localhost:8080/jspweb/member/logout.jsp'
			}else{ alert('동일하지 않는 비밀번호 입니다.')}
		}
	})
}




/*
	선언 : let 객체명 = { 속성명 : 값 , 속성명 : 값 , 속성명 : 값 }
	호출 : 객체명.속성명
*/
