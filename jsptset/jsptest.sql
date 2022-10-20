drop database if exists jsptest;
create database jsptest;
use jsptest;
drop table if exists board;
create table board(
	bno			int auto_increment ,
	btitle		varchar(100),
	bcontent	varchar(100),
	bwrite		varchar(100),
    bpassword	varchar(100),
    bdate		datetime default now(),
    bview		int default 0 ,
    constraint bno_pk primary key(bno)
);
select * from board;