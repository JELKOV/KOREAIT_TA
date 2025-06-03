-- -- 1. 데이터베이스 및 테이블 생성
-- CREATE DATABASE TESTDB;
-- USE TESTDB;

-- -- users 테이블 (사용자 정보)
-- CREATE TABLE users (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(50),
--     email VARCHAR(100)
-- );

-- -- orders 테이블 (주문 정보)
-- CREATE TABLE orders (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     user_id INT,
--     product VARCHAR(100),
--     order_date DATE,
--     FOREIGN KEY (user_id) REFERENCES users(id)
-- );

-- -- 2. 테스트 데이터 삽입
-- INSERT INTO users (name, email) VALUES
-- ('Alice', 'alice@example.com'),
-- ('Bob', 'bob@example.com'),
-- ('Charlie', 'charlie@example.com');

-- INSERT INTO orders (user_id, product, order_date) VALUES
-- (1, 'Laptop', '2025-06-01'),
-- (1, 'Mouse', '2025-06-02'),
-- (2, 'Keyboard', '2025-06-03'),

-- (1) INNER JOIN – 주문이 있는 사용자만
SELECT users.name, orders.product, orders.order_date
FROM users
INNER JOIN orders ON users.id = orders.user_id;

-- (2) LEFT JOIN – 모든 사용자 + 주문 없으면 NULL
SELECT users.name, orders.product, orders.order_date
FROM users
LEFT JOIN orders ON users.id = orders.user_id;

-- (3) RIGHT JOIN – 모든 주문 + 없는 사용자도 표시
SELECT users.name, orders.product, orders.order_date
FROM users
RIGHT JOIN orders ON users.id = orders.user_id;

-- (4) FULL OUTER JOIN 흉내내기 (MySQL은 직접 지원 안함)
SELECT users.name, orders.product, orders.order_date
FROM users
FULL OUTER JOIN orders
ON users.id = orders.user_id;

-- MySQL에서는 FULL OUTER JOIN을 직접 지원하지 않으므로 UNION을 사용하여 흉내냄
SELECT users.name, orders.product, orders.order_date
FROM users
LEFT JOIN orders ON users.id = orders.user_id

UNION

SELECT users.name, orders.product, orders.order_date
FROM users
RIGHT JOIN orders ON users.id = orders.user_id;