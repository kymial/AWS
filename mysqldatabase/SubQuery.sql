USE practice_sql;

-- 서브쿼리 : 쿼리 내부에 위치하는 또 다른 쿼리, 쿼리결과를 조건이나 테이블로 사용 할 수 있도록 함

-- WHERE 절에서 서브쿼리 : 쿼리 결과를 조건으로 사용하여 조건을 동적으로 지정
-- WHERE 절에서 비교 연산으로 사용될 때 조회하는 컬럼의 개수 및 레코드 개수 주의

SELECT *
FROM practice_sql.employee
WHERE department_code = (
	SELECT code FROM practice_sql.department WHERE name = '인사부'
    );

-- FROM 절에서 서브쿼리 : 쿼리 결과 테이블 다시 FROM 절에 사용하여 복합적인 테이블 조회

SELECT *
FROM (
		SELECT name AS employee_name, department_code
        FROM practice_sql.employee
        WHERE department_code IS NULL
	) AS SQ
WHERE employee_name = '홍길동';

-- 부서 이름이 '개발부'인 사원이름, 부서코드, 부서명을 조회
-- 부서명을 잧을려면 2가지의 서브쿼리가 필요하다. 하지만 서브쿼리는 하나만 된다.
-- 즉 이너조이를 사용해야함

-- 부서 이름이 "개발부"인 사원이름, 부서코드를 조회 
-- 여기는 부서코드만 찾아야해서 서브쿼리가 맞다.
SELECT name, department_code
FROM practice_sql.employee
WHERE department_code = (
	SELECT code
	FROM practice_sql.department
	WHERE name = '개발부'
						);
                        
