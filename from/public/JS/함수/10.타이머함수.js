/*
 
       p.226
       
       * 타이머함수 : 콜백함수 [ 내장함수  ]
       setTimeout( 함수 , 시간[밀리초] ) : 시간이후에 한번 함수 실행
          clearTimeout ( 함수 변수 ) : 타이머 종료 
       setInteval( 함수 , 시간[밀리초] ) : 매시간마다 함수 실행
          clearInterval  ( 함수 변수 ) : 타이머 종료 
 */
 
setTimeout( ()=>{console.log('1초 후에 실행됩니다.')} , 1*1000 )

let count = 0
let 타이머 = setInterval( () => {
	console.log(`1초 마다에 실행됩니다.${count}.`)
	count++
	if( count == 5 ){
		clearInterval(id)
	}
} , 1*1000 )