

getpactive1()
// 22-10-28 생성 //
function getpactive1(){
	
	$.ajax({
	url:"/jspweb/admin/regist" ,
	data : {"type" : 1 , "option" : "pactive1" } ,
	success : function( re ){ 
		let json = JSON.parse( re )
		let html = '' ;
		console.log(json);
					json.forEach( p => {
						alert('pp')
						 html =  '<div class="item" > '+
			'			<a href="/jspweb/product/view.jsp?pno='+p.pno+'">'+
			'				<img src="/jspweb/admin/pimg/'+ p.pimg +'">'+
			'			</a>'+
			'			'+
			'			<div class="item_info"> '+
			'				<div class="item_title">'+ p.pname +'</div> '+
			'				'+
			'				<div class="item_size"> [ FREE] </div>'+
			'				'+
			'					<div class="item_price"> '+p.pprice+' </div> '+
			'					<div> <!-- 할인된 가격 , 할인율 -->'+
			'						<span class="item_sals"> '+(p.pprice-(p.pprice*p.pdiscount) ).toLocaleString()+'원  </span>'+
			'						<span class="item_discount"> '+ Math.round(p.pdiscount*100)+'%  </span>'+
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

									