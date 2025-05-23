-- CHAPTER 03. 오라클 함수

-- 함수란?
-- 입력 값(IN PUT)을 넣어서 특정한 기능(함수)을 통해 결과 값(OUT PUT)을 출력하는 것

-- 사용자 정의 함수 : 사용자가 필요에 의해 직접 정의한 함수
-- 내장 함수 : 오라클에서 미리 만들어 놓은 함수, 필요할때 마다 호출해서 사용
-- 내장 함수의 종류는 문자형, 숫자형, 날짜형, 변환형, NULL처리 함수, 조건함수

-- 함수이름() --> 함수를 실행할때 사용하는 입력값 --> 매개변수, 인자값

-- 문자형함수
-- LOWER() : 괄호 안 문자 데이터를 모두 소문자로 변환하여 출력
-- UPPER() : 괄호 안 문자 데이터를 모두 대문자로 변환하여 출력

SELECT 'abcde123@@'
     , UPPER('abced123@@')
  FROM DUAL;
  
-- DUAL 테이블이란 테스트용 테이블이다
-- 함수의 결과값이나 임시 연산등을 확인하는 테스트용 테이블이다.

SELECT FIRST_NAME
     , EMAIL
     , UPPER(FIRST_NAME)
     , LOWER(EMAIL)
  FROM EMPLOYEES;  
  
-- LENGTH() : 괄호 안 문자 데이터의 길이를 구하는 함수

SELECT '소프트웨어융합 실무 부트캠프'
     , LENGTH('소프트웨어융합 실무 부트캠프')
  FROM DUAL;

-- 직원의 FIRST_NAME의 길이가 5 이상의 직원들의 직원ID, FIRST_NAME을 조회하시오
SELECT EMPLOYEE_ID
     , FIRST_NAME
  FROM EMPLOYEES
 WHERE LENGTH(FIRST_NAME) >= 5;
-- WHERE FIRST_NAME LIKE '_____%';

-- SUBSTR() : 문자열을 추출하는 함수
-- SUBSTR(입력값, 시작위치, 추출길이)
--> 문자열 데이터의 시작위치부터 추출 길이만큼 출력
--> 추출길이를 생략 가능 -> 생략을 하게 되면 시작위치부터 끝까지 출력이 된다

SELECT '오늘은 즐거운 월요일 입니다.'
     , SUBSTR('오늘은 즐거운 월요일 입니다.',1,2) AS "오늘"
     , SUBSTR('오늘은 즐거운 월요일 입니다.',9,3) AS "월요일"
     , SUBSTR('오늘은 즐거운 월요일 입니다.',5,3) AS "즐거운"
     , SUBSTR('주말이 빨리 왔으면 좋겠어요!',9,5) AS "으면 좋겠"
     , SUBSTR('주말이 빨리 왔으면 좋겠어요!',9)
  FROM DUAL;

-- REPLACE() : 특정 문자를 다른 문자로 바꿔주는 함수
-- REPLACE(문자열 데이터, 바꾸고 싶은 문자, 바꿔야 할 문자)
-- 마지막 매개변수인 바꿔야 할 문자를 생략가능 -> 생략할 경우 문자열 데이터에서 삭제 됨

SELECT '스마트#인재개발원'
     , REPLACE('스마트#인재개발원','#','-')
     , REPLACE('스마트#인재개발원','#')
  FROM DUAL;

-- TRIM() : 입력 받은 문자형 데이터의 양 끝의 공백을 제거하는 함수
SELECT '   스마트 인재개발원    '
     , TRIM('   스마트 인재개발원    ')
  FROM DUAL;

-- 숫자형 함수

-- ROUND() : 특정 위치에서 반올림 하는 함수
-- ROUND(반올림 할 숫자, 반올림 위치) 
-- 반올림 위치 생략이 가능 -> 생략하게 되면 첫번째 자리에서 강제로 반올림 수행

SELECT 12345.56789
     , ROUND(12345.56789,2)
     , ROUND(12345.56789)
  FROM DUAL;

-- MOD() 숫자를 나눈 나머지 값을 구하는 함수
--> 홀수, 짝수를 구분할때 사용한다
-- MOD(나눗셈 될 숫자, 나눌 숫자)

SELECT MOD(10,2)
     , MOD(10,3)
     , MOD(12,5)
     , MOD(13,6)
  FROM DUAL;

-- 날짜형 함수
-- SYSDATE : 현재 날짜와 시간을 출력해주는 함수
-- 날짜형 함수는 연산이 가능
-- 날짜형 데이터 끼리는 연산이 불가능
-- 날짜형식 세팅
-- 도구 > 환경설정 > 데이터베이스 > NLS > 날짜형식 > YYYY-MM-DD HH24:MI:SS

SELECT SYSDATE
     , SYSDATE + 1
     , SYSDATE + 30
--     , SYSDATE + SYSDATE  --> 날짜 데이터 끼리는 연산이 불가능하다
  FROM DUAL;

-- 날짜데이터를 활용하는 방법
SELECT SYSDATE AS "오늘"
     , SYSDATE + 1 AS "하루를 더함"
     , SYSDATE + 1/24 AS "1시간 더함"
     , SYSDATE + 1/24/60 AS "1분 더함"
     , SYSDATE + 1/24/60/60 AS "1초 더함"
  FROM DUAL;

-- ADD_MONTHS() : 몇개월 이후 날짜를 구하는 함수
-- ADD_MONTHS(날짜데이터, 더하거나 뺼 개월수)

SELECT ADD_MONTHS(SYSDATE,5)
  FROM DUAL;

-- 변환형 함수

-- 형변환 형태의 종류
-- 암시적 형변환 : 데이터베이스가 자동으로 형변환을 해주는 것
SELECT '100' + 50
  FROM DUAL;

-- 명시적 형변환 : 데이터 변환형 함수를 사용해서 사용자가 직접 자료형을 지정 해주는 것

-- TO_NUMBER : 문자 데이터를 숫자 데이터로 변환하는 함수
-- TO_NUMBER(문자열 데이터, 인식 될 숫자 형태)

SELECT TO_NUMBER('1,00','9,99') + 50
  FROM DUAL;

-- TO_CHAR() : 날짜, 숫자 데이터를 문자 데이터로 변환 해주는 함수
-- TO_CHAR(변환 할 데이터, 출력 형태)

SELECT FIRST_NAME, SALARY
     , TO_CHAR(SALARY,'L999,999')
  FROM EMPLOYEES;   

-- TO_DATE() : 문자 데이터를 날짜 데이터로 변환 하는 함수
-- TO_DATE(문자열 데이터, 인식 될 날짜 형태)

SELECT TO_DATE('20250407','YYYY/MM/DD')
  FROM DUAL;
  
-- NULL 처리 함수
-- NVL() / NVL2()

-- NVL(NULL인지 여부를 검사할 데이터, NULL일 경우 반환할 데이터)
-- NVL2(NULL인지 여부를 검사할 데이터, NULL이 아닐 경우 반환할 데이터, NULL일 경우 반환할 데이터)

SELECT FIRST_NAME
     , COMMISSION_PCT
     , NVL(COMMISSION_PCT,0)
     , NVL2(COMMISSION_PCT,1,0)
  FROM EMPLOYEES;     
  
-- 직원ID, FIRST_NAME, MANAGER_ID 출력
-- 매니저가 있는 직원은 "직원"
-- 매니저가 없는 직원은 "대표"

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , MANAGER_ID
     , NVL2(MANAGER_ID,'직원','대표')
  FROM EMPLOYEES;     

-- 조건함수
-- DECODE() : 상황에 따라 다른 데이터를 반환하는 함수
--> 검사대상과 비교해서 지정한 값을 반환

-- DECODE(검사대상이 될 컬럼 또는 데이터<기준>, 비교 값 
--       , 일치 시 반환할 값, 일치 하지 않을때 반환 값<마지막>)

-- 직원ID, FIRST_NAME, MANAGER_ID 출력
-- 매니저가 있는 직원은 "직원"
-- 매니저가 없는 직원은 "대표"
-- DECODE 함수를 활용하여 풀기
-- 직원ID가 101이면 전무, 직원ID가 102면 상무, 직원ID가 103이면 팀장

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , MANAGER_ID
--     , DECODE(MANAGER_ID,NULL,'대표','직원')
     , DECODE(EMPLOYEE_ID,100,'대표',101,'전무',102,'상무',103,'팀장',  '직원')
  FROM EMPLOYEES;  































