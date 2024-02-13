use qatar_asian_cup;

-- 참가국에 데이터 삽입
-- 1. 대한민국, E조, 위르겐 클리스만, 23
-- 2. 요르단, E조, 후세인 아모타, 87

INSERT INTO qatar_asian_cup.country
VALUES('대한민국','E','위르겐 클리스만', 23);

INSERT INTO qatar_asian_cup.country
VALUES('요르단','E','후세인 아모타', 87);

SELECT * FROM qatar_asian_cup.country;

-- 경기장에 데이터 삽입
-- 1. 아흐메드 빈 알리, 45032, 카타르 알라이얀

INSERT INTO qatar_asian_cup.stadium
VALUES('아흐메드 빈 알리', 45032, '카타르 알라이얀');

SELECT * FROM qatar_asian_cup.stadium;

-- 선수에 데이터 삽입
-- 1. 손흥민, 34, MF, 토트넘 훗스퍼, 7, 대한민국
-- 2. 올완, 24, FW, 알 샤말 SC, 9 , 요르단

INSERT INTO qatar_asian_cup.player
VALUES('손흥민', 34, 'MF', '토트넘 훗스퍼', 7, '대한민국');

INSERT INTO qatar_asian_cup.player
VALUES('올완', 24, 'FW', '알 샤말 SC', 9 , '요르단');

SELECT * FROM qatar_asian_cup.player;

-- 경기에 데이터 삽입
-- 		경기일정				나라1   나라2    스타디움
-- 1. 2024-02-07 00:00:00, 요르단, 대한민국, 아흐메드 빈 알리, 

INSERT INTO qatar_asian_cup.game(schedule, country1, country2, stadium)
VALUES('2024-02-07 00:00:00', '요르단', '대한민국', '아흐메드 빈 알리');

SELECT * FROM qatar_asian_cup.game; 

