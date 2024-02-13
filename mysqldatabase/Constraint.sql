USE practice_sql;

-- 제약 조건 : 데이터베이스 컬럼에 적용되는 규칙
-- 데이터의 정확성, 일관성, 무결성을 보장

-- NOT NULL 제약 조건 : 해당 컬럼에 null 값을 포함 못하도록 함
-- INSERT, UPDATE에 영향을 미친
CREATE TABLE practice_sql.not_null_table (
	null_column INT,
    not_null_column INT NOT NULL
);

-- NOT NULL 제약조건이 걸린 not_null_column에 값을 지정하지 않음
INSERT INTO practice_sql.not_null_table (null_column) VALUES(1);

-- NOT NULL이 지정된 컬럼은 INSERT시에 '반드시' null이 아닌 값이 입력되어야 함
INSERT INTO practice_sql.not_null_table (not_null_column) VALUES(1);

INSERT INTO practice_sql.not_null_table (not_null_column) VALUES(NULL);

UPDATE not_null_table
SET not_null_column = null;
-- NOT NULL이 지정된 칼럼은 UPDATA시에 null값을 지정할 수 없다.

-- UNIQUE 제약조건 :특정 컬럼에 들어오는 모든 값들을 중복없이 들어오도록 함
-- INSERT

CREATE TABLE unique_table(
	unique_column int unique,
    not_unique_column INT
);

INSERT INTO practice_sql.unique_table VALUES (1, 1);
INSERT INTO practice_sql.unique_table VALUES (1, 1);
-- uniqu로 지정된 테이블 칼럼음 INSERT시에 중복 된 데이터를 지정할 수 없음

INSERT INTO practice_sql.unique_table VALUES (2, 1);

-- UNIQE로 지정된 컬럼은 UPDATE시에 중복된 값으로 변경 할수 없음
UPDATE unique_table
SET unique_column = '3';

-- NOT NULL + UNIQUE = 후보키
-- 후보키 : 레코드를 식별하기 위한 컬럼 (중복 X, null X)

CREATE TABLE practice_sql.candidate_table(
	candidate_column INT NOT NULL UNIQUE,
    UNIQUE_column INT
);

INSERT practice_sql.candidate_table
VALUES (1, NULL);

-- PRIMARY KEY : 특정 칼럼을 기본키로 지정함
-- 기본키 : 후보키 중에 기능상 선택한 하나의 컬럼
-- 자신 테이블에서의  INSERT, UPDATE / 참조되어지는 테이블의 INSERT, UPDATE에 여향을 미침

CREATE TABLE practice_sql.primary_table(
	PRIMARY_column INT PRIMARY KEY,
    nomal_column INT
);

CREATE TABLE practice_sql.composite_table(
	-- PRIMARY1 INT PRIMARY KEY,
	-- PRIMARY2 INT PRIMARY KEY
    primary1 INT,
    primary2 INT,
    CONSTRAINT primary_key PRIMARY KEY (primary1, primary2)
);

SELECT * FROM information_schema.table_constraints;

-- PRIMARY KEY 제약 조건은 INSERT시에 NOT NULL의 조건과 UNIQUE의 조건을 만족해야함
INSERT INTO practice_sql.primary_table VALUES (NULL, NULL);
INSERT INTO practice_sql.primary_table VALUES (1, NULL);
INSERT INTO practice_sql.primary_table VALUES (1, NULL);

-- PRIMARY KEY 제약 조건은 UPDATE시에 NOT NULL 조건과 UNIQUE조건을 만족해야함
UPDATE practice_sql.primary_table SET primary_column = NULL;
UPDATE practice_sql.primary_table SET primary_column = 2;


-- FOREIGN KEY : 특정 컬럼을 다른 테이블 혹은 같은 테이블의 기본키 컬럼과 연결하는 역활

CREATE TABLE practice_sql.foreign_table (
	primary_column INT PRIMARY KEY,
    foreign_column INT,
    CONSTRAINT foreign_key FOREIGN KEY(foreign_column) REFERENCES primary_table (primary_column)
);

-- FOREIGN KEY 제약조건이 걸린 컬럼에 INSERT 작업시 참조하고 있는 테이블의 컬럼에 값이 존재하지 않으면 지정 할 수 없음
INSERT INTO practice_sql.foreign_table
VALUES(1, 1);

INSERT INTO practice_sql.foreign_table
VALUES(2, 3);

-- FOREIGN KEY 제약조건이 걸린 컬럼에 UPDATE 작업시 참조하고 있는 테이블의 컬럼에 값이 존재하지 않으면 지정 할 수 없음
UPDATE practice_sql.foreign_table SET foreign_column = 3;

-- 특정 테이블에서 기본키를 참조하고 있는 레코드가 존재한다면 해당 레코드를 삭제하지 못함
DELETE FROM practice_sql.primary_table
WHERE PRIMARY_column = 1;

DELETE FROM practice_sql.foreign_table;

-- 특정 테이블을 참조하고 있는 테이블이 존재한다면 테이블 구조를 제거할 수 없음
DROP TABLE practice_sql.primary_table;

-- 특정 테이블에서 기본키를 참조하고 있는 레코드가 존재한다면 해당 레코드를 수정하지 못함
UPDATE practice_sql.primary_table
SET PRIMARY_column = 3
WHERE PRIMARY_column = 1;

-- ON UPDATE / ON DELETE 옵션
-- ON UPDATE : 참조하고 있는 테이블의 기본키가 변경되었을경우 때 동작
-- ON DELETE : 참조하고 있는 테이블의 기본키가 삭제되었을경우 때 동작

-- CASCADE : 참조하고 있는 테이블에서 데이터를 삭제하거나 수정했을 때, 참조하는 테이블에서도 삭제와 수정이 같이 일어난다.
-- SET NULL : 참조하고 있는 테이블에서 데이터를 삭제하거나 수정했을 때, 참조하는 테이블의 해당 데이터를 NULL로 지정
-- RESTRICT : 참조하는 테이블에 참조하는 데이터가 존재한다면 수정, 삭제가 불가능(기본값)

CREATE TABLE practice_sql.optional_foreign_table(
	primary_colum INT,
    foreign_colum INT,
    FOREIGN KEY (foreign_colum)
    REFERENCES practice_sql.primary_table(primary_column)
    ON UPDATE CASCADE
    ON DELETE SET NULL
);

INSERT INTO practice_sql.primary_table VALUES (1, 1);

INSERT INTO practice_sql.optional_foreign_table VALUES (1, 1);

SELECT * FROM practice_sql.optional_foreign_table;

UPDATE practice_sql.primary_table SET primary_column = 3
WHERE primary_column = 1;

SELECT * FROM practice_sql.optional_foreign_table;

DELETE FROM practice_sql.primary_table
WHERE PRIMARY_column = 3;

SELECT * FROM practice_sql.optional_foreign_table;


-- CHECK 제약조건 : 특정 칼럼에 값을 제한함

CREATE TABLE practice_sql.check_table(
	primary_column INT PRIMARY KEY,
    check_column VARCHAR(10) CHECK(check_column IN('남', '여'))
);


INSERT INTO practice_sql.check_table
VALUES(1, '남');

-- CHECK로 지정된 컬럼은 지정 조건에 부합하지 않으면 INSERT 불가능
INSERT INTO practice_sql.check_table
VALUES(2, '남자');

-- CHECK로 지정된 컬럼은 지정 조건에 부합하지 않으면 UPDATE 불가능
UPDATE practice_sql.check_table
SET check_column = '남자';


-- DEFAULT 제약조건 : 컬럼에 데이터가 지정되지 않았을 때 사용할 기본값 지정

CREATE TABLE practice_sql.default_table(
	primary_column INT PRIMARY KEY,
    default_column VARCHAR(10) DEFAULT '기본값'
);

INSERT INTO practice_sql.default_table (primary_column) 
VALUES (1);

INSERT INTO practice_sql.default_table 
VALUES (2, NULL);

SELECT * FROM practice_sql.default_table;