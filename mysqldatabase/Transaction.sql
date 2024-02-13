USE practice_sql;

-- Transaction : SQL로 작업하는 작업 단위

-- Transaction의 4가지 특성
-- Atomicity (원자성) : 트랜잭션은 모두 성공하거나 모두 실패해야 한다.
-- Consistency (일관성) : 트랜잭션의 작업 결과는 항상 일관성이 있어야한다. (본인입장에서)
-- Isolation (독립성) : 트랜잭션은 모두 독립적이어야 한다. (나의 작업이 다른 사람의 작업에 영향을 미치면 안된다)
-- Durablitiy (영구성) : 트랜잭션이 성공적으로 완료되면 영구히 반영되어야 한다.


-- 회원가입 : user - email_authentication
-- 사용자는 아이디를 입력하고 중복 확인을 함
-- 만약 입력한 아이디가 중복된 아이디가 아니라면 비밀번호, 비밀번호 확인, 이메일을 입력하고 이메일 인증번호 전송합니다.
-- 사용자는 이메일에 전송된 인증 번호를 확인 후 입력하여 이메일 인증을 진행함
-- 이메일 인증을 완료한 후에 회원가입 버튼을 눌러 회원가입을 마무리 한다.

CREATE TABLE practice_sql.`user`(
	id VARCHAR(100) PRIMARY KEY,
	password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE practice_sql.email_authentication(
	email VARCHAR(255) PRIMARY KEY,
    authentication_code VARCHAR(4) NOT NULL
);

-- 1. 아이디 중복확인
SELECT * FROM practice_sql.`user` WHERE id = 'iddd';

-- 사용자가 비밀번호를 '1q2w3e4r', 비밀번호 확인을 '1q2w3e4r',
-- 이메일을 'email@email.com', 서버가 생성한 코드는 'OCMD'이다.

-- 2. 이메일 인증
INSERT practice_sql.email_authentication VALUES('email@email.com', 'OCMD');

-- 서버가 지정한 이메일로 인증코드를 전송하고 사용자는 그 코드를 확인한 후 인증코드를 입력하여 인증한다.

-- 3. 이메일 인증 확인
SELECT * FROM practice_sql.email_authentication
WHERE email = 'email@email.com' AND authentication_code = 'OCMD';

-- 4. 회원가입 처리
INSERT practice_sql.user
VALUES('iddd','1q2w3e4r','email@email.com');

SHOW VARIABLES LIKE '%commit%';
SET AUTOCOMMIT = 0;

-- 트랜잭션의 시작
START TRANSACTION;

-- 1. 아이디 중복확인
SELECT * FROM practice_sql.`user` WHERE id = 'iddd3';

-- 사용자가 비밀번호를 '1q2w3e4r', 비밀번호 확인을 '1q2w3e4r',
-- 이메일을 'email@email.com', 서버가 생성한 코드는 'OCMD'이다.

-- 2. 이메일 인증
INSERT practice_sql.email_authentication VALUES('email3@email.com', 'OCMD');

-- 트랜잭션 초기상태로 변경 (트랜잭션 취소) (바로 직전에 한 작업을 취소)
ROLLBACK;

-- 트랜잭션 롤백 위치 지정
SAVEPOINT A;

-- 서버가 지정한 이메일로 인증코드를 전송하고 사용자는 그 코드를 확인한 후 인증코드를 입력하여 인증한다.

-- 3. 이메일 인증 확인
SELECT * FROM practice_sql.email_authentication
WHERE email = 'email3@email.com' AND authentication_code = 'OCMD';

-- 4. 회원가입 처리
INSERT practice_sql.user
VALUES('iddd3','1q2w3e4r','email3@email.com');

-- 특정 세이브 포인트로 롤백
ROLLBACK TO SAVEPOINT A;

-- 여기서 오토커밋이 아닌 수동상태이고 커밋 처리를 안하면 실패처리로 인해 다 날라감 

-- 트랜잭션의 성공 처리 (영구히 적용)
COMMIT;

SELECT * FROM practice_sql.user;
SELECT * FROM practice_sql.email_authentication;

-- LIMIT 개수 : 결과테이블에서 지정한 갯수만캄의 상위 데이터만 보여준다.
SELECT * FROM practice_sql.jeju LIMIT 10; -- 상위 10개만 보여줌

-- LIMIT 제외레코드개수, 개수 : 상위에서 제외 레코드 개수만큼 제외 후 개수만큼의 데이터를 보여줌
SELECT * FROM practice_sql.jeju LIMIT 10, 3; -- 상위 11번째부터 3개만 보여줌



