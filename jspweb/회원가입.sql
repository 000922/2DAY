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
 -- select * from 테이블명 where 아이디 ?  and 비밀번호 = ?
 
 select * from member where mid = '123' and mpassword = '456';
	-- 존재하면 레코드 1개 검색
    -- 존재하지 않으면 
select * from member;

drop table if exists category;
create table category( cno int auto_increment primary key , cname varchar(100)   );

-- 게시판 테이블 생성
drop table if exists board;
create table board(
	bno			int auto_increment primary key ,	
    btitle		varchar(1000) ,	-- 제목					
    bcontent	longtext ,		-- 내용	[ 썸머노트 이용해서 사진/영상 		
    bfile		longtext ,		-- 첨부파일
    bdate		datetime default now() , -- 작성일 
    bview		int default 0 ,			-- 죄회수 : 기본값 0
    cno			int ,			-- 카테고리 FK
    mno			int ,			-- 작성자 			
    constraint bcno_fk foreign key (cno) references category(cno) ,
   constraint bmno_fk foreign key (mno) references member(mno)
    );
    select * from board;
    
    insert into board(btitle,bcontent,mno) value( ? , ? , ? );
    
-- 1. 한개 테이블 검색 
select * from board;
-- 2. 두개 테이블 검색  [ 1번테이블 레코드수 x 2번테이블 레코드수 ]
select * from member , board;
-- 3. 조건 [ pk-fk 일치 한 경우만 표시 ]
select * from member , board where member.mno = board.mno;
-- 4. 표시할 필드 선택 
select b.bno , b.btitle , b.bcontent , b.bfile , b.bdate , b.bview , b.cno , b.mno , m.mid
from member m , board b where m.mno = b.mno;
-- 5. 모든 글출력 
select b.* , m.mid from member m , board b where m.mno = b.mno;
-- 5. 개별 글출력 
select b.* , m.mid from member m , board b where m.mno = b.mno and bno = 1; -- 게시물번호 board