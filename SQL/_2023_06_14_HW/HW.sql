-- 1) ������� �������� ��������, ������� ���� ����� ����������� � �������:

SELECT products.title
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY products.id
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 2) ������� �������� ��������, ������� �������� ���� ����� (�� ������ ������ ���������� ��������� ������):

SELECT products.title
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY products.id
ORDER BY SUM(orders.productcount) DESC
LIMIT 1;

-- 3) ������� ����� ������� �������� (����� ���� ��������� ������ ������):

SELECT SUM(products.price * orders.productcount) AS �����_�������
FROM products
JOIN orders ON products.id = orders.productid;


-- 4) ���������� ����� ������� �� ������-������� (online) � �� ������� � �������� (direct):

SELECT orders.ordertype, SUM(products.price * orders.productcount) AS �������
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY orders.ordertype;