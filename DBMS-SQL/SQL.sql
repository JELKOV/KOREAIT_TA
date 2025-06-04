-- -- 1. 데이터베이스 및 테이블 생성
-- CREATE DATABASE IF NOT EXISTS TESTDB;
-- USE TESTDB;

-- -- users 테이블 (사용자 정보)
-- CREATE TABLE IF NOT EXISTS users (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(50),
--     email VARCHAR(100)
-- );

-- -- orders 테이블 (주문 정보)
-- CREATE TABLE IF NOT EXISTS orders (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     user_id INT,
--     product VARCHAR(100),
--     order_date DATE,
--     FOREIGN KEY (user_id) REFERENCES users(id)
-- );

-- -- 테스트 데이터 삽입
-- INSERT INTO users (name, email) VALUES
-- ('Alice', 'alice@example.com'),
-- ('Bob', 'bob@example.com'),
-- ('Charlie', 'charlie@example.com');

-- INSERT INTO orders (user_id, product, order_date) VALUES
-- (1, 'Laptop', '2025-06-01'),
-- (1, 'Mouse', '2025-06-02'),
-- (2, 'Keyboard', '2025-06-03');

-- -- (1) INNER JOIN – 주문이 있는 사용자만
SELECT users.name, orders.product, orders.order_date
FROM users
INNER JOIN orders ON users.id = orders.user_id;

-- -- (2) LEFT JOIN – 모든 사용자 + 주문 없으면 NULL
SELECT users.name, orders.product, orders.order_date
FROM users
LEFT JOIN orders ON users.id = orders.user_id;

-- (3) RIGHT JOIN – 모든 주문 + 없는 사용자도 표시
SELECT users.name, orders.product, orders.order_date
FROM users
RIGHT JOIN orders ON users.id = orders.user_id;

-- -- (4) FULL OUTER JOIN 흉내내기 (MySQL은 직접 지원 안함)
SELECT users.name, orders.product, orders.order_date
FROM users
LEFT JOIN orders ON users.id = orders.user_id
UNION
SELECT users.name, orders.product, orders.order_date
FROM users
RIGHT JOIN orders ON users.id = orders.user_id;


-- -- products 테이블 (상품 정보)
-- CREATE TABLE IF NOT EXISTS products (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(50),
--     price INT
-- );

-- -- order_items 테이블 (주문 상세 - 다대다 관계)
-- CREATE TABLE IF NOT EXISTS order_items (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     order_id INT,
--     product_id INT,
--     quantity INT,
--     FOREIGN KEY (order_id) REFERENCES orders(id),
--     FOREIGN KEY (product_id) REFERENCES products(id)
-- );

-- -- payments 테이블 (결제 정보)
-- CREATE TABLE IF NOT EXISTS payments (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     order_id INT,
--     amount_paid INT,
--     payment_date DATE,
--     FOREIGN KEY (order_id) REFERENCES orders(id)
-- );

-- -- products 데이터 삽입
-- INSERT INTO products (name, price) VALUES
-- ('노트북', 1200000),
-- ('무선 마우스', 30000),
-- ('키보드', 45000),
-- ('모니터', 200000);

-- -- order_items 데이터 삽입
-- INSERT INTO order_items (order_id, product_id, quantity) VALUES
-- (1, 1, 1),  -- Alice: 노트북 1개
-- (2, 2, 2),  -- Alice: 마우스 2개
-- (3, 3, 1);  -- Bob: 키보드 1개

-- -- payments 데이터 삽입
-- INSERT INTO payments (order_id, amount_paid, payment_date) VALUES
-- (1, 1200000, '2025-06-01'),
-- (2, 60000, '2025-06-02'),
-- (3, 45000, '2025-06-03');

-- -- 실습 쿼리 예시

-- -- 사용자별 총 지출 금액
SELECT u.name, SUM(p.price * oi.quantity) AS total_spent
FROM users u
JOIN orders o ON u.id = o.user_id
JOIN order_items oi ON o.id = oi.order_id
JOIN products p ON oi.product_id = p.id
GROUP BY u.name;

-- -- 주문별 결제 여부 비교
SELECT o.id AS order_id,
       SUM(p.price * oi.quantity) AS expected,
       MAX(pay.amount_paid) AS paid
FROM orders o
JOIN order_items oi ON o.id = oi.order_id
JOIN products p ON oi.product_id = p.id
JOIN payments pay ON o.id = pay.order_id
GROUP BY o.id;
