-- 1) ¬ывести название продукта, который чаще всего встречаетс€ в заказах:

SELECT products.title
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY products.id
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 2) ¬ывести название продукта, который покупают чаще всего (на основе общего количества купленных единиц):

SELECT products.title
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY products.id
ORDER BY SUM(orders.productcount) DESC
LIMIT 1;

-- 3) ¬ывести общую выручку магазина (сумма всех купленных единиц товара):

SELECT SUM(products.price * orders.productcount) AS обща€_выручка
FROM products
JOIN orders ON products.id = orders.productid;


-- 4) ќпределить сумму выручки за онлайн-продажи (online) и за продажи в магазине (direct):

SELECT orders.ordertype, SUM(products.price * orders.productcount) AS выручка
FROM products
JOIN orders ON products.id = orders.productid
GROUP BY orders.ordertype;