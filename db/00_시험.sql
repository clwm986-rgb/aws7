INSERT INTO member (m_id, m_name, m_point)
VALUES
(1, '홍길동', 1000),
(2, '김철수', 500);

INSERT INTO product (p_id, p_name, p_price, p_stock)
VALUES
(101, '노트북', 1500000, 10),
(102, '마우스', 30000, 50);

SELECT m_name, m_point
FROM member;


SELECT p_name, p_stock
FROM product;