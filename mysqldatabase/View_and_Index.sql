USE practice_sql;

-- VIEW : 논리 적으로만 존재하는 읽기 전용의 가상의 테이블
-- 제한된 보기를 제공할 때, 특정 쿼리문(SELECT)을 미리작성해두는 용도

CREATE VIEW practice_sql.employee_view AS -- <- 이 이후로 보여주고 싶은 식을 입력하면 됨
SELECT 
	E.employee_number AS employee_number,
	E.name AS employee_name, 
	D.code AS department_code,
	D.name AS department_name,
	D.tel_number AS department_tel_number
FROM practice_sql.employee AS E 
LEFT JOIN practice_sql.department AS D
ON E.department_code = D.code;

SELECT * FROM practice_sql.employee_view;
SELECT * FROM practice_sql.employee_view WHERE employee_name = '홍길동';

-- VIEW는 물리적으로 데이터 복사가 되는 것이 아니고 논리적으로 결과를 불러오는 것이기 때문에 VIEW 자체로 INSERT, UPDATE, DELETE가 불가능

-- INSERT INTO practice_sql.employee_view
-- VALUES(10, '김길동', 'MM', '물류부', '010-1111-1114');

DROP VIEW practice_sql.employee_view;


-- 인덱스 (INDEX) : 테이블에서 데이터를 빠르게 조회할 수 있도록 도와주는 요소

CREATE INDEX department_index_1
ON practice_sql.department (name, tel_number);

SELECT * FROM practice_sql.department
WHERE tel_number = '010-1111-1111';

SELECT * FROM practice_sql.department
WHERE name = '인사부'
AND tel_number = '010-1111-1111';

SELECT * FROM practice_sql.department
WHERE tel_number = '010-1111-1111'
AND name = '인사부';

drop index department_index_1 on practice_sql.department;