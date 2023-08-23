--  Homework
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
        id SERIAL PRIMARY KEY ,
        name VARCHAR(255),
        updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
        );

        -- Таблиця, що встановлює зв'язок many-to-many між Schedule і Lesson
        CREATE TABLE schedule_lesson (
        schedule_id INT,
        lesson_id INT,
        FOREIGN KEY (schedule_id) REFERENCES schedule(id),
        FOREIGN KEY (lesson_id) REFERENCES lesson(id),
        PRIMARY KEY (schedule_id, lesson_id)
        );

        SELECT * FROM Homework;

        SELECT *
        FROM  lesson
        JOIN homework ON  lesson.homework_id =homework.id

        SELECT *
        FROM  chedule
        JOIN lesson ON  lesson.homework_id =homework.id


        Отримання всіх записів Homework
        Отримання всіх записів Lesson, включаючи дані Homework
        Отримання всіх записів Lesson (включаючи дані Homework) відсортовані за часом оновлення
        Отримання всіх записів Schedule, включаючи дані Lesson
        Отримання кількості Lesson для кожного Schedule


