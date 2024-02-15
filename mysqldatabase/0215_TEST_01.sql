-- Active: 1706776142316@@127.0.0.1@3306

CREATE DATABASE board;

USE board;

CREATE TABLE board.user(
    email VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    nickname VARCHAR(20) NOT NULL UNIQUE,
    tel_number VARCHAR(15) NOT NULL UNIQUE,
    address TEXT NOT NULL,
    address_detail TEXT,
    profile_image TEXT,
    agreed_personal BOOLEAN NOT NULL
);

CREATE TABLE board.board(
    board_number INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    contents TEXT NOT NULL,
    write_datetime DATETIME DEFAULT now() NOT NULL,
    favorite_count INT DEFAULT 0 NOT NULL,
    comment_count INT DEFAULT 0 NOT NULL,
    view_count INT DEFAULT 0 NOT NULL,
    writer_email VARCHAR(50) NOT NULL,
    CONSTRAINT writer FOREIGN KEY (writer_email) REFERENCES board.user(email)
);

CREATE TABLE board.comment(
    comment_number INT PRIMARY KEY,
    contents TEXT NOT NULL,
    write_datetime DATETIME DEFAULT now() NOT NULL,
    user_email VARCHAR(50) NOT NULL,
    board_number INT NOT NULL,
    CONSTRAINT comment_writer Foreign Key (user_email) REFERENCES board.user(email),
    CONSTRAINT board_comment Foreign Key (board_number) REFERENCES board.board(board_number)
);

CREATE TABLE board.favorite(
    user_email VARCHAR(50),
    board_board_number INT,
    CONSTRAINT user_favorite Foreign Key (user_email) REFERENCES board.user(email),
    CONSTRAINT board_favorite Foreign Key (board_board_number) REFERENCES board.board(board_number),
    PRIMARY KEY (user_email, board_board_number)
);

CREATE TABLE board.board_image(
    sequence INT PRIMARY KEY AUTO_INCREMENT,
    board_number INT NULL,
    image_url TEXT,
    CONSTRAINT board_image Foreign Key (board_number) REFERENCES board.board(board_number)
);

CREATE TABLE board.search_log(
    sequence INT PRIMARY KEY,
    search_word TEXT NOT NULL,
    relation_word TEXT,
    relation BOOLEAN NOT NULL
);