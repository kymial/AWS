USE practice_sql;

ALTER TABLE practice_sql.jeju ADD above_avg_spd BOOLEAN;
ALTER TABLE practice_sql.jeju ADD above_avg_dir BOOLEAN;
ALTER TABLE practice_sql.jeju ADD null_colum1 DOUBLE;
ALTER TABLE practice_sql.jeju ADD null_colum2 DOUBLE;

UPDATE practice_sql.jeju
SET above_avg_spd = TRUE
WHERE speed_80m > 5.5;

UPDATE practice_sql.jeju
SET above_avg_spd = FALSE
WHERE speed_80m <= 5.5;


UPDATE practice_sql.jeju
SET above_avg_dir = TRUE
WHERE direction_50m > 160;

UPDATE practice_sql.jeju
SET above_avg_dir = FALSE
WHERE direction_50m <= 160;


UPDATE practice_sql.jeju
SET null_colum1 = speed_80m
WHERE speed_80m > 5.5;

UPDATE practice_sql.jeju
SET null_colum2 = direction_50m
WHERE direction_50m > 160;


-- 연산자
-- 산술연산자 : +, -, *, /, %

SELECT speed_80m + speed_76m + speed_70m + speed_35m AS total_speed
FROM practice_sql.jeju;

SELECT (speed_80m + speed_76m + speed_70m + speed_35m) / 4 AS avg_speed
FROM practice_sql.jeju;


-- 비교연산자 (WHERE절에서 자주 사용)
-- = : 좌항이 우항이 같으면 TRUE

SELECT * FROM practice_sql.jeju
WHERE observe_date = '2023-07-05';

-- <>, ! = : 좌항이 우항과 다르면 TRUE

SELECT * FROM practice_sql.jeju
WHERE observe_date <> '2023-07-05';

SELECT * FROM practice_sql.jeju
WHERE observe_date != '2023-07-05';

-- < : 좌항이 우항보다 작으면 TRUE
-- <= : 좌항이 우항보다 작거나 같으면 TRUE

SELECT * FROM practice_sql.jeju
WHERE speed_80m < 3.5;

SELECT * FROM practice_sql.jeju
WHERE speed_80m <= 3.5;

-- > : 좌항이 우항보다 크면 TRUE
-- >= : 좌항이 우항보다 크거나 같으면 TRUE

SELECT * FROM practice_sql.jeju
WHERE speed_80m > 3.5;

SELECT * FROM practice_sql.jeju
WHERE speed_80m >= 3.5;

-- <=> : 좌항과 우항이 모두 null이면 true

SELECT * FROM practice_sql.jeju
WHERE null_colum1 <=> null_colum2;

-- IS : 좌항이 우항과 같으면 TRUE (키워드)
-- IS NOT : 좌항이 우항과 다르면 TRUE (키워드)

SELECT * FROM practice_sql.jeju
WHERE above_avg_spd IS TRUE;

SELECT * FROM practice_sql.jeju
WHERE above_avg_dir IS NOT FALSE;

-- IS NULL : 좌항이 NULL 이면 TRUE
-- IS NOT NULL : 좌항이 NULL이 아니면 TRUE

SELECT * FROM practice_sql.jeju
WHERE null_colum1 IS NULL;

SELECT * FROM practice_sql.jeju
WHERE null_colum1 IS NOT NULL;

-- BETWEEN min AND max : 좌항이 min 보다 크거나 같으면서 max 보다 작거나 같으면 TRUE
-- NOT BETWEEN min AND max : 좌항이 min 보다 작거나 max 보다 크면 TRUE

SELECT * FROM practice_sql.jeju
WHERE direction_50m BETWEEN 270 AND 360;

SELECT * FROM practice_sql.jeju
WHERE direction_50m NOT BETWEEN 270 AND 360;

-- IN() : 주어진 값중에 하나라도 일치하는 값이 존재하면 TRUE
-- NOT IN() : 주어진 값 들이 모두 일치하지 않으면 TRUE

SELECT * FROM practice_sql.jeju
WHERE observe_date IN ('2023-07-01' ,'2023-08-01', '2023-09-01', '2023-10-01', '2023-11-01', '2023-12-01');

SELECT * FROM practice_sql.jeju
WHERE observe_date NOT IN ('2023-07-01' ,'2023-08-01', '2023-09-01', '2023-10-01', '2023-11-01', '2023-12-01');


-- 논리연산자
-- AND (&&) : 좌항과 우항이 모두 TRUE이면 TRUE 하나라도 틀리면 FALSE
SELECT * FROM practice_sql.jeju
WHERE speed_80m > 4 AND direction_50m < 180;

-- OR (||) : 좌항과 우항중 하나라도 TRUE이면 TRUE
SELECT * FROM practice_sql.jeju
WHERE speed_80m > 4 OR direction_50m < 180;

-- XOR : 좌항과 우항이 다르면 TRUE
SELECT * FROM practice_sql.jeju
WHERE speed_80m > 4 XOR direction_50m < 180;


-- LIKE 연산자 : 문자열을 비교할 때 패턴을 기준으로 비교

-- % : 임의의 개수 (0 ~ 무한대)의 문자
-- _ : 임의의 한 개 문자

SELECT * FROM practice_sql.jeju
WHERE observe_date LIKE '20%';

SELECT * FROM practice_sql.jeju
WHERE observe_date LIKE '%08';

SELECT * FROM practice_sql.jeju
WHERE observe_date LIKE '%08%';

SELECT * FROM practice_sql.jeju
WHERE observe_date LIKE '20_';

SELECT * FROM practice_sql.jeju
WHERE observe_date LIKE '2023-__-08';


-- 정렬
-- ORDER BY : 쿼리 결과에 기준으로 정렬
-- ASC : 오름차순 정렬
-- DESC : 내림차순 정렬

SELECT * FROM practice_sql.jeju
ORDER BY speed_80m ASC;

SELECT * FROM practice_sql.jeju
ORDER BY speed_80m DESC;

SELECT observe_date FROM practice_sql.jeju
ORDER BY speed_80m DESC;

-- SQL의 순서 
-- FROM(위치찾기) -> WHERE(조건찾기) -> GROUP BY(조건에 맞춰 묶기) -> HAVING(묶은 상태에서 조건찾기) -> SELECT(필요한게 뭔지 파악하고 보여주기) -> ORDER BY(그 필요한걸 순서 맞춰주기)

-- 2가지 연속으로 하면 첫번째부터 하고 첫번째를 묶고 나서 그 묶음 안에서 두번째를 정렬한다
-- a(1,2,1,2,3,3) b(4,6,5,5,4,6) 에서 ORDER BY a ASC, b ASC 하게 되면
-- a(1,1,2,2,3,3) b(4,5,5,6,4,6) 이런식으로 정렬 된다. 즉 a를 먼저하고 a에 대한 해답을 묶어서 b에서 정렬을 한다.


-- 중복제거
-- DISTINCT : SELECT 결과 테이블에서 컬럼의 조합의 중복을 제거하여 출력

SELECT DISTINCT above_avg_spd
FROM practice_sql.jeju;

SELECT DISTINCT above_avg_spd, above_avg_dir
FROM practice_sql.jeju;

