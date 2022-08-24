/**
 * 
 */
 
let counter = 0 // 클릭수를 저장하는 변수
let isConnect = false // 연결 상태 저장하는 변수
 

const h1 = document.querySelector('h1') // 요소 가져오기
const p = document.querySelector('p') // 요소 가져오기
const connectBtn = document.querySelector('#connect') // 요소 가져오기
const disconnectBtn = document.querySelector('#disconnect') // 요소 가져오기
const upBtn = document.querySelector('#up')
const downBtn = document.querySelector('#down')

// 출력하는 함수 
const listener = () => {
	++counter
	h1.textContent = `클릭횟수: ${counter++} `
}

// 1. 연결 버튼을 클릭 했을때
connectBtn.addEventListener('click' , () =>{
	if( isConnect == false ){ 
		//만약에 연결이 안되어 있으면
		h1.addEventListener('click' , listener)  // h1태그에 클릭 이벤트 추가 
		p.textContent = '이벤트 연결 상태 : 연결' // p 태그 내용 넣기
		isConnect = true // 연결 했다는 의미를 연결상태 변수에 true 로 변함
	}
})

// 2. 연결해체 버튼을 클릭했을때
disconnectBtn.addEventListener('click' , () =>{
	if( isConnect == true ){  // 만약에 연결이 되어 있으면
		h1.removeEventListener('click' , listener ) // h1태그에 클릭 이벤트 제거
		p.textContent = '이벤트 연결 상태 : 해제'
		isConnect = false
	}
})

// 3. 증가 버튼을 클릭 헀을때 
upBtn.addEventListener('click' , () =>{
	if( isConnect ==false ){
		h1.removeEventListener('click' , listener )
		p.textContent =
		isConnect = true
	}
})




/*------------------------------------------------- */

/*
// 객체명.addEventListener('이벤트' , 콜백함수 )
      // 해당 객체의 이벤트 발생했을때 콜백함수 실행 된다 ~
// 1.       
h1.addEventListener( 'click' , ( ) =>{	
	counter++ // 번수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`	
}) // 이벤트 함수 end


// 2. html 에서 클릭이벤트 속성 이용한다.
function 함수(){
	counter++ // 변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`	
}
*/

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 