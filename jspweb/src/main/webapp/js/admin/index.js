

getpactive1()
// 22-10-28 생성 //
function getpactive1(){
	
	$.ajax({
	url:"/jspweb/admin/regist" ,
	data : {"type" : 1 , "option" : "pactive1" } ,
	success : function( re ){ 
		let json = JSON.parse( re )
		let html = '' ;
					json.forEach( p => {
						alert('pp')
						 html =  '<div class="item" > '+
			'			<a href="/jspweb/product/view.jsp?pno='+p.pno+'">'+
			'				<img alt="" src="/jspweb/img/c1.jpg/"> '+
			'			</a>'+
			'			'+
			'			<div class="item_info"> '+
			'				<div class="item_title">남성 엠보스드 트렁크</div> '+
			'				'+
			'				<div class="item_size"> [ FREE] </div>'+
			'				'+
			'					<div class="item_price"> 50,000원 </div> '+
			'					<div> <!-- 할인된 가격 , 할인율 -->'+
			'						<span class="item_sals"> 30,000원 </span>'+
			'						<span class="item_discount"> 20% </span>'+
			'					</div>'+
			'					<div class="item_review"> 찜 90 리뷰수 400 </div> '+
			'			</div>'+
			'			<div> '+
			'				<span class="badge rounded-pill text-bg-warning">주문폭주</span>'+
			'				<span class="badge rounded-pill text-bg-primary"> 1+1 </span>'+
			'			</div>'+
			'		</div>';
				
				
			})
			document.querySelector('.itemlist').innerHTML += html;
		}
		
	}) // ajax end
/*======================================================================================*/

	
} // function end

									