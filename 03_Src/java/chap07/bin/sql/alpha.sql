--
-- DDL (Data Definition Language)
-- create
-- alter
-- drop
-- truncate
--

drop table alpha;

create table alpha (
	no		number,
	line	number,
	col		number,
	fg		varchar2(7),
	bg		varchar2(7),
	ch		char(1)
);


-- DDL 문 (무조건 자동 커밋. 되돌리기 불가능.. )
truncate table alpha;

-- DQL ( Data Query Language)
select * from alpha;


-- 전체 카운트
select count(*) from alpha;

-- fg 데이터만 보기
select distinct fg from alpha;

-- bg 데이터만 보기 
select distinct bg from alpha;

-- ch 데이터만 보기
select distinct ch from alpha;


-- alpha테이블에서 fg와 bg가 같은 데이터 
select *
  from alpha
 where fg=bg;

 -- select문 
 -- 전체 카운트에서 line과 column 에서의 중복을 제외한 데이터 수 확인. 
with duple as (
	select distinct line, col
  	  from alpha
)
select count(*) from duple;

select count(distinct to_char(line, '00')||to_char(col, '00'))
  from alpha;


-- 전체 카운트에서 fg와 bg 가 같은 경우(중복)를 제외한 데이터 수(count) 확인.
with duple as (
	select distinct fg, bg
  	  from alpha
)
select count(*) from duple;


-- 전체 카운트에서 ch의 중복을 제외한 데이터의 수 확인.
with duple as (
	select distinct ch
  	  from alpha
)
select count(*) from duple;




--
-- CRUD ( Create Retrive Update Delete)
-- DML ( Data Manipulation Langueage)
-- insert
-- update
-- delete
--

-- insert 문의 기본 문형.. 
insert into alpha values (1, 1, 1, 'Black', 'Red', 'A');
insert into alpha values (2, 2, 2, 'Black', 'Red', 'B');
insert into alpha values (3, 3, 3, 'Yellow', 'Blue', 'Z');



