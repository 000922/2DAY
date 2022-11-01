alert('연결')

/*
	document.querySelector('tag명')
	document.querySelector('#id명')
	document.querySelector('.class명')
	여러개[배열] : document.querySelectorAll()
	-- 속성[ 해당 tag내에서 사용가능한 속성 ]
		value : div , span , td 등 사용불가
		innerHTML
		src :
		style :
 */

// 공통변수
let stock = null // 전역변수 

// 1. 현재 페이지내 제품번호[ a href="링크?pno=제품번호" ]를 가지고 와서 ajax로 해당 제품번호의 모든 제품정보를 가져오자

let pno = document.querySelector('.pno').value
alert( "보고있는 제품 번호 : " + pno )

$.ajax({
	url : "/jspweb/admin/regist" ,
	type : "get" ,
	data : { "type" : 2 , "pno" : pno } ,
	success : re => { 
		let product = JSON.parse( re )
		
		console.log( product ) 
		
		// 1. 제품사진 대입
		document.querySelector('.pimg').src='/jspweb/admin/pimg/'+product.pimg
		// 2. 제품명 대입
		document.querySelector('.pname').innerHTML = product.pname
		// 3. 제품설명 대입 
		document.querySelector('.pcomment').innerHTML = product.pcomment
		// 4. 가격 대입 
		let phtml =	''
			
			if( product.pdiscount == 0 ){ // 2. 할인이 없을때	[ 천단위 쉼표 함수 : 데이터.toLocaleString() ]
			phtml += '<span class="psale">'+(product.pprice.toLocaleString() )+'원</span>'
			
			}else{ // 1. 할인이 있을때						[ 반올림(소수점버리고 반올림) : Math.round( 데이터 ) ]
			
			phtml +=
				'<span class="pdiscount">'+ Math.round( product.pdiscount * 100 )+'%</span>'+
				'<span class="pprice">'+( product.pprice.toLocaleString() )+'원</span>'+
				'<span class="psale">'+ ( product.pprice -( product.pprice * product.pdiscount ) ).toLocaleString() +'원</span>'
			}
		
		
		document.querySelector('.pricebox').innerHTML = phtml
			
			
			// 5. 해당 제품이 제고 [ajax ]
			$.ajax({
				url : "/jspweb/admin/stock" ,
				type : "get" ,
				data : { "pno" : pno } ,
				success : (re) => {
					 stock = JSON.parse(re)	// 제품 정보 
					 
					 console.log(stock) // 제고 목록
					 
					 // 자바 set VS js set	[ 컬렉션 : 수집  // 프레임워크 : 미리 만들어진 클래스 ]
					 
						// let set = new Set( [1,1,2,2,3,3] );	console.log( set )
					 
					 // 사이즈목록 중복제거 [ set , includes , filer 등 ]
					 	// 1. 사이즈 목록
					 let sizelist = [ ]		// 1. 중복이 있는 사이즈 배열 선언
					 stock.forEach( s => { sizelist.push( s.psize ) })	// 2. 리스트에 담기
					 let sizeset = new Set( sizelist )	// 2. 사이즈 리스트 => set 목록 변경 [ 중복제거]
			 		 	console.log( sizeset )				// 3. 확인
			 		
			 		
					// 6. 사이즈 종류 출력
					let shtml = '<span> [ '
					sizeset.forEach( s =>{
						shtml += " "+ s +" "
					})
					shtml += ' ] </span>'
					
					document.querySelector('.sizebox').innerHTML = shtml
					 
				
			
			// 7. 색상 select 구성
			// 색상목록 중복제거 [ set , includes , filer 등 ]
			let colorlist = [ ]
			stock.forEach( s => { colorlist.push( s.pcolor ) })
			let colorset = new Set( colorlist )
				console.log( colorset )		// 3. 확인 
			
			
			let chtml ='<option> -[필수] 색상 선택 </option>'
			colorset.forEach( c => {
				chtml += '<option value='+c+'> '+c+' </option>'
			})
			document.querySelector('.cselect').innerHTML = chtml
			
		 }
	  })	
			
	}
})

let color = null;	// 선택된 색상
let sproductlist = [] // 선택된 제품옵션 리스트 선언

// 색상 select 박스를 체인지 했을때 이벤트 
document.querySelector('.cselect').addEventListener('change' , (e)=>{
	color = e.currentTarget.value	// 이벤트를 발생한 객체[cselect]의 담겨져있는 값 
	alert( color + "색상 선택했습니다. ")
	
	// 8. 색상 select 에서 선택된  색상의 사이즈 select 구성 
	let shtml = '<option> -[필수] 사이즈 선택 </option>'
	stock.forEach( s => {
		if(s.pcolor == color ){	// 재고목록중에 선택된 색상과 같으면 해당 사이즈 html 
			shtml += '<option value='+s.psize+'> '+s.psize+' </option>'
		}
	})
	document.querySelector('.sselect').innerHTML = shtml
})

// 사이즈 select 박스를 체인지
document.querySelector('.sselect').addEventListener('change' , (e)=>{
	let size = e.currentTarget.value
	
	// 선택된 제품정보와 옵션을 객체 만든다.
	let sproduct = {
		pcolor : color ,	// 색상 
		psize : size ,		// 사이즈
		amount : 1			// 수량
	}
	// 리스트에 담는다.
	sproductlist.push( sproduct )
	console.log( sproductlist )	// 확인
	
	print()	// 리스트에 존재하는 객체를 출력한다.
})
// 2. 선택된 제품옵션 리스트를 출력하는 함수 [ 1. 사이즈선택 했을때 2.옵션 제거 했을때 마다 실행 ]
function print(){
	let ohtml = '';
	sproductlist.forEach( p => {
		ohtml += '<tr>	<!-- 아이템 구역 -->'+
'								<td> '+
'									<span>미라클 바지</span>'+
'									<br>'+
'									<span> -블랙 / FREE </span>'+
'								</td>'+
'								<td> '+
'									<div class="row g-0"> '+
'										<div class="col-md-6"> '+
'										 	<input class="form-control" value="1"> '+
'										</div>'+
'										<div class="col-md-4">	'+
'											<button class="amount_btn">▲</button>'+
'											<button class="amount_btn">▼</button>'+
'										</div>'+
'										<div class="col-md-1">'+
'											<button class="cancel_btn">X</button>'+
'										</div>	'+
'									</div>'+
'								</td>'+
'								<td>'+
'									<span> 20,000원 </span> <br>'+
'									<span class="pointbox"> (포인트) 200 </span>'+
'								</td>'+
'							</tr>';
	})
	document.querySelector('.select_t').innerHTML = ohtml
}


















































