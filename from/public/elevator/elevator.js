/**
 * 
 */
$(document).ready(function(){
var elevator = $('.elevator');
var floors = $('.floor');
var f1 = $('#f1');
var people = $('.people');
var runner = $('#runner');
people.css({
 top: f1.position().top+58,
 left: f1.position().left+380
 });
elevator.css({
 top: f1.position().top+58,
 });
elevator.hover(function() {
 $(this).addClass('yellowgreen');
}, function() {
 $(this).removeClass('yellowgreen');
});
elevator.click(function(event) {
 $('div:animated').stop()
 $('div:animated').fadeOut('fast');
 $('div:animated').fadeIn('fast');
 $('div:animated').animate({param1: value1, param2: value2}, speed)
});
floors.bind({
 mouseenter : function() {$(this).addClass('brown')},
 mouseleave : function() {$(this).removeClass('brown')},
 click: function(){
 floors.removeClass('clickbrown')
 $(this).addClass('clickbrown')
 }
});
floors.each(function() {
 var pos = $(this).position();
 $(this).click(function(){ 
 if ( $(this).attr('id') === 'runner' ) {
 return;
 };
 elevator.delay(500).animate({top: pos.top+58}, 1000);
 runner.animate({left: '-=150px'}, 500);
 runner.animate({
 top: pos.top+58,
 left: pos.left+230
 }, 1000);
 runner.animate({left: '+=150px'}, 500);
 });
});
});

 
 
 
 
 
 
 
 
 