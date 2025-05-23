--연습

-- 각 직책 별(job_title)로 급여의 총합을 구하되 직책이 Representative 인 사람은 제외하십시오. 
-- 단, 급여 총합이 30000 초과인 직책만 나타내며, 급여 총합에 대한 오름차순으로 정렬하십시오. 
-- 출력 결과의 컬럼명은 아래 결과와 동일하게 주십시오.
SELECT J.JOB_TITLE AS JOB
     , SUM(E.SALARY) AS 급여
  FROM JOBS J JOIN EMPLOYEES E
    ON J.JOB_ID = E.JOB_ID
 WHERE J.JOB_TITLE NOT LIKE '%Representative%'
 GROUP BY J.JOB_TITLE
HAVING SUM(E.SALARY) > 30000
 ORDER BY 급여;
 
-- 각 부서 이름 별로 2005년 이전에 입사한 직원들의 인원수를 조회하시오
SELECT D.DEPARTMENT_NAME
     , COUNT(E.EMPLOYEE_ID)
  FROM EMPLOYEES E JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
 WHERE E.HIRE_DATE < '2005/01/01'
 GROUP BY D.DEPARTMENT_NAME;
 
 -- 사원수가 3명 이상의 사원을 포함하고 있는 부서의 부서번호(department_id)
 -- , 부서이름(department_name), 사원 수, 최고급여, 최저급여, 평균급여, 급여총액을 
 -- 조회하여 출력하십시오. 출력 결과는 부서에 속한 사원의 수가 많은 순서로 출력하고
 -- , 컬럼명은 아래 결과와 동일하게 출력하십시오. (평균급여 계산시 소수점 이하는 버리시오)
 
 SELECT 
   FROM EMPLOYEES E JOIN DEPARTMENTS D JOIN JOBS J
     ON (E.DEPARTMENT_ID = D.DEPARTMENTS)
     ON (E.JOB_ID = J.JOB_ID)
  GROUP BY D.DEPARTMENT_NAEM;
 
 
 
 
 
 
 