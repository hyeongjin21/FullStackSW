-- 테이블 명 : FULLSTACKMEMBER 
-- 컬럼 : ID - varchar2(50), PW - vachar2(100), name - varchar2(50),Score - number
-- ID primary Key     
CREATE TABLE FULLSTACKMEMBER (
    ID VARCHAR2(50),
--  ID VARCHAR2(50) PRIMARY KEY, 
    PW VARCHAR2(100),
    NAME VARCHAR2(50),
    SCORE NUMBER
);

ALTER TABLE FULLSTACKMEMBER ADD CONSTRAINT PK_ID PRIMARY KEY(ID);
AlTER TABLE FULLSTACKMEMBER MODIFY PW NOT NULL;

insert into FULLSTACKMEMBER values ('smhrd','1234','김형진',80);

select * from fullstackmember;