-- CHAPTER 04. GROUPBY/HAVING 절

-- 내장함수의 종류
-- 단일행 함수 : 입력된 하나의 행당 결과가 하나씩 나오는 함수
--> 문자형함수, 숫자형함수, 날짜형함수, 변환형 함수, NULL처리함수, DECODE(함수)
-- 다중행 함수 : 여러 행을 입력을 받아 하나의 결과 값으로 출력이 되는 함수
--> 다중행 함수를 집계함수라고 부른다

-- 다중행 함수(집계함수)의 특징
-- 1. 집계함수는 NULL값을 제외하는 특징을 가지고 있다
-- 2. 집계함순는 그룹화(GROUP BY절) 가 되어 있는 상태에서만 사용이 가능하다

-- 집계함수의 종류
-- COUNT() : 지정한 데이터의 개수를 반환
-- SUM()   : 지정한 데이터의 합을 반환
-- MAX()   : 지정한 데이터 중 최대값 반환
-- MIN()   : 지정한 데이터 중 최소값 반환
-- AVG()   : 지정한 데이터의 평균값 반환


-- 직원 테이블에서 총 직원수를 조회하시오
SELECT COUNT(EMPLOYEE_ID)
  FROM EMPLOYEES
 GROUP BY();
 -- EMPLOYEES 직원 테이블 자체를 하나의 그룹으로 인식을 한 것이다
  
SELECT COUNT(DEPARTMENT_ID)
  FROM EMPLOYEES;
  
SELECT COUNT(COMMISSION_PCT)
  FROM EMPLOYEES;

-- COUNT() : 특징
-- 아스타리스크(*) 전체 조회를 사용할수가 있다
-- 다른 집계함수는 사용이 불가능

SELECT COUNT(*)
  FROM EMPLOYEES;
-- 직원테이블의 모든 직원의 수를 조회하는 쿼리문이다.  
-- NULL 값 까지 포함하여 출력을 한다.

-- 직원테이블에서 급여의 총 합계를 출력
SELECT SUM(SALARY)
  FROM EMPLOYEES;

-- 직원테이블에서 직원들의 최대 급여와 최소 급여를 출력
SELECT MAX(SALARY)
     , MIN(SALARY)
  FROM EMPLOYEES;     

-- 직원테이블에서 부서ID가 100인 직원의 평균 급여를 출력
-- 단 결과값은 소수점 1의자리까지 반올림하여 출력
SELECT ROUND(AVG(SALARY),1) AS "평균 급여"
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100;  

SELECT *
  FROM 성적표;
  
SELECT *
  FROM 수강생정보;

SELECT COUNT(학생ID)
     , 소속반
  FROM 수강생정보
 GROUP BY 소속반;

-- GROUP BY란?
-- 특정 컬럼을 기준으로 그룹화(묶음)

-- GROUP BY 절 사용 방법
-- SELECT       : 데이터를 가져올 컬럼 정보
--   FROM       : 데이터를 가져올 테이블 정보
--  WHERE       : 원하는 데이터를 선별하기 위한 조건식
--  GROUP BY    : 특정 컬럼을 기준으로 그룹화

-- SQL 작성순서
-- SELECT > FROM > WHERE > GROUP BY > HAVING > ORDER BY

-- SQL 실행순서
-- FROM > WHERE > GROUP BY > HAVING > SELECT > ORDER BY

-- GROUP BY 절을 사용할 때 유의해야할 점
-- 1. GROUP BY절을 사용하는 순간, 실제 출력되는 행의 갯수가 감소하기 때문에
-- GROUP BY절보다 늦게 실행되는 절인 SELECT,HAVING,ORDER BY절 에는 출력할 수 있는
-- 행이 제한이 걸린다

-- 2. 다만 집계함수로 처리하는 컬럼에 한에서는 사용이 가능하다.

-- 수강생정보 테이블에서 소속반 별 학생의 인원수를 조회
SELECT 소속반
     , COUNT(학생ID)
  FROM 수강생정보
 GROUP BY 소속반;

-- 성적표 테이블에서 과목별로 최고 성적과 최저 성적을 조회하시오
SELECT 과목
     , MIN(성적)
     , MAX(성적)
  FROM 성적표
 GROUP BY 과목;


-- 성적표 테이블에서 학생별로 평균 점수를 조회하시오
SELECT 학생ID
     , ROUND(AVG(성적),2)
  FROM 성적표
 GROUP BY 학생ID
 ORDER BY 학생ID;  


-- 부서별 최고 급여와 최저 급여를 출력
SELECT DEPARTMENT_ID
     , MIN(SALARY)
     , MAX(SALARY)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
 ORDER BY DEPARTMENT_ID;

SELECT * FROM 성적표;

-- 학생별 과목의 성적의 합을 구하는데, PYTHON 과목을 제외한 과목의 합만 출력
SELECT 학생ID
     , SUM(성적)
  FROM 성적표
 WHERE 과목 != 'PYTHON'
 GROUP BY 학생ID
 ORDER BY 학생ID;

-- 직업별 평균 급여를 구하는데
-- AD_PRES, IT_PROG 제외한 데이터를 조회
SELECT JOB_ID
     , AVG(SALARY)
  FROM EMPLOYEES
 WHERE JOB_ID NOT IN ('AD_PRES','IT_PROG')  
 GROUP BY JOB_ID
 ORDER BY JOB_ID;

-- HAVING 절 이란?
-- 집계가 완료된 대상을 조건을 통해 필터링 하는 문법이다

-- 5. SELECT        : 조회하고자 하는 컬럼의 정보
-- 1.   FROM        : 데이터를 가져올 테이블의 정보
-- 2.  WHERE        : 원하는 행(데이터)를 가져올 조건식
-- 3.  GROUP BY     : 특정 컬럼을 기준으로 그룹화
-- 4. HAVING        : 집계함수에 대한 조건식
-- 6.  ORDER BY     : 특정 컬럼을 기준으로 정렬

-- 학생별 평균 성적에서 평균 성적이 75 이하인 학생들만 출력
SELECT 학생ID
     , ROUND(AVG(성적),2)
  FROM 성적표
 GROUP BY 학생ID
HAVING AVG(성적) <= 75;

-- 조건이 참인 결과만 출력이 된다는 점에서 WHERE 절과 비슷하지만
-- HAVING절은 그룹화된 대상에서 집계함수에 대한 조건을 걸어줄 때 사용하는 조건절이다.

-- 수강생정보 테이블에서 반별 인원수가 3명 이상인 반만 출력
SELECT COUNT(학생ID)
     , 소속반
  FROM 수강생정보
 GROUP BY 소속반
HAVING COUNT(학생ID) >= 3;

-- 직원테이블에서 부서별 최고 연봉이 100000 이상인 부서만 출력
SELECT DEPARTMENT_ID
     , MAX(SALARY*12)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
HAVING MAX(SALARY*12) >= 100000
 ORDER BY DEPARTMENT_ID;

-- 사장님의 직업을 제외한 직업별 평균 급여를 구하고
-- 평균 급여가 10000 이상인 데이터만 출력
SELECT JOB_ID
     , AVG(SALARY)
  FROM EMPLOYEES
 WHERE JOB_ID != 'AD_PRES'
 GROUP BY JOB_ID
HAVING AVG(SALARY) >= 10000
 ORDER BY AVG(SALARY) DESC;

-- 부서별 급여의 총 합계를 구하되, 급여 총합계가 10000 이하인 부서만 출력
-- NULL이 출력이 되면 안된다.
SELECT DEPARTMENT_ID
     , SUM(SALARY)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY DEPARTMENT_ID
HAVING SUM(SALARY) <= 10000;


  
  
  
  
  
  
  
  