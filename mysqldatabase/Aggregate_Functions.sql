USE practice_sql;

-- 집계 함수 : 레코드를 '그룹화'하여 하나의 결과를 반환하는 함수

-- COUNT() : 특정 조건에 맞는 행의 개수를 반환

SELECT COUNT(*)
FROM practice_sql.jeju;

SELECT COUNT(*)
FROM practice_sql.jeju
WHERE speed_80m > 3;

-- SUM() : 특정 컬럼의 값을 모두 합한 결과를 반환

SELECT SUM(speed_80m)
FROM practice_sql.jeju;

SELECT sum(speed_80m), sum(speed_70m)
FROM practice_sql.jeju
WHERE observe_date LIKE '2023-08-__';

SELECT SUM(speed_80m) / count(speed_80m)
FROM practice_sql.jeju;

-- AVG() : 특정 컬럼의 값의 평균을 반환

SELECT AVG(speed_80m)
FROM practice_sql.jeju ;

-- MAX(), MIN() : 특정 컬럼의 최대값과 최소값을 반환

SELECT MIN(speed_80m), max(speed_80m)
FROM practice_sql.jeju;