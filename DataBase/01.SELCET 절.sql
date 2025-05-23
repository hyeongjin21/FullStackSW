-- CHAPTER 01. SELECT 절

-- 글자 크기 키우기 : 도구 > 환경설정 > 코드편집기 > 글꼴 > 글자크기
-- 주석 색깔 바꾸끼 : 도구 > 환경설정 > 코드편집기 > PL/SQL주석 > 전경색

-- 주석기호

-- 주석 형태(2)

-- /**/ -> 여러줄을 한번에 주석 처리가 가능한 주석 형태이다.

-- DESC(DESCRIBE) : SQL에서 사용되는 데이터베이스 테이블의 구조를 확인하는 명령어

DESC EMPLOYEES;

/*
    1. SQL 문장에는 대소문자를 구분하지 않는다
        (데이터 베이스에 대문자로 저장됨)
    2. 띄어쓰기나 줄바꿈 또한 명령어 수행에 영향을 주지 않는다.
    3. SQL 문장 끝에는 반드시 문장의 끝을 의미하는 세미콜론(;) 을 작성해줘야 한다
    4. SQL 실행 단축키 : CTRL + ENTER, F9
*/

-- 직원 테이블에서 직원의 FIRST_NAME의 정보를 조회하곘다.
SELECT FIRST_NAME
     , LAST_NAME
     , EMAIL
     , EMPLOYEE_ID
  FROM EMPLOYEES;

-- [ SELECT 절 기본 사용 방법 ]
-- SELECT 내가 조회하고자 하는 "컬럼 이름"
-- FROM   데이터를 가져올 "테이블 정보"

DESC EMPLOYEES;

-- 직원 테이블에서 직원ID, 이름(FIRST_NAME), 급여(SALARY) 정보를 조회
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY   
  FROM EMPLOYEES;

-- 부서 테이블에서 부서ID, 부서명 정보를 조회
SELECT DEPARTMENT_ID
     , DEPARTMENT_NAME
  FROM DEPARTMENTS;
  
-- 직원 테이블에서 직원의 이름, 직원ID, 핸드폰 번호, 이메일, 부서ID의 정보를 조회
SELECT FIRST_NAME
     , EMPLOYEE_ID
     , PHONE_NUMBER
     , EMAIL
     , DEPARTMENT_ID
  FROM EMPLOYEES;     

-- 직원 테이블에서 급여, 이메일, 부서ID, 직원ID, 매니저ID, 입사 날짜 정보 출력
SELECT SALARY
     , EMAIL
     , DEPARTMENT_ID
     , EMPLOYEE_ID
     , MANAGER_ID
     , HIRE_DATE
  FROM EMPLOYEES;     

-- * (전체조회)
-- SELECT 절에 * 쓰게 되면 아스타리스크 라는 키워드로 변하게 되어 전체 조회를 가능하게 한다
-- 아스타리스크는 프로그래밍에서 특정 키워드를 의미하며 단독으로만 쓸 수 있다.

SELECT *
  FROM EMPLOYEES;

-- 부서 테이블의 모든 정보 조회
SELECT *
  FROM DEPARTMENTS;

-- 직업 테이블의 모든 정보 조회
SELECT *
  FROM JOBS;

-- 위치 테이블의 모든 정보 조회
SELECT *
  FROM LOCATIONS;

-- DISTINCT : 중복 제거해주는 키워드
SELECT DISTINCT JOB_ID
  FROM EMPLOYEES;

-- SELECT [ALL/DISTINCT] 내가 조회하고자 하는 "컬럼 정보"
--   FROM 데이터를 가져올 "테이블 정보"

-- 직원 테이블에서 부서ID를 중복 제거하여 출력
SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES;
  
-- 직원 테이블에서 입사 날짜의 컬럼의 정보를 중복 제거하여 출력
SELECT DISTINCT HIRE_DATE
  FROM EMPLOYEES;

-- TIP) 컬럼의 자료형이 숫자형이거나 날짜형인 경우 산술 연산이 가능하다
SELECT FIRST_NAME
     , SALARY
     , SALARY * 12
  FROM EMPLOYEES;

SELECT FIRST_NAME
     , HIRE_DATE
     , HIRE_DATE + 1
  FROM EMPLOYEES;

-- 컬럼에 별칭을 사용한다.
-- Alias 라고 하며 한눈에 보기 좋게 설정하는 것
-- AS 키워드를 사용하여 별칭을 지정한다

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , SALARY * 12 AS A1
  FROM EMPLOYEES;     

-- 별칭 사용 방법
-- 1. SELECT 컬럼 AS 별칭
-- 2. SELECT 컬럼 AS "별칭"
-- 3. SELECT 컬럼 별칭
-- 4. SELECT 컬럼 "별칭"
-- 5. 특수문자를 별칭에 적용시키기 위해서는 ""를 감싸줘야 한다.

-- 직원 테이블에서 직원ID, 이름, 급여, 입사날짜, 입사날짜 다음날 이라는 정보를 조회
-- 입사 날짜 다음날은 "입사일 다음날" 이라는 별칭을 사용해서 출력
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , HIRE_DATE
     , HIRE_DATE + 1 AS "입사일 다음날"
  FROM EMPLOYEES;     
  
-- ORDER BY 절
--> 특정 컬럼을 기준으로 정렬된 상태로 출력하고자 할때 사용한다.
--> SQL문에서 가장 마지막에 작성되고, 가장 마지막에 실행이 된다.
--> 별도의 정렬 방식을 지정하지 않으면 기본적으로 오름차순으로 정렬된다

-- 정렬 방식
-- ASC(Ascending) : 오름차순 정렬(1,2,3,4,5....)
-- DESC(Descending) : 내림차순 정렬(1,2,3,4,5....)

-- ORDER BY절 사용 방법
-- 2.SELECT      사용자가 조회하고자 하는 컬럼 정보
-- 1.  FROM      데이터(컬럼 정보) 를 가져올 테이블 정보
-- 3. ORDER BY   특정 컬럼을 기준으로 정렬화

-- 직원의 모든 정보를 출력
-- 단 급여 기준으로 오름차순 정렬하여 출력해보기

SELECT *
  FROM EMPLOYEES
 ORDER BY SALARY;
 
 SELECT *
   FROM EMPLOYEES
  ORDER BY SALARY DESC;
  
-- 최근에 입사한 날짜를 기준으로 직원의 이름과 급여 핸드폰번호 정보를 조회하시오

SELECT FIRST_NAME
     , SALARY
     , PHONE_NUMBER
  FROM EMPLOYEES
 ORDER BY HIRE_DATE DESC;
  
-- 직원 테이블에서 직원ID, 부서ID, 이름, 급여 순으로 출력
-- 단 부서ID는 오름차순으로, 급여는 내림차순으로 정렬 하여 출력

SELECT EMPLOYEE_ID
     , DEPARTMENT_ID
     , FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 ORDER BY DEPARTMENT_ID ASC
        , SALARY DESC;
-- 같은 부서에서 근무하고 있는 직원들에서 가장 급여를 많이 받고 있는 순서대로 조회  
  
  
-- NULL 값이란?
-- 데이터의 값이 완전히 비어있는 상태를 말한다 -> ""
-- 값이 존재하지 않거나 정해지지 않은 것을 의미한다
-- 숫자 0과 빈 문자열, 공백(" ")은 NULL 값이 아닙니다.
-- NULL은 연산하게 되면 결과값은 무조건 NULL값이 나온다. -> NULL은 산술 연산이 허용되지 않음
-- NULL값과 비교 하면 결과값은 무조건 FALSE값이 나온다. -> NULL은 비교 연산이 허용되지 않음
  
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , SALARY
     , COMMISSION_PCT
     , COMMISSION_PCT * 2 AS "보너스 조정"
  FROM EMPLOYEES;     
  
-- NULL값은 비어있는 상태 즉 존재하지 않는 값이기 떄문에
-- 비교 연산 및 산술 연산 자체가 적용이 되지 않는다
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  



