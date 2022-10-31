///////// 사이드 바 /////////////////
alert('dd')
// 1. 해당 사이드바 태그 호출
let sidebar = document.querySelector('.sidebar')
let mainbox = document.querySelector('#mainbox')

// 2. 해당 사이드바 태그를 클릭했을때 이벤트 [ 사이드바 열기 ]
sidebar.addEventListener( 'click' , function() {
	// 해당 사이드바 css 변경 [ left 속성을 0으로 만듬]
	sidebar.style.left = 0;
})

// 3. 본문 div 클릭했을때 이벤트 작동 [ 사이드바 접기 ]
mainbox.addEventListener( 'click' , function(){
	sidebar.style.left = '-170px';
})


/////////////// 본문 전환 이벤트 ///////////////////////
function pagechage( page ){
	// 특정 태그에 해당 파일을 로드 [ jquery]
	$("#mainbox").load( page )
	
}