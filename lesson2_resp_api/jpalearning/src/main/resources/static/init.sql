-- Active: 1665826483095@@127.0.0.1@3306@Blog_Spring

CREATE DATABASE Blog_Spring;

USE Blog_Spring;

CREATE TABLE
    Blog (
        b_id INT PRIMARY KEY AUTO_INCREMENT,
        b_title VARCHAR(70) NOT NULL,
        b_content TEXT NULL,
        b_desc VARCHAR(200) NULL,
        b_createDate DATE NOT NULL,
        b_editDate DATE NOT NULL,
        b_type VARCHAR(20) NULL
    );

CREATE TABLE
    User (
        u_id INT PRIMARY KEY AUTO_INCREMENT,
        u_usrname VARCHAR(30) NOT NULL,
        u_email VARCHAR(30) NULL,
        u_avatar TEXT NULL,
        u_phone VARCHAR(10) NULL
    );

-- ALTER TABLE `Blog` ADD CONSTRAINT fk_blog_user Foreign Key (b_author_id) REFERENCES User(u_id);
INSERT INTO `User` (
        u_usrname,
        u_email,
        u_phone,
        u_avatar
    )
VALUES (
        "duycodedao",
        "codedao@mail",
        "049589485",
        "/image/user/avatar/user1.png"
    );

INSERT INTO `User` ( u_usrname, u_email, u_phone, u_avatar) 
VALUES (
        "tensorblow",
        "aibangifelse@mail",
        "0238723456",
        "/image/user/avatar/user2.png"
    );

INSERT INTO `User` ( u_usrname, u_email, u_phone, u_avatar) 
VALUES (
        "hollyshit",
        "yeuemtuthuabe@yahoo",
        "0977833421",
        "/image/user/avatar/user3.png"
    );

INSERT INTO `User` ( u_usrname, u_email, u_phone, u_avatar)
VALUES (
        "hackertrunghoa",
        "hackwebbanghtml@hacker",
        "0456789034",
        "/image/user/avatar/user3.png"
    );

INSERT INTO `User` ( u_usrname, u_email, u_phone, u_avatar) 
VALUES (
        "btslaso1",
        "antisontung@anti.sky",
        "0587556432",
        "/image/user/avatar/user4.png"
    );
