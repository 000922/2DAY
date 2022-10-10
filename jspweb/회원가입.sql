drop database if exists jspweb;
create database jspweb;
use jspweb;
create table member(
	mno			int auto_increment primary key ,	-- 회원번호[pk , autokey ]
	mid			varchar(50) ,						-- 회원 아이디
	mpassword	varchar(50) ,						
    mname		varchar(50) ,
    mphone		varchar(15) ,
    memail		varchar(100) ,
    maddress	varchar(100) ,
    mdate		datetime default now() ,	
	mpoint		int default 0
    );
    
-- default 레코드 추가시 기본으로 들어가는 값 설정
-- datetime default now() : 현재 시스템(DB)의 자동날짜

-- insert 문법
	-- 특정필드만 삽입 : insert into 테이블명
    
    
select * from member;

-- 로그인 [ 해당 테이블에 동일한 아이디와 패스워드가 존재하는 검색 ]
	-- select 
	-- select * from 테이블명 where 아이디 = ? and 비밀번호 = ?
select * from member where mid = '123' and mpassword = '456';
	-- 존재하면 레코드 1개 검색 
	-- 존재하지 않으면 레코드 x 
select * from member;