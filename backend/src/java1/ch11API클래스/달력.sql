-- 달력
drop database if exists calendar;
create database calendar;
use calendar;
create table calendar
(
	cno int auto_increment primary key,		-- 일정 식별 번호 
    cdate date not null ,
	ccomment varchar(100) not null
);
select * from calendar;