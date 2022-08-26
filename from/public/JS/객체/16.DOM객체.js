/*
 */
 
// 1. HTML 요소 가져오기 
const input = document.querySelector('#todo') 
     // 요소를 찾은 뒤 변수에 투입
const todoList = document.querySelector('#todo-list')
     // 요소를 찾은 뒤 변수에 투입
const addButton = document.querySelector('#add-button') 
    // 요소를 찾은 뒤 변수에 투입
 
//  변수 선언 
let keyCount = 0 

// 3. 함수 선언 후 불러온다.
const addTodo = () => { // 버튼을 눌러서 삭제 시킨다. 
	
	// 4. 공백 제거  
	if ( input.value.trim() === '' ){ // 입력을 안하고 버튼을 누르면 '공지'가 뜬다.
	alert('할 일을 입력해주세요.')
	return  // 반복한다. 입력을 하고 버튼을 클릭 할때 까지.
    } // if end


	// 객체 설정
	const item = document.createElement('div')
	// 문서에 요소를 만들고 변수를 넣어준다.
	const checkbox = document.createElement('input')
	// 문서에 요소를 만들고 변수를 넣어준다.
	const text = document.createElement('span')
	// 문서에 요소를 만들고 변수를 넣어준다.
	const button = document.createElement('button')
	// 문서에 요소를 만들고 변수를 넣어준다.
	
	//  함수를 선언 한다.
	const key = keyCount
	keyCount += 1
	
	// html 객체 조작
	item.setAttribute('data-key',key)
	// 요소 속성 값을 정해준다.
	item.appendChild(checkbox)
	// 요소에 checkbox 를 넣어준다.
	item.appendChild(text)
	// 요소에 text 를 넣어준다.
	item.appendChild(button)
	// 요소에 button을 넣어준다.
	todoList.appendChild(item)
	// 설정한 부모(item)을 활성화 시킨다 ?
	
	// checkbox 객체 조작
	checkbox.type = 'checkbox'
	checkbox.addEventListener('change' , (event) =>{
		item.style.textDecoration=event.target.checked ? 'line-through' : ''
	})  // 글씨에 --- 선을 그어준다. 
	
	// text 객체 조작
	text.textContent = input.value // 내용을 추가한다.
	
	// button 객체 조작 
	button.textContent = '제거하기' 
	button.addEventListener('click',() =>{
		removeTodo(key)  // let keyCount 로 제거를 한다. 
	}) 
	// ''안에 양식을 비운다
	input.value = ''
} //  addTodo end

// 문자로 객체 제거하기
const removeTodo = (key) =>{ 
	const item = document.querySelector(`[data-key="${key}"]`)
	todoList.removeChild(item)
}
// 2. 연결 이벤트
addButton.addEventListener('click' , addTodo)

input.addEventListener('keyup',(event) =>{
	const ENTER = 13              // 엔터 = 13 과 같다 ~
	if (event.keyCode === ENTER){ // ENTER 누르면 바로 함수 호출 addTodo
		addTodo()                 // 불러옴 ~
	} // if end
}) // input.addEventListener end 



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 