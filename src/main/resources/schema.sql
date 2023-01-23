create table STUDENTS (
    ID BIGINT auto_increment
        primary key,
    NAME VARCHAR(32) not null
);

INSERT INTO STUDENTS (NAME) VALUES ('name1');
INSERT INTO STUDENTS (NAME) VALUES ('name2');
INSERT INTO STUDENTS (NAME) VALUES ('name3');
