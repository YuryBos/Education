В рамках БД "песочница (интернет-магазин)" напишите следующие запросы:

(1) вывести название товаров из 2 и 5 категории с ценой от 5 до 25 (EURO), где в названии есть слово 'syrup'
SELECT * FROM Products WHERE CategoryID IN (2, 5) AND Price BETWEEN 5 AND 25 AND ProductName LIKE '%syrup%'

(2) добавьте произвольный товар в таблицу Products
INSERT INTO Products (ProductName, SupplierID, CategoryID, Unit, Price) VALUES ("Router", 1, 1, "1 pcs.", 150);

(3) у клиента с ID 1 измените адрес на произвольный


(4) у всех клиентов не из Гермарнии и не из США очистите адрес и контактное имя


(5) у всех поставщиков (Suppliers) очистите номер телефона


(6) удалите всех поставщиков не из 'USA'

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
