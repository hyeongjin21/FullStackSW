-- CHAPTER 05. JOIN

-- JOIN 이란?
-- 여러 테이블에서 필요한 데이터를 한번에 가져오는 기술이다.

-- 비등가조인
--> 두개의 테이블 간에 서로 정확하게 일치하지 않는 경우 활용하는 조인
--> 등가연산자(=) 가 아닌 연산자들을 사용한 조인을 의미(>,>=,<,<=,BETWEEN)

-- 등가조인
--> 두 개의 테이블 간에 서로 정확하게 일치하는 경우 활용하는 조인
--> 등가 연산자를 활용해서 조인을 의미 (=)
--> 가장 많이 사용하는 조인의 형태

-- 등가조인의 사용 방법

-- SELECT   테이블1.컬렴명, 테이블2.컬럼명 -> 해당 테이블에 있는 컬럼을 조회하겠다
--   FROM   테이블1, 테이블2 --> 테이블1과 테이블2를 조인하겠다.
--  WHERE   테이블1.컬럼명 = 테이블2.컬럼명 -- 해당 조인 조건으로 조인하겠다.     

-- .(DOT) : 경로

-- 학생ID,학생이름, 과목, 성적 컬럼 순으로 출력해보기
SELECT 성적표.학생ID
     , 수강생정보.학생이름
     , 성적표.과목
     , 성적표.성적
  FROM 성적표 , 수강생정보
 WHERE 성적표.학생ID = 수강생정보.학생ID;

-- 1. 조인할 대상 테이블의 정보를 확인
-- 2. FROM절에 조인할 테이블을 ,(컴마)를 기준으로 작성
-- 3. 조인 조건이 되는 특정 컬럼을 확인하여, WHERE 조건절에 조인 조건을 작성
--> 조인 조건이 되는 특정 컬럼 : 조인할 테이블 간에 같은 결과 값을 가지는 컬럼
--> 조인 조건이 되는 특정 컬럼은 대부분 PK와 FK 관계로 이루어져 있다
--> 다만 다 그런것은 아니다
-- 4. SELECT 절에 출력하고자 하는 컬럼은 .(경로)를 이용하여 작성

-- 직원ID, FIRST_NAME, 부서ID, 부서명을 차례대로 출력
-- 테이블에 별칭을 사용한다.
SELECT E.EMPLOYEE_ID
     , E.FIRST_NAME
     , E.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
  FROM EMPLOYEES E,DEPARTMENTS D
 WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
 ORDER BY E.EMPLOYEE_ID;


-- 조인 시 단독으로 존재하는 컬럼은 테이블의 경로를 안적어줘도 접근이 가능하다
-- 다만 가독성을 위해 해당 테이블의 경로를 적어주는것이 좋다

-- 직원ID, 직원FIRST_NAME, 급여, 직업정보(JOB_ID), JOB_TITLE 을 순서대로 출력
-- 단 직원ID가 105인 직원에 해당하는 정보만 조회
SELECT E.EMPLOYEE_ID
     , E.FIRST_NAME
     , E.SALARY
     , E.JOB_ID
     , J.JOB_TITLE
  FROM EMPLOYEES E,JOBS J
 WHERE E.JOB_ID = J.JOB_ID
   AND E.EMPLOYEE_ID = 105;

--ANSI 조인 문법 : 미국 표준협회에서 만든 모든 DBMS에서 사용가능한 문법

-- INNER JOIN : 내부조인이라고 하며 조인 조건에서 동일한 값이 있는 행만 반환
--> 등가조인
-- INNER는 생략이 가능하다

-- INNER JOIN의 사용 방법
-- SELECT 테이블1.컬럼명, 테이블2.컬럼명
--   FROM 테이블1 (INNER) JOIN 테이블2
--     ON (테이블1.컬럼 = 테이블2.컬럼) -> 조인 조건
--  WHERE 일반 조건식 -> 그외 다른 조건

SELECT E.EMPLOYEE_ID
     , E.FIRST_NAME
     , E.SALARY
     , E.JOB_ID
     , J.JOB_TITLE
  FROM EMPLOYEES E JOIN JOBS J
    ON (E.JOB_ID = J.JOB_ID)
 WHERE E.EMPLOYEE_ID = 105;
 
 -- 부서테이블 : 부서ID,부서명,위치ID
 -- 위치테이블 : STREET_ADDRESS,CITY
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , L.STREET_ADDRESS
     , L.CITY
  FROM DEPARTMENTS D JOIN LOCATIONS L
    ON (D.LOCATION_ID = L.LOCATION_ID);

SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , L.STREET_ADDRESS
     , L.CITY
  FROM DEPARTMENTS D , LOCATIONS L
 WHERE D.LOCATION_ID = L.LOCATION_ID;

-- 조인 조건은 PK와 FK관계로 거의 이루어지지만 전부 그런것은 아니다!

-- 셀프조인 : 같은 테이블에서 의미 있는 정보를 조회하기 위해서 사용하는 조인 문법
-- 같은 테이블에서 조인하기 때문에 반드시 별칭을 사용해야 한다

-- 각 직원의 매니저 정보(이름)을 조회하고자 한다.
SELECT A.EMPLOYEE_ID
     , A.FIRST_NAME
     , B.EMPLOYEE_ID
     , B.FIRST_NAME
  FROM EMPLOYEES A JOIN EMPLOYEES B
    ON (A.MANAGER_ID = B.EMPLOYEE_ID)
 ORDER BY A.EMPLOYEE_ID;

-- 같은 값을 가지는 의미있는 컬럼이면 조인 조건에 충족한다
-- 반드시 PK 와 FK 관계로 조인 조건이 이루어지는것은 아니다


-- 부서명ID, 부서명, 매니저ID, FIRST_NAME
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , D.MANAGER_ID
     , E.FIRST_NAME
  FROM DEPARTMENTS D JOIN EMPLOYEES E
    ON (D.MANAGER_ID = E.EMPLOYEE_ID)
 ORDER BY D.DEPARTMENT_ID;
 
-- CROSS JOIN : 조인 조건을 적지 않고 테이블의 모든 데이터를 가져오는 방법
-- 카티션 곱이라는 현상이 발생
-- 카티션 곱 : 모든데이터의 조합 > 모든 경우의 수가 출력

SELECT *
  FROM EMPLOYEES,DEPARTMENTS;

-- 조인조건이 없는 경우 생길수 있는 모든 경우의 수가 출력이 된다
-- EMPLOYEES(107) X DEPARTMENTS(27) = 2889의 행이 출력이 된것

-- 직원ID, FIRST_NAME, SALARY, JOB_ID

-- 오라클 조인 방법
SELECT E.EMPLOYEE_ID
     , E.FIRST_NAME
     , E.SALARY
     , E.JOB_ID
     , J.JOB_TITLE
  FROM EMPLOYEES E, JOBS J
 WHERE E.JOB_ID = J.JOB_ID
 ORDER BY E.EMPLOYEE_ID ;
 
 -- ANSI조인 문법으로 풀어보자
SELECT E.EMPLOYEE_ID
     , E.FIRST_NAME
     , E.SALARY
     , E.JOB_ID
     , J.JOB_TITLE
  FROM EMPLOYEES E JOIN JOBS J
    ON (E.JOB_ID = J.JOB_ID)
 ORDER BY E.EMPLOYEE_ID;

-- 부서명ID, 부서명, 매니저ID, FIRST_NAME
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , D.MANAGER_ID
     , E.FIRST_NAME
  FROM DEPARTMENTS D JOIN EMPLOYEES E
    ON (D.MANAGER_ID = E.EMPLOYEE_ID)
 ORDER BY D.DEPARTMENT_ID DESC;
 
-- OUTER JOIN : 외부조인이라고 하며, 두개의 테이블간의 교집합을 조회하고
-- 한쪽 테이블에만 있는 데이터도 포함시켜서 조회하고 싶을때 사용하는 조인 문법
--> 한쪽 데이터의 NULL값도 출력하고 싶을때 사용

-- LEFT OUTER JOIN : 왼쪽 테이블을 기준으로 NULL값도 포함하여 출력
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , D.MANAGER_ID
     , E.FIRST_NAME
  FROM DEPARTMENTS D LEFT OUTER JOIN EMPLOYEES E
    ON (D.MANAGER_ID = E.EMPLOYEE_ID)
 ORDER BY D.DEPARTMENT_ID ;
 
-- 오라클문법에서 LEFT OUTER JOIN 적용하는 방법
-- 오라클문법 조인시 : 조인 조건절에 반대인 오른쪽 컬럼에 (+) 기호를 작성한다.

SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , D.MANAGER_ID
     , E.FIRST_NAME
  FROM DEPARTMENTS D , EMPLOYEES E
 WHERE D.MANAGER_ID = E.EMPLOYEE_ID(+)
 ORDER BY D.DEPARTMENT_ID ;
 

-- RIGHT OUTER JOIN : 오른쪽 테이블을 기준으로 NULL값도 포함하여 출력
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , D.MANAGER_ID
     , E.FIRST_NAME
  FROM DEPARTMENTS D RIGHT OUTER JOIN EMPLOYEES E
    ON (D.MANAGER_ID = E.EMPLOYEE_ID)
 ORDER BY D.DEPARTMENT_ID ;
 
-- 오라클 문법에서 RIGHT OUTER JOIN 적용 방법
--> 오라클 문법 조인시 : 조인 조건절에 반대인 왼쪽 컬럼에 (+)기호를 작성
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , D.MANAGER_ID
     , E.FIRST_NAME
  FROM DEPARTMENTS D , EMPLOYEES E
 WHERE D.MANAGER_ID(+) = E.EMPLOYEE_ID
 ORDER BY D.DEPARTMENT_ID ;

-- FULL OUTER JOIN : 양쪽의 NULL값도 포함하여 출력
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , D.MANAGER_ID
     , E.FIRST_NAME
  FROM DEPARTMENTS D FULL OUTER JOIN EMPLOYEES E
    ON (D.MANAGER_ID = E.EMPLOYEE_ID)
 ORDER BY D.DEPARTMENT_ID;

-- 오라클 문법에서 FULL OUTER JOIN 적용하는 방법
-- 오라클 문법에서 FULL OUTER JOIN을 지원하지 않는다
-- LEFT OUTER JOIN과 RIGHT OUTER JOIN을 UNION 연산자로 
-- 연결하여 FULL OUTER JOIN을 출력하는 방법도 있다,


























