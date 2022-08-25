
/*
    객체명.textContent
    객체명.innerHTML
    객체명.value
 */

// 1. HTML 요소 가져오기
const input = document.querySelector('#inchbox')
const button = document.querySelector('#inchbtn')
const p = document.querySelector('#inchp')

// 2. 버튼을 눌렀을때
button.addEventListener( 'click' , () =>{
	
	const inch = Number(input.value) // Nunber ( 문자 ) : 문자명 -> 숫자열
	
	// isNaN (데이터) : 숫자가 아니면 true / 숫자이면 false
	if(isNaN(inch) ){ // 입력값이 숫자가 아니면
		p.textContent = '숫자를 입력해주세요'
		return
	}
	// 입력값이 숫자이면
	const cm = inch * 2.54
	p.textContent = `${cm} cm`
})


// 341
// 1. html 요소 가져오기
const emailbox = document.querySelector('#emailbox')
const emailp = document.querySelector('#emailp')

// 이메일 결합 확인 함수 [ 익명 함수 ]
const isemail = (value) => {
	return(value.indexOf('@') > 1 ) && (value.split('@')[1].indexOf(".") > 1 )
	       // 입력데이터의 @ 가 있는지 이면서 입력데이터의 @ 뒤문자 	       	
}

emailbox.addEventListener('keyup' , ( event ) =>{
	const value = event.currentTarget.value
	if( isemail(value) ){
		p.style.color = 'green'
		p.textContent = `이메일 형식입니다. : ${value}`	
	}else{
		p.style.color = 'red'
		p.textContent = `이메일 형식이 아닙니다: ${value}`
	}
	
})

/*
    배열명.indexOf('검색데이터') : 배열내 해당 데이터의 인덱스 번호 찾기
    문자열.indexOf('@') : 문자열내 @ 의 인덱스 번호 찾기
         만약에 0보다 작으면 못찾았다~~ [ 인덱스란 : 저장 순서 번호 = 0번 시작 ]
    문자열.split('기준문자') : 문자열내 기준문자 기준으로 분리 -> 배열
        예) 
            문자열 = 유재석,강호동,신동엽,하하 
            문자열.split("/")    : [ 유재석,강호동,신동엽,하하]
            문자열.split("/")[0] : 유재석
            문자열.split("/")[3] : 하하 
 */

// p.343
// 1. html 요소 가져오기
const selectbox = document.querySelector('#selectbox')
const selectp = document.querySelector('#selectp')

// 2. selectbox 의 데이터가 변경 될때마다 실행되는 이벤트 
selectbox.addEventListener('change' , (event)=>{
	
	// 옵션목록 = select의 모든 option 호출 [slect객체.options]
	const options = event.currentTarget.options
	// options 중에서 [사용자]선택된 번호 호출 
	const index = event.currentTarget.options.selectboxIndex
	//
	selectp.textContent = `선택: ${options[index].textContent}`
	//                          옵션목록[ 선택한목록번호 ].내용물
})

// p.344
const selectbox2 = document.querySelector('#selectbox2')
const selectp2 = document.querySelector('#selectp2')

//selectbox2 가 데이터 변경 되었을때 
selectbox2.addEventListener('change' , (event)=>{
	
	// 옵션목록 = selectbox2 모든 옵션을 호출
	const options = event.currentTarget.options
	const list = [ ] // 선택된 옵션들의 저장하는 배열 선언 
	
	for( const option of options ){
		// 배열[옵션목록]중 하나씩 option 대입 반복 
		if( option.selected ){ // 만약에 해당 옵션에 selected 속성[선택상자]이 있으면 
		    // 배열에 선택된 옵션의 텍스를 추가 
			list.push( option.textContent )
		} // if end
	} // for end
	
	selectp2.textContent = `방출 : ${list.join(',')}`
	// 배열명.join('연결문자') : 배열내 모든 여소들을 연결문자 기준으로 하나의 문자열로 변함
	    // 배열명 = [ '유재석' , '강호동' , '신동엽']
	    // 학생명.join('<->')
	    // 유재석<->강호동<->신동엽
})  

// p. 345~6

let 현재값        // input 입련된 데이터를 저장하는 변수 
let 변환상수 = 10  // select 에서 선택된단위별 값 저장하는 변수 
// 0.html 요소 가져오기
const cminput = document.querySelector('#cminput')
const cmspan = document.querySelector('#cmspan')
const cmselect = document.querySelector('#cmselect')

// 3. select 상자의 데이터를 변경했을때 이벤트 
cmselect.addEventListener('change', (event)=>{
	const options = event.currentTarget.options
	const index = event.currentTarget.options.selectedIndex
	변환상수 = Number( options[index].textContent )
	calculate()
})


// 2.
const calulate = () => {
	// span 에 계산된 결과를 출력 
	cmspan.textContent = (현재값*변환상수).toFixed(2)
}



// 1. input 입력할때마다 현재값 변수를 입력된 변환해주는  이벤트
cminput.addEventListener('keyup' , (event) =>{
	// input 입력된 데이터(value) 숫자형으로 변환후 현재값 변수에 저장
	현재값 = Number( event.currentTarget.value )
	calulate() // 함수 실행 
})

// p. 347
let timer = 0
let timerId = 0
const timerinput = document.querySelector('#timerinput')
const timerh1 = document.querySelector('#timerh1')

timerinput.addEventListener('change' , (event) =>{
	
	if(event.currentTarget.checked){
		timerId = setInterval(() => {
			timer += 1
			timerh1.textContent = `${timer}초`
		}, 1000)
	}else{ // 체크가 안되어 있을때 
	  clearInterval(timerId) // 타이머 함수 종료 [ clearInterval(타이머객체) ]
	}
})

// p. 348~349

/*
    class => .class명                  [복수]  
    id    => '.class명'                [단일]
    tag   => 'tag'                    [복수]    
    name  => '[name=name명]'           [복수]
    
    <h1 id="" class="" name="" >
    
 */
 // 1. html 요소 
const radios = document.querySelectorAll('[name=pet]')
const output = document.querySelector('#output')

// 2. radios[배열]
    // 배열명.forEach( ( 반복변수 )=>{ } )
       // 동물목록 = [ 강아지 , 고양이 , 햄스터 , 기타 ]
       /*
           1. for( let i in 동물목록 ){}
              i = 0 i = 1 i = 2 i = 3
              
           2. for
             
           3. 배열명.forEach    
        */
    
radios.forEach( (radio)=>{ 
	
	radio.addEventListener('change' , (event) =>{
		const current = event.currentTarget
		if (current.checked ){
			output.textContent = `좋아하는 첼시선수는 ${current.value}이시군요!`
		} // if end
	}) // event end
}) //forEach end








































































