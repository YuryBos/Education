const greenBtn = document.querySelector('.greenBut')
const redBtn = document.querySelector('.redBut')

function changeColor(event) {
    event.target.style.color = event.target.innerText
}

greenBtn.addEventListener('click', changeColor)
redBtn.addEventListener('click', changeColor)