const products = [
    {
        id: 1,
        name: "Iphone 14",
        price: 100000,
        category: "phone"
    },
    {
        id: 2,
        name: "Iphone 13",
        price: 90000,
        category: "mobile"
    },
    {
        id: 3,
        name: "Iphone 12",
        price: 80000,
        category: "phone"
    }
]
/*
 ДЗ. 0. Наполнить массив products подобными объектами, с разными значениями

 Есть массив объектов products. Вывести название и цену каждого товара в консоли со
скидкой 10%
*/
products.forEach(function (product) {
    console.log(product.name, product.price * 0.9);
});


/* Есть массив объектов products. Из этого массива добавить в новый пустой массив только те
продукты:
    а)цена которых больше 88000; const moreThanPrice = [] нужно заполнить данный массив
    б) категория который "phone"; const categoryPhone = []
*/
const moreThanPrice = [];
const categoryPhone = [];
products.forEach(function (product) {
    if (product.price > 88000) {
        moreThanPrice.push(product);
    } 
    if (product.category === "phone") {
        categoryPhone.push(product);
    }
});
console.log(moreThanPrice);
console.log(categoryPhone);
/* Создать функцию, которая получает два числа в параметры и выводит в консоль бОльшее из них
max(10, 20) // 20
max(100, 5) // 100
*/
function max(a, b) {
    if (a > b) {
        console.log(a);
    } else {
        console.log(b);
    }
}
max(10, 20);
max(100, 5);

/*Написать функцию, которая запрашивает число у пользователя и отображает "ЧЕТ", если число четное
и "НЕЧЕТ", если нечетное*/

// функция запрвшивает число у пользователя

function isEven() {
    const number = prompt("Введите число");
    if (number % 2 === 0) {
        console.log("ЧЕТ");
    } else {
        console.log("НЕЧЕТ");
    }
}
isEven();

/* Написать функцию, которая получает два числа и возводит первое число в степень второго
power(10, 2) // 100
power(12, 2) // 144
power(2, 5) // 32
*/
function power(a, b) {
    console.log(a ** b);
}
power(10, 2);
power(12, 2);
power(2, 5);