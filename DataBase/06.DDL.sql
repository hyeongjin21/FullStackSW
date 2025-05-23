-- CHAPTER 06.DDL (Data Definition Language) : 데이터 정의어

-- DDL이란?
-- 데이터 정의어로 테이블 같은 저장소 객체를 만들거나 수정합니다.

-- DDL의 명령어 종류
-- CREATE       : 테이블 같은 객체를 생성하는 명령어
-- ALTER        : 테이블 같은 객체를 변경하는 명령어
-- RENAME       : 테이블의 이름을 변경하는 명령어
-- TRUNCATE     : 테이블의 데이터를 삭제하는 명령어
-- DROP         : 테이블 같은 객체를 삭제하는 명령어


-- 테이블 생성하는 방법
-- CREATE TABLE (생성할 테이블 이름) (
-- [컬럼이름] [자료형] [제약조건]


--);

-- 학습 목표
-- HR계정에서 SCOTT 계정에 있는 EMP, DEPT테이블을 구상해보자

SELECT * FROM EMP;
SELECT * FROM DEPT;

-- 테이블의 구조를 확인해보자
-- 테이블을 드래그 선택후 SHIFT + F4 누르면 된다.

-- SCOTT계정의 DEPT 테이블을 생성해보자
CREATE TABLE DEPT (
    DEPTNO NUMBER(2,0) NOT NULL,
    DNAME VARCHAR2(14),
    LOC VARCHAR2(13)
);

-- SCOTT계정의 EMP 테이블의 구조를 확인하여
-- HR계정에서 EMP테이블을 생성하기
CREATE TABLE EMP(
    EMPNO NUMBER(4,0) NOT NULL,
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4,0),
    HIREDATE DATE,
    SAL NUMBER(7,2),
    COMM NUMBER(7,2),
    DEPTNO NUMBER(2,0)
);


-- 제약조건이란?
-- 테이블에 입력 가능한 데이터를 조건으로 제약하는 것
-- 데이터의 정확성을 유지하기 위한 목적으로 사용된다
-- 제약 조건 지정 방식에 따라서 데이터의 수정이나 삭제 여부에 영향을 준다

-- 제약조건의 종류
-- PRIMARY KEY (PK) : 기본키, NOT NULL + UNIQUE = NULL값 불가 + 중복 불가
-- UNIQUE KEY (UK)  : 고유키, NULL값 입력이 가능, 단 중복은 불가능
-- NOT NULL         : NULL값 불가능, 반드시 입력해야 되는 데이터를 설정
-- CHECK            : TRUE OR FALSE 로 평가할 수 있는 논리식을 지정, 지정한 데이터만 입력이 가능
-- FOREIGN KEY (FK) : 외래키, 테이블을 연결하는 키

-- 테이블에 제약조건을 지정 하기
-- 사용 방법
-- ALTER TABLE [테이블 명] ADD CONSTRAINT [제약조건 이름] [제약조건(컬럼명)];

-- EMP테이블에서 PK제약조건 지정하기
ALTER TABLE EMP ADD CONSTRAINT EMP_EMPNO_PK PRIMARY KEY(EMPNO);

-- EMP테이블에서 UK 제약조건 지정하기
ALTER TABLE EMP ADD CONSTRAINT EMP_JOB_UK UNIQUE(JOB);

-- EMP테이블에서 CHECK 제약조건 지정하기
ALTER TABLE EMP ADD CONSTRAINT EMP_SAL_CHECK CHECK(SAL BETWEEN 1000 AND 10000);

-- FK 제약조건 설정하기
-- 사용방법
-- ALTER TABLE [테이블 명] ADD CONSTRAINT [제약조건 이름] [제약조건(컬럼)]
-- REFERENCES [참조테이블(참조컬럼명)];

-- EMP테이블에서 FK 제약조건 지정하기

-- 1. DEPT 테이블에서 DEPTNO라는 컬럼을 PK로 지정하기
ALTER TABLE DEPT ADD CONSTRAINT DEPT_DEPTNO_PK PRIMARY KEY(DEPTNO);

-- 2. EMP테이블에서 FK 제약조건 지정
ALTER TABLE EMP ADD CONSTRAINT EMP_DEPTNO_FK FOREIGN KEY(DEPTNO) 
REFERENCES DEPT(DEPTNO);

-- 제약조건 변경하기
-- 사용방법
-- ALTER TABLE [테이블 이름] MODIFY [컬럼명] [바꿀 제약조건];

ALTER TABLE EMP MODIFY ENAME NOT NULL;

-- 제약조건 삭제하기
-- 사용방법
-- ALTER TABLE [테이블 이름] DROP CONSTRAINT [제약조건 이름];
ALTER TABLE EMP DROP CONSTRAINT EMP_JOB_UK;

-- 테이블의 컬럼 추가하기
-- EMP테이블에 PHONE_NUMBER 라는 컬럼을 추가해주기.
SELECT * FROM EMP;

-- ALTER TABLE [테이블 명] ADD [컬럼명] [자료형(크기)];
ALTER TABLE EMP ADD PHONE_NUMBER VARCHAR2(10);

-- 테이블의 컬럼 이름을 변경하기
-- ALTER TABLE [테이블 명] RENAME COLUMN [기존 컬럼명] TO [바꿀 컬럼명];
ALTER TABLE EMP RENAME COLUMN PHONE_NUMBER TO TEL;

-- 컬럼의 자료형을 변경하기
-- ALTER TABLE [테이블 명] MODIFY [컬럼명] [바꿀제약조건(길이)]
ALTER TABLE EMP MODIFY TEL VARCHAR2(30);

-- 특정 컬럼 삭제하기
-- ALTER TABLE [테이블 명] DROP COLUMN [컬럼 명];
ALTER TABLE EMP DROP COLUMN TEL;

-- 테이블의 이름 변경하기
-- RENAME [기존 테이블 이름] TO [바꿀 테이블 이름];
RENAME 수강생정보 TO STUDENT;

-- EMP 테이블의 이름을 TB_EMP 테이블 이름으로 변경
RENAME EMP TO TB_EMP;

-- DEPT 테이블의 이름을 TB_DEPT 테이블 이름으로 변경
RENAME DEPT TO TB_DEPT;

-- 테이블 복사하는 쿼리문
-- 사용방법
-- CREATE TABLE [복사할 테이블 명] AS [복사할 내용의 쿼리문];
-- 테이블이 복사가 될 때 제약조건은 복사가 되지 않는다.

SELECT * FROM EMPLOYEES;

CREATE TABLE DUMMY_EMP AS SELECT * FROM EMPLOYEES;

SELECT * FROM DUMMY_EMP;

-- TRUNCATE()   : 데이터를 영구 삭제하는 명령어
-- DELETE()     : 데이터를 삭제하는 명령어

DELETE FROM DUMMY_EMP;

SELECT * FROM DUMMY_EMP;

ROLLBACK; -- 되돌리는 명령어

-- TRUNCATE TABLE [테이블 명];

TRUNCATE TABLE DUMMY_EMP;

SELECT * FROM DUMMY_EMP;

ROLLBACK;

-- 테이블 삭제
-- DROP TABLE [테이블 명]

DROP TABLE STUDENT;
SELECT * FROM 성적표;

-- 해결방법 1. 참조되고 있는 FK가 있는 테이블을 먼저 삭제한다.
-- 해결방법 2. CASCADE CONSTRAINT 라는 옵션을 주고 제약조건까지 강제로 삭제 한다.

DROP TABLE STUDENT CASCADE CONSTRAINT;

SELECT * FROM STUDENT;














