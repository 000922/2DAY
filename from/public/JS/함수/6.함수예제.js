/*
 
 
  기본매개변수 : 매개변수의 값이 정해져 있는 경우
           - 함수호출시 매개변수의 값이 없을때외 기본(조기)값
           - 매개변수외 값이 없을때 undefined -> 기본매개변수
 
 */
 function earnings( name , wage=8590 , hours=40 ){
	console.log(`# ${name} 님의 급여 정보`)
	console.log(`# - 시급: ${wage}원`)
	console.log(`- 근무 시간: ${hours}시간`)
	console.log(`- 급여: ${wage*hours}원`)
}
// 2. 함수호출 [ 인수 : 구름 ]
earnings('구름')
// 2. 함수호출 [ 인수 : 별 , 10000 ]
earnings('별' , 10000 )
// 2. 함수호출 [ 인수 : 인성 , 10000 , 52 ]
earnings('인성' , 10000 , 52 )