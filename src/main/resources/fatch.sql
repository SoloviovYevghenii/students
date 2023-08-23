-
SELECT * FROM homework;

SELECT *
FROM  lesson
JOIN homework ON  lesson.homework_id =homework.id;

SELECT *
FROM  lesson
JOIN homework ON  lesson.homework_id =homework.id
ORDER BY lesson.updatedAt asc ;

SELECT *
FROM  schedule
JOIN  lesson ON  schedule.lesson_id =  lesson.id;

SELECT COUNT(sl.lesson_id) AS lesson_count
FROM schedule s
LEFT JOIN schedule_lesson sl ON s.id = sl.schedule_id
GROUP BY s.id, s.name;