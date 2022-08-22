/*
 
    객체지향 프로그래밍 : 여러 개의 독립된 단위 "객체"들의 모임으로 파악하고자 하는 것.
    클래스[ 객체 설계도 ]
    객체[object] 
    객체 멤버
         1. 변수[데이터1개] , 상수[데이터1개] , 배열[object] , 함수[function]
    예)
        자동차 = 객체         붕어빵 틀 = 설계도
          핸들 = 객체           붕어빵 = 객체  
          의자 = 객체           
          엔진 = 객체 
 
 */
 /* p. 297 */
 
 // 1. 객체 선언
      /* 객체명 = { 속성1[ key : value ] ,
       속성2[ key : value ] ,
       속성3[ key : value ] ,
       메소드 : function(){}  ]
       */
       
const object = {
	name : '혼자 공부하는 파이썬' ,
	price: 18000 ,
	publisher: '한빛미디어'
} 

// 2.속성 확인 하는 방법 [ . 연산자 ]
      // 객체명.key
      // 객체명.메소드()   : 메소드 이기 때문에 매개변수(인수)
if(object.name !== undefined) {  // 만약에 객체내 name 속성이 있는지 
	// === 같다. !== 같지않다.
	console.log('name 속성이 있습니다.')
}else{
	console.log('name 속성이 없습니다.')
}
///////////////
if(object.author !== undefined) {
    console.log('author 속성이 있습니다.')
}else{
	console.log('author 속성이 없습니다.')
}
// p 293
  // 삼항(항이 3개) 연산자
    // 조건(논리) ? 참 : 거짓

object.name = object.name === undefined ? object.name : '제목 미정'
             // [ 조건 ] object.name == undefined   // name 속성이 없으면
             // [ 참 ]  ' 제목 미정'
             // [ 거짓 ] object.name // 기존 그대로 
/* *if (object.name == undefined ) {
	object.name = '제목 미정'
}else{
	object.name = object.name
}         
*/
object.author = object.author !== undefined ? object.author : '저자 미상'

// 객체 출력
console.log( object )

// p. 294
let array = [ 1 , 2 , 3 ]   
/*
let [ a , b ] = [ 1 , 2 ] /* 배열 다중 할당 */
    /*
        a = 1
        b = 2
     */
/*console.log( a )
  console.log( b ) */
//
/*[a , b] = [b , a]
console.log( a )
console.log( b )  */

 // p. 295
let arrayA = [ 1, 2, 3, 4, 5] 
const [ a , b , c ] = arrayA
console.log(a,b,c)

// p. 295
const { name,price} = object
     // object 객체내 속성 꺼내기 -> 변수에 저장
console.log( name )
console.log( price )

const { n = name, p = price} = object
console.log( name )
console.log( price )

////////////////////
let n2 = object.name       
 