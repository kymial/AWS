USE practice_sql;

CREATE TABLE practice_sql.employee (
	employee_number INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30),
    department_code VARCHAR(5)
);

CREATE TABLE practice_sql.department (
	code VARCHAR (5) PRIMARY KEY,
    name VARCHAR (10) NOT NULL,
    tel_number VARCHAR (15) NOT NULL
);

ALTER TABLE practice_sql.employee
ADD CONSTRAINT FOREIGN KEY (department_code) REFERENCES practice_sql.department (code);

INSERT INTO practice_sql.department
	VALUES('HR', '인사부', '051-111-1111');
INSERT INTO practice_sql.department
	VALUES('FI', '재무부', '051-111-1112');
INSERT INTO practice_sql.department
	VALUES('DV', '개발부', '051-111-1113');

INSERT INTO practice_sql.employee (name, department_code)
	VALUES('홍길동', null);
INSERT INTO practice_sql.employee (name, department_code)
	VALUES('김서준', null);
INSERT INTO practice_sql.employee (name, department_code)
	VALUES('이민준', 'HR');
INSERT INTO practice_sql.employee (name, department_code)
	VALUES('최지우', 'HR');
INSERT INTO practice_sql.employee (name, department_code)
	VALUES('강지호', 'FI');
INSERT INTO practice_sql.employee (name, department_code)
	VALUES('박도현', 'FI');


-- JOIN : 두 개 이상의 테이블의 특정 조건에 따라 조합하여 결과를 조회하고자 할때 사용하는 명령어

-- INNER JOIN : 두 테이블에서 조건이 일치하는 레코드만 반환
SELECT 
E.employee_number AS employee_number,
E.name AS employee_name, 
D.code AS department_code,
D.name AS department_name,
D.tel_number AS department_tel_number
FROM practice_sql.employee AS E INNER JOIN practice_sql.department AS D
ON E.department_code = D.code;

-- LEFT OUTER JOIN (LEFT JOIN) : 첫 번째 테이블의 모든 레코드와 두 번째 레코드 테이블의 조건이 일치하는 레코드를 반환, 첫 번째 테이블의 레코드에서 조건이 일치하는 값이 없으면 null로 표현
SELECT 
E.employee_number AS employee_number,
E.name AS employee_name, 
D.code AS department_code,
D.name AS department_name,
D.tel_number AS department_tel_number
FROM practice_sql.employee AS E LEFT JOIN practice_sql.department AS D
ON E.department_code = D.code;

-- RIGHT OUTER JOIN (RIGHT JOIN) : 두 번째 테이블의 모든 레코드와 첫 번째 레코드 테이블의 조건이 일치하는 레코드를 반환, 두 번째 테이블의 레코드에서 조건이 일치하는 값이 없으면 null로 표현
SELECT 
E.employee_number AS employee_number,
E.name AS employee_name, 
D.code AS department_code,
D.name AS department_name,
D.tel_number AS department_tel_number
FROM practice_sql.employee AS E RIGHT JOIN practice_sql.department AS D
ON E.department_code = D.code;

