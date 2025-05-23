-- DCL (Data Control Language) : 데이터 제어어

-- DCL이란
-- 데이터베이스에 접근하거나 객체에 권한을 주는 등의 역할을 하는 언어

-- DCL 명령어 종류
-- GRANT    : 권한을 부여하는 명령어
-- REVOKE   : 권한을 회수하는 명령어
-- ROLE     : 권한을 묶어서 부여할 때 사용하는 명령어

-- 시스템 권한 부여 방법
-- GRANT [시스템 권한] (필수)
-- TO [사용자] (필수)
-- [WITH ADMIN OPTION] (선택)

--> WITH ADMIN OPTION : 현재 부여받은 권한을 다른 사용자에게 부여할 수 있는 권한도
--                      함께 부여 받는것
--                      현재 사용자가 권한이 사라져도, 권한을 재부여한 다른 사용자의
--                      권한은 유지가 되는 것

-- 시스템 권한 회수
-- REVOKE [시스템 권한]
-- FROM [사용자]

-- 사용자란
-- 데이터베이스에 접속하여 데이터를 관리하는 계정을 "사용자(USER)"라고 한다

-- 사용자(USER) 생성하는 방법
-- CREATE USER [사용자 이름]
-- IDENTIFIED BY [패스워드 설정]

-- ROLE이란
-- 여러 권한을 한번에 부여하기 위해서 사용한다
-- 비슷한 종류의 권한끼리 모아 놓은 개념을 ROLE이라 하고 한번에 권한을 묶어서 부여한다

-- ROLE종류
-- CONNECT  : 데이터베이스의 접속에 필요한 권한
-- RESOURCE : 테이블, 시퀀스 등의 객체를 생성할 수 있는 권한
-- DBA      : 데이터베이스를 관리하는 대부분의 시스템 권한

-- GRANT CONNECT, RESOURCE TO [사용자];

-- 테이블을 만들어보자

CREATE TABLE TEST_TABLE(
    USER_ID NUMBER(10,0)
);

-- EMP테이블


-- DEPT테이블

-- SQL 작성 순서
-- SELECT > FROM > WHERE > GROUP BY > HAVING > ORDER BY

-- SQL 실행 순서
-- FROM > WHERE > GROUP BY > HAVING > SELECT > ORDER BY

-- 데이터베이스란?
-- 여러 사용자가 공유해서 사용할 목적으로 만들어진 특정 데이터의 집합(모음집)

-- DBMS(DataBase Managerment System)
-- 데이터베이스 안에 있는 데이터를 효율적으로 관리, 조작 하기 위해 만들어진 소프트웨어 시스템
-- DBMS의 종류에는 오라클, MySQL, MariaDB 등의 많은 종류가 있다.

-- SQL (Structured Query Language)
-- 데이터베이스에게 명령어를 내릴수 있는 유일한 표준 언어

-- QUERY 문 > SELECT 문

-- DDL(Data Definition Language) : 데이터 정의어
-- CREATE, ALTER, DROP, RENAME, TRUNCATE

-- DML(Data Manipulation Language) : 데이터 조작어
-- SELECT, INSERT, UPDATE, DELETE > 세인업데

-- TCL(Transaction Control Language) : 트랜잭션 제어어
-- COMMIT, ROLLBACK, SAVEPOINT

-- DCL(Data Controll Language) : 데이터 제어어
-- GRANT (TO), REVOKE (FROM), ROLL

-- 스키마란?
-- 데이터베이스에 저장되는 데이터의 구조와 제약조건 등을 정의한 구조
--> 테이블, 뷰, 인덱스, 시퀀스 등이 사용자의 모든 객체는 사용자의 스키마

-- 스키마는 각 계정마다 존재합니다.
-- 이름이 계정과 같다

SELECT HR.EMPLOYEES.EMPLOYEE_ID
  FROM HR.EMPLOYEES;

















