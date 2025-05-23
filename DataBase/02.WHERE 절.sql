-- CHAPTER 02. WHERE 절

-- WHERE 절 기본 사용 방법
-- 3. SELECT  사용자가 조회하고자 하는 컬럼 정보
-- 1.   FROM  데이터(컬럼의 정보) 를 가져올 테이블의 정보
-- 2.  WHERE  원하는 데이터(행)을 가져오기 위한 조건식

-- 산술 연산자( +,-,*,/)

SELECT FIRST_NAME
     , SALARY * 12
  FROM EMPLOYEES;
  
-- 비교 연산자
-- =  : 같다
-- >  : 보다 크다 (초과)
-- >= : 보다 크거나 같다 (이상)
-- <  : 보다 작다 (미만)
-- <= : 보다 작거나 같다 (이하)

-- 직원 ID가 120에 해당하는 직원의 정보 조회
SELECT *
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 120;

-- 급여가 9000을 받고 있는 직원의 이름, 직원ID, 부서ID, 이메일 정보를 조회
SELECT FIRST_NAME
     , EMPLOYEE_ID
     , DEPARTMENT_ID
     , EMAIL
  FROM EMPLOYEES
 WHERE SALARY = 9000;

-- 부서ID가 90에 해당하는 직원들의 모든 정보를 조회
SELECT *
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 90;

-- 매니저ID가 100인 부서이름과 부서ID를 조회
SELECT DEPARTMENT_NAME
     , DEPARTMENT_ID
  FROM DEPARTMENTS
 WHERE MANAGER_ID = 100;
 
-- LOCATION_ID가 2000인 CITY 정보를 조회
SELECT *
  FROM LOCATIONS
 WHERE LOCATION_ID = 2000;

-- 급여가 5000 이하로 받고있는 직원의 이름, 급여 정보 조회
SELECT FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY <= 5000;  

-- 연봉이 120000 이상인 직원의 이름, 급여, 직업 정보를 조회
SELECT FIRST_NAME
     , SALARY
     , JOB_ID
  FROM EMPLOYEES
 WHERE SALARY * 12 >= 120000;  

DESC EMPLOYEES;

-- SQL에서 사용하는 자료형
-- VARCHAR2(N) 
-- N크기만큼 입력 받을 수 있는 가변형 문자형
-- 표현 형태는 ''(작은 따옴표)

-- NUMBER(p,s)
-- P자리만큼 입력 받고 S자리만큼 소수를 입력받는다
-- EX) NUMBER(3) -> 999까지 입력 가능
--     NUMBER(3,1) -> 99.9
-- NUMBER형 자료형은 실수와 정수 모두 표현이 가능하다
-- 실무에서는 ()를 생략하는 것을 많이한다 -> 최대크기인 38크기가 들어간다

-- DATE
-- 날짜 값을 입력받을 수 있는 날짜형 자료형
-- 밀리초까지 입력가능한 TIMESTAMP 라는 자료형도 있다

-- IT_PROG에 해당하는 직원들의 수는 총 몇명인가 5
SELECT *
  FROM EMPLOYEES
 WHERE JOB_ID = 'IT_PROG';

-- ST_MAN에 해당하는 직원의 수는 총 몇명인가 5
SELECT *
  FROM EMPLOYEES
 WHERE JOB_ID = 'ST_MAN';
 
 -- 부정 비교 연산자
 -- !=, <>, ^= : 같지 않다
 -- 논리 비교 연산자
 -- NOT A = B
 
 -- AD_PRES를 제외한 모든 직원의 정보 출력
 SELECT *
   FROM EMPLOYEES
  WHERE JOB_ID != 'AD_PRES';
  
-- 사장님이 상사가 아닌 직원은 총 몇명일까요? 92
SELECT *
  FROM EMPLOYEES
 WHERE MANAGER_ID != 100;
 

-- 논리연산자 : 조건과 조건을 이어주는 연산자

-- AND : 조건을 모두 만족하는 경우 TRUE 값을 반환
-- OR  : 하나의 조건이라도 만족하는 경우 TRUE 값을 반환

-- 연산자의 우선순위
-- AND > OR
--> AND연산자가 기본적으로 OR연산자보다 우선순위가 높기 떄문에 논리 연산자 사용시 주의가 필요하다

-- 직원의 이름, 부서ID, 직원ID, 급여의 정보를 조회
-- 단 조건은 부서가 50이거나 90에 소속된 직원 중에서 급여는 7000이상을 받는
-- 직원의 정보만 조회

SELECT FIRST_NAME
     , DEPARTMENT_ID
     , EMPLOYEE_ID
     , SALARY
  FROM  EMPLOYEES
 WHERE SALARY >= 7000
   AND (DEPARTMENT_ID = 50 OR DEPARTMENT_ID = 90);
     
-- 부서가 90이고 급여가 5000 이상 받고 있는 직원의 직원ID, 이름, 부서ID, 급여 정보를 조회
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , DEPARTMENT_ID
     , SALARY
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 90
   AND SALARY >= 5000;
     
-- 부서가 100이거나 입사일이 '06/06/02' 일 이후에 입사한 직원의 이름과 입사일 정보 조회

SELECT FIRST_NAME
     , HIRE_DATE
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100
    OR HIRE_DATE > '06/06/02';

-- 부서가 100이거나 90인 직원 중에서 직원ID가 101인 직원의 이름,연봉의 정보를 조회하시오
-- 단 연봉은 S_1 이라는 별칭을 아용해서 입력하시오

SELECT FIRST_NAME
     , SALARY * 12 AS "S_1"
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 101
   AND (DEPARTMENT_ID = 100 OR DEPARTMENT_ID = 90);
   
-- SQL 연산자
-- SQL에서만 사용할 수 있는 연산자다.
-- NULL 연산자, IN연산자, BETWEEN연사자, LIKE연산자 가 있다.

-- NULL 연사자

SELECT FIRST_NAME
     , COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT = NULL;
 
-- IS NULL      : 데이터 값이 NULL인 값을 조회해주는 연산자.
-- IS NOT NULL  : 데이터 값이 NULL이 아닌 값을 조회해주는 연산자.

-- 직원중에서 보너스를 받고 있는 직원의 이름과, 부서정보, 급여정보, 보너스 정보를 조회

SELECT FIRST_NAME
     , DEPARTMENT_ID
     , SALARY
     , COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL;
 
-- 부서에 속해있지 않은 직원의 이름은?
-- Kimberely
SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NULL;  
 
-- NULL연산자를 활용해서 사장님의 전화번호를 출력
-- 515.123.4567
SELECT PHONE_NUMBER
  FROM EMPLOYEES
 WHERE MANAGER_ID IS NULL;

-- IN연산자
-- 특정 컬럼에 포함된 데이터를 여러 개 조회하고 자 할때 사용하는 연산자

-- 부서가 30, 50, 90 에 소속된 직원의 이름과 부서ID를 조회
SELECT FIRST_NAME
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 30
    OR DEPARTMENT_ID = 50
    OR DEPARTMENT_ID = 90
 ORDER BY DEPARTMENT_ID DESC;

-- IN 연산자를 활용
SELECT FIRST_NAME
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IN (30,50,90);  

-- IN 연산자를 활용
-- 직업이 'IT_PROG', 'ST_MAN'에 해당하는 직원의 이름과 급여 정보를 조회
SELECT FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE JOB_ID IN ('IT_PROG', 'ST_MAN');

-- 이메일 정보가 'DLEE','KGEE', 'SANDE' 에 해당하는 직원의 이름과 전화번호 정보 조회
SELECT FIRST_NAME
     , PHONE_NUMBER
  FROM EMPLOYEES
 WHERE EMAIL IN ('DLEE','KGEE','SANDE');

-- BETWEEN 연산자
-- 일정 범위 내의 데이터를 조회할때 사용하는 연산자
-- BETWEEN A AND B : A(최소값), B(최대값)
--> 특정 열 값의 최소, 최고 범위를 지정하여 해당 범위 내의 데이터만 조회
--> 최소값 이상 최대값 이하

-- 급여가 10000 이상 20000 이하의 범위내에서 받고 있는 직원의 이름, 급여 조회
SELECT FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY >= 10000
   AND SALARY <= 20000;

SELECT FIRST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY BETWEEN 10000 AND 20000;  

-- 2005년에 입사한 직원은 총 몇명일까요?
-- 단 BETWEEN 연산자를 활용하여 SQL문 작성
-- 29명
SELECT FIRST_NAME
     , HIRE_DATE
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN '05/01/01' AND '05/12/31';

-- LIKE 연산자
--> 일부 문자열이 포함된 데이터를 조회할떄 사용
-- %,_ 라는 와일드 카드를 이용해서 매칭 연산을 진행합니다

-- % : 길이와 상관없이 모든 데이터를 의미
-- _ : 어떤 값이든 상관없이 한개의 문자 데이터를 의미

-- 직원의 이름 중에 S로 시작하고 n으로 끝나는 직원의 first_name찾기
SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE 'S%n';  

-- 핸드폰 번호가 650으로 시작하는 핸드폰 번호 조회
SELECT FIRST_NAME
     , PHONE_NUMBER
  FROM EMPLOYEES
 WHERE PHONE_NUMBER LIKE '650%';  

-- FIRST_NAME이 it으로 끝나고 총 4글자인 FIRST_NAME찾기
SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE '__it';  

-- FIRST_NAME이 두번째 글자가 e인 직원의 first_name찾기
SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE '_e%';








