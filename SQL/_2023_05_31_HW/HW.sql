-- Создание таблицы Students
CREATE TABLE Students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(128) NOT NULL,
  age INT
);

-- Заполнение таблицы Students
INSERT INTO Students (name, age) VALUES
  ('Анатолий', 29),
  ('Олег', 25),
  ('Семен', 27),
  ('Олеся', 28),
  ('Ольга', 31),
  ('Иван', 22);

-- Создание таблицы Teachers
CREATE TABLE Teachers (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(128) NOT NULL,
  age INT
);

-- Заполнение таблицы Teachers
INSERT INTO Teachers (name, age) VALUES
  ('Петр', 39),
  ('Максим', 35),
  ('Антон', 37),
  ('Всеволод', 38),
  ('Егор', 41),
  ('Светлана', 32);

-- Создание таблицы Competencies
CREATE TABLE Competencies (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(128) NOT NULL
);

-- Заполнение таблицы Competencies
INSERT INTO Competencies (title) VALUES
  ('Математика'),
  ('Информатика'),
  ('Программирование'),
  ('Графика');

-- Создание таблицы Teachers2Competencies
CREATE TABLE Teachers2Competencies (
  id INT PRIMARY KEY AUTO_INCREMENT,
  teacher_id INT,
  competency_id INT
);

-- Заполнение таблицы Teachers2Competencies
INSERT INTO Teachers2Competencies (teacher_id, competency_id) VALUES
  (1, 1),
  (2, 1),
  (2, 3),
  (3, 2),
  (4, 1),
  (5, 3);

-- Создание таблицы Courses
CREATE TABLE Courses (
  id INT PRIMARY KEY AUTO_INCREMENT,
  teacher_id INT,
  title VARCHAR(128) NOT NULL,
  headman_id INT
);

-- Заполнение таблицы Courses
INSERT INTO Courses (teacher_id, title, headman_id) VALUES
  (2, 'Алгебра логики', 2),
  (3, 'Математическая статистика', 3),
  (5, 'Высшая математика', 5),
  (1, 'Javascript', 1),
  (1, 'Базовый Python', 1);

-- Создание таблицы Students2Courses
CREATE TABLE Students2Courses (
  id INT PRIMARY KEY AUTO_INCREMENT,
  student_id INT,
  course_id INT
);

-- Заполнение таблицы Students2Courses
INSERT INTO Students2Courses (student_id, course_id) VALUES
  (1, 1),
  (2, 1),
  (3, 2),
  (3, 3),
  (4, 5);

-- 1) Вывести имена студентов и курсы, которые они проходят:

SELECT Students.name, Courses.title
FROM Students
JOIN Students2Courses ON Students.id = Students2Courses.student_id
JOIN Courses ON Students2Courses.course_id = Courses.id;

-- 2) Вывести имена всех преподавателей с их компетенциями:

SELECT Teachers.name, Competencies.title
FROM Teachers
LEFT JOIN Teachers2Competencies ON Teachers.id = Teachers2Competencies.teacher_id
LEFT JOIN Competencies ON Teachers2Competencies.competency_id = Competencies.id;

-- 3) Найти преподавателя, у которого нет компетенций:

SELECT Teachers.name
FROM Teachers
LEFT JOIN Teachers2Competencies ON Teachers.id = Teachers2Competencies.teacher_id
WHERE Teachers2Competencies.teacher_id IS NULL;

-- 4) Найти имена студентов, которые не проходят ни один курс:

SELECT Students.name
FROM Students
LEFT JOIN Students2Courses ON Students.id = Students2Courses.student_id
WHERE Students2Courses.student_id IS NULL;

-- 5) Найти курсы, которые не посещает ни один студент:

SELECT Courses.title
FROM Courses
LEFT JOIN Students2Courses ON Courses.id = Students2Courses.course_id
WHERE Students2Courses.course_id IS NULL;

-- 6) Найти компетенции, которых нет ни у одного преподавателя:

SELECT Competencies.title
FROM Competencies
LEFT JOIN Teachers2Competencies ON Competencies.id = Teachers2Competencies.competency_id
WHERE Teachers2Competencies.competency_id IS NULL;

-- 7) Вывести название курса и имя старосты:

SELECT Courses.title, Students.name AS headman_name
FROM Courses
LEFT JOIN Students AS headmen ON Courses.headman_id = headmen.id;

-- 8) Вывести имя студента и имена старост, которые есть на курсах, которые он проходит:

SELECT Students.name AS student_name, headmen.name AS headman_name
FROM Students
JOIN Students2Courses ON Students.id = Students2Courses.student_id
JOIN Courses ON Students2Courses.course_id = Courses.id
JOIN Students AS headmen ON Courses.headman_id = headmen.id;