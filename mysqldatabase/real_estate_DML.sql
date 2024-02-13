
SELECT * FROM `user`;


-- 1. 아이디 중복 확인

-- 일반회원
SELECT user_id FROM `user` WHERE user_id = 'userID';

-- 관리자
SELECT user_id FROM `user` WHERE user_id = 'adminID';


-- 2. 이메일 인증 전송

-- 일반회원
INSERT INTO email_authentication VALUES ('email@email.com', 'QWER');

-- 관리자
INSERT INTO email_authentication VALUES ('admin@email.com', 'ASDF');


-- 3. 이메일 인증 확인

-- 일반회원
SELECT * FROM email_authentication
WHERE email = 'email@email.com' AND authentication_code = 'QWER';

-- 관리자
SELECT * FROM email_authentication
WHERE email = 'admin@email.com' AND authentication_code = 'ASDF';


-- 4. 회원가입 처리

-- 일반회원
INSERT INTO `user` (user_id, password, email)
VALUES('userID', '1q2w3e4r', 'email@email.com');

-- 관리자
INSERT INTO `user` (user_id, password, email, role)
VALUES('adminID', '1q2w3e4r', 'admin@email.com', 'ADMIN');


-- 5. 로그인 처리

-- 일반회원
SELECT user_id FROM `user`
WHERE user_id = 'userID' AND password = '1q2w3e4r';

-- 관리자
SELECT user_id FROM `user`
WHERE user_id = 'adminID' AND password = '1q2w3e4r';


-- 6. 게시물 작성
INSERT INTO qna (title, contents, writer_id)
VALUES ('질문있습니다.', '데이터는 언제 데이터인가요?', 'userID');


-- 7. 게시물 목록 보기
SELECT
    reception_number,
    reply_status,
    title,
    writer_id,
    write_datetime,
    view_count
FROM qna
ORDER BY reception_number DESC;


-- 8. 관리자로 미 완료 게시물 보기
SELECT
    reception_number,
    reply_status,
    title,
    writer_id,
    write_datetime,
    view_count
FROM qna
WHERE reply_status IS FALSE
ORDER BY reception_number DESC;


-- 9. 검색 게시물 목록 보기
SELECT
    reception_number,
    reply_status,
    title,
    writer_id,
    write_datetime,
    view_count
FROM qna
WHERE title LIKE '%질문%'
ORDER BY reception_number DESC;


-- 10. 특정 게시물 보기
-- 제목, 작성자 아이디, 작성일, 조회수, 내용, 답변 내용
SELECT
    title,
    writer_id,
    write_datetime,
    view_count,
    contents,
    reply
FROM qna
WHERE reception_number = 1;


--  11. 관리자로 답변 작성
UPDATE qna 
SET reply = '2023년 데이터입니다', reply_id = 'adminID'
WHERE reception_number = 1;


