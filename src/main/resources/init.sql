CREATE TABLE homeworks
(
    id SERIAL PRIMARY key,
    name   varchar,
    description varchar
);
CREATE SEQUENCE homeworks_id_seq OWNED BY homeworks.id;



create table lesson
(
    id SERIAL PRIMARY key,
    name  varchar,
    updatedAt   varchar,
    homework_id int,
    CONSTRAINT fk_homeworks
        FOREIGN KEY (homework_id)
            REFERENCES homeworks (id)
);
CREATE SEQUENCE lesson_id_seq OWNED BY lesson.id;


create table schedule
(
    id  SERIAL PRIMARY key,
    name  varchar(50),
    updatedAt varchar,
    lessons   int,
    CONSTRAINT fk_lesson
        FOREIGN KEY (lessons)
            REFERENCES lesson (id)

);
CREATE SEQUENCE lesson_id_seq OWNED BY lesson.id;