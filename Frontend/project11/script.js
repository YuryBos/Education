// Задача. Есть массив имен names=["Arsen", "Anna", "Aleksei", "Yurii"]. Нужно в консоли
    // вывести каждое имя, которое будет записано в верхнем регистре, т.е все буквы сделать заглавными

const names = ["Arsen", "Anna", "Aleksei", "Yurii"]
// for (let i = 0; i < names.length; i++) {
//     console.log(names[i].toUpperCase());
// }
names.forEach(function(name) {
    console.log(name.toUpperCase())
})

const imagesSection = document.querySelector('.images')
const images = imagesSection.querySelectorAll('img') // NodeList [{img1}, {img2}]
const imagesContainer = document.querySelector('.images-container')

// for(let i = 0; i < images.length; i++) {
//     images[i].addEventListener('click', function(event) {
//         imagesContainer.setAttribute('src', event.target.src)
//     })
// }

images.forEach(function(image) {
    image.addEventListener('click', function(event) {
                imagesContainer.setAttribute('src', event.target.src)
            })
})


// Задача. Умножить каждый элемент массива на 10 и отобразить в консоли
const numbers = [10, 20, 30, 40, 50]
for(let i = 0; i < numbers.length; i++) {
    console.log(i)
    console.log(numbers[i] * 10) // то же самое, что и item, получаемый в коллбэке forEach()
}


numbers.forEach(function(number) {
    console.log(number * 10)
})
