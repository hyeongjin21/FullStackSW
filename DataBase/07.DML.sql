-- CHAPTER 07. DML (Data Manipulation Language) : 데이터 조작어

-- DML이란
-- 데이터 조작어 로 테이블에 데이터를 조회, 추가, 수정, 삭제 할때 사용하는 질의어 이다.
-- 테이블에서 원하는 데이터를 입력, 수정, 삭제 한다.

-- DML의 유형
-- SELECT : 데이터 조회
-- INSERT : 데이터 추가
-- UPDATE : 데이터 수정
-- DELETE : 데이터 삭제

-- 테이블에 데이터를 추가하는 방법
-- INSERT INTO [테이블 명] (컬럼 LIST)
-- VALUES (컬럼 LIST에 들어갈 실제 값);
-- ** INSERT INTO에 입력한 컬럼과 VALUES에 입력한 실제 값은 순서와 자료형이 매칭이 되어야 한다.
-- ** INSERT INTO에 컬럼 리스트 생략 가능
--> 생략시 VALUES에는 해당 테이블의 컬럼 순서와 자료형을 모두 맞춰서 작성을 해줘야 한다.

-- SCOTT 계정의 DEPT 테이블의 내용을 HR계정에 DEPT 테이블에 추가하기
SELECT * FROM TB_DEPT;

SELECT * FROM DEPT;

INSERT INTO TB_DEPT(DEPTNO, DNAME, LOC)
VALUES (10, 'ACCOUNTING', 'NEW YORK');

INSERT INTO TB_DEPT(DEPTNO, DNAME, LOC)
VALUES (20,'RESEARCH','DALLAS');

INSERT INTO TB_DEPT(DEPTNO, DNAME, LOC)
VALUES (30,'SALES','CHICAGO');

INSERT INTO TB_DEPT(DEPTNO, DNAME, LOC)
VALUES (40,'OPERATIONS','BOSTON');

SELECT * FROM TB_DEPT;

-- 문제1) SCOTT 계정의 EMP테이블에 이름이 'ALLEN'에 해당하는 모든 정보를
-- HR 계정의 TB_EMP 테이블에 데이터를 추가하기
-- HIREDATE 는 날짜형 자료형 > SYSDATE

SELECT *
  FROM EMP
 WHERE ENAME = 'ALLEN';

INSERT INTO TB_EMP
VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20 00:00:00',1600,300,30);

INSERT INTO TB_EMP
VALUES (8000,'ALLEN','SALESMAN',7698,SYSDATE ,1600,300,30);

SELECT * FROM TB_EMP;

-- SQL에서 부모와 자식 테이블 관계

-- 부모 테이블과 자식 테이블 은 외래키(FOREIGN KEY) 관계를 통해 연결되어 있는 테이블을 의미한다

-- 부모 테이블
-- 다른 테이블에 참조하는 기존 테이블
-- 기본키(PK)를 가지고 있는 테이블
-- 자식 테이블이 이 테이블의 키를 외래 키로 참조한다.

-- 자식 테이블
-- 부모 테이블의 키를 외래키로 참조하는 테이블

SELECT * FROM TB_EMP; -- 자식테이블
SELECT * FROM TB_DEPT;  -- 부모테이블

SELECT * FROM EMP;

-- SCOTT 계정의 EMPNO가 7566인 직원의 정보를 
-- HR계정의 TB_EMP 테이블에 데이터 추가하기

SELECT * 
  FROM EMP
 WHERE EMPNO = 7566;

INSERT INTO TB_EMP
VALUES (7566,'JONES','MANAGER',7839,SYSDATE,2975,NULL,20);

-- NULL을 입력하는 방법
-- NULL, '' 
-- ' ' --> NULL값이 아니라 공백이라는 특수문자가 입력이된다

SELECT * FROM TB_EMP;

-- 문제 ) SCOTT 계정에서 EMPNO가 7839인 직원의 모든 정보를
-- HR 계정의 TB_EMP 테이블에 데이터를 추가하기
-- NULL 값을 '' 으로 넣어보기

SELECT *
  FROM EMP
 WHERE EMPNO = 7839;
 
INSERT INTO TB_EMP
VALUES (7839,'KING','PRESIDENT','',SYSDATE,5000,'',10);

SELECT * FROM TB_EMP;

-- 숙제) SCOTT 계정에서 EMPNO가 7369인 직원의 모든 정보를
-- HR계정의 TB_EMP 테이블에 데이터를 추가하기
-- 에러를 발생 > 제약조건 삭제를 해야 함
SELECT * FROM EMP WHERE EMPNO = 7369;

ALTER TABLE TB_EMP DROP CONSTRAINT EMP_SAL_CHECK;

INSERT INTO TB_EMP
VALUES (7369,'SMITH','CLERK',7902,SYSDATE,800,'',20);

SELECT * FROM TB_EMP;

COMMIT; -- 영구 저장하는 명령어

-- UPDATE : 테이블의 데이터를 변경하고 싶을때 사용
-- UPDATE [테이블명]
-- SET [변경할 컬럼 = 변경할 값]
-- WEHRE [데이터를 변경할 대상 행을 선별하기 위한 "조건식"]
-- **WHERE절을 생략 가능하다 > 생략 할 경우 테이블 내 저장된 모든 컬럼의 데이터가 변경이된다

-- ENAME이 SMITH 직원의 급여를 1000으로 인상, 보너스를 100으로 책정
UPDATE TB_EMP
   SET SAL =1000,COMM =100
 WHERE ENAME = 'SMITH';

-- UPDATE, DELETE 등 DML을 조작할때 조건문에 조건은 PK로 하는것이 좋다.

SELECT * FROM TB_EMP;
ROLLBACK;

-- KING의 JOB을 CEO로 변경해주고, 급여는 7000으로 인상, 보너스를 500으로 책정
UPDATE TB_EMP
   SET SAL = 7000, JOB = 'CEO', COMM = 500
 WHERE EMPNO = 7839;

-- DELETE : 데이터를 삭제 할때 사용하는 명령어
-- DELETE FROM [테이블 명]
--  WHERE [삭제할 대상 행을 선별하기 위한 '조건식']

-- ENAME 이 'JONES'인 직원의 정보를 삭제하기
DELETE FROM TB_EMP
 WHERE ENAME = 'JONES';

SELECT * FROM TB_EMP;

-- VIEW 란?
-- 하나 이상의 테이블에서 여러 정보를 토대로 만들어지는 가상의 테이블

-- 사용목적
-- 편리성  : 자주 사용하는 SELECT 문장을 저장하기 위해
-- 보안성  : 테이블의 특정 데이터를 노출시키지 않기 위해

-- VIEW 생성 방법
-- CREATE VIEW [뷰 이름]
-- AS [저장할 SELECT 문]

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, JOB_ID, SALARY, PHONE_NUMBER
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 100;
 
-- 스티븐의 정보를 가상 테이블로 만들어서 조회를 해보자
CREATE VIEW EMP_100
AS (SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, JOB_ID, SALARY, PHONE_NUMBER
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 100);

SELECT * FROM EMP_100;
