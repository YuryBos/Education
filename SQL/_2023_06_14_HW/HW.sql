-- 1) Вывести название продукта, который чаще всего встречается в заказах:

SELECT products.title
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY products.id
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 2) Вывести название продукта, который покупают чаще всего (на основе общего количества купленных единиц):

SELECT products.title
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY products.id
ORDER BY SUM(orders.productcount) DESC
LIMIT 1;

-- 3) Вывести общую выручку магазина (сумма всех купленных единиц товара):

SELECT SUM(products.price * orders.productcount) AS общая_выручка
FROM products
JOIN orders ON products.id = orders.productid;


-- 4) Определить сумму выручки за онлайн-продажи (online) и за продажи в магазине (direct):

SELECT orders.ordertype, SUM(products.price * orders.productcount) AS выручка
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY orders.ordertype;