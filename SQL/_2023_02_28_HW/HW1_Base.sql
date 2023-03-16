(1) Предметная область: Заказ еды в кафе.

Регистрация заказа на еду.
--: Добавление записи о заказе. - Create
--: Просмотр информации о заказе. - Read
--: Изменение состава заказа. - Update
--: Запись о состоянии заказа ("New", "preparing", "Ready"). - Create
--: Просмотр информации о состоянии заказа и его этапах выполнения. - Read
--: Изменение статуса (состояния) заказа. - Update
--: Удаление записи (если заказ был ошибочным). - Delete

(2) SELECT * FROM Products WHERE Price BETWEEN 10 AND 100 ORDER BY ProductName
Вывести все товары в диапазоне цены от 10 до 100, отсортированные по названию.

(3) UPDATE Customers SET Address = NULL WHERE Country NOT IN ('Germany', 'France')
Для клиентов не из Германии и не из Франции очистить адрес.

(4) DELETE FROM Customers WHERE Country = 'USA'
Удалить (безвозвратно) клиентов из 'USA'.

(5) SELECT * FROM Suppliers WHERE City = 'Tokyo' AND Country = 'Japan' ORDER BY SupplierName
Вывести всех поставщиков (suppliers) из Токио, Япония, отсортированные по имени.

(6) SELECT * FROM Products WHERE CategoryID IN (1, 5) AND Price <= 20 ORDER BY Price
Вывести товары из категорий 1 и 5 с ценой до 20 EURO с сортировкой по возрастанию цены. 
