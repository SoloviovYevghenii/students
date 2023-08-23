-  Homework
CREATE TABLE homework (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(255),
                          description TEXT
);

--  Lesson
CREATE TABLE lesson (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255),
                        updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        homework_id INT UNIQUE,
                        FOREIGN KEY (homework_id) REFERENCES homework(id)
);

--  Schedule
CREATE TABLE schedule (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(255),
                          updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          lesson_id INT ,
                          FOREIGN KEY (lesson_id) REFERENCES lesson(id)
);

-- Таблиця, що встановлює зв'язок many-to-many між Schedule і Lesson
CREATE TABLE schedule_lesson (
                                 schedule_id INT,
                                 lesson_id INT,
                                 FOREIGN KEY (schedule_id) REFERENCES schedule(id),
                                 FOREIGN KEY (lesson_id) REFERENCES lesson(id)
);