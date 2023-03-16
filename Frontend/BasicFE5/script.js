// Входные данные
const products = [
    {
        name: "Велосипед",
        price: 40000
    },
    {
        name: "Самокат",
        price: 15000,
    },
    {
        name: "Лыжи",
        price: 30000
    }
]
// html - элементы
const productsWrapper = document.querySelector('.products-wrapper')
const productForm = document.querySelector('.product-form')
const productName = document.querySelector('input[name="product-name"]')
const productPrice = document.querySelector('input[name="product-price"]')
const searchForm = document.querySelector('.search-wrapper')
const productSearch = document.querySelector('input[name="products-search"]')

function renderProducts() {
    productsWrapper.innerHTML = ''
products.forEach(function(product, index) {
    productsWrapper.innerHTML += `
        <div class="product" id="${index}">
            <p class="product-name">${product.name}</p>
            <p class="product-price">${product.price}</p>
            <button class="delete-btn">X</button>
        </div>
    `
})
onHover()
onDelete()
}
renderProducts()

productForm.addEventListener('submit', function(event) {
    event.preventDefault()
    const newProduct = {
        name: productName.value,
        price: Number(productPrice.value)
    }
    products.push(newProduct)
    showNotification()
    renderProducts()
    clearForm()
})

function clearForm() {
    productName.value = ''
    productPrice.value = ''
}

searchForm.addEventListener('keyup', function(event) {   
    event.preventDefault();  
    renderProducts()
    searchProduct()
})

function onHover(event) {
    const productCards = document.querySelectorAll('.product')
    productCards.forEach(function(card) {
        card.addEventListener('mouseover', function() {
            const deleteBtn = card.querySelector('.delete-btn')
            deleteBtn.style.display = 'block'
        card.addEventListener('mouseout', function() {
            const deleteBtn = card.querySelector('.delete-btn')
            deleteBtn.style.display = 'none'
        })
    })
}
)}

function onDelete(event) {
    const deleteBtn = document.querySelectorAll('.delete-btn')
    deleteBtn.forEach(function(btn) {
        btn.addEventListener('click', function() {
            const id = btn.parentElement.id
            products.splice(id, 1)
            // btn.parentElement.remove()
            renderProducts()
        })
    })
}

// всплывающее  окно notification Продукт добавлен
function showNotification() {
    const notification = document.querySelector('.notification')
    notification.style.display = 'block'
    setTimeout(function() {
        notification.style.display = 'none'
    }, 2000)
}

// поиск продукта products-search  

function searchProduct() {
    const searchValue = productSearch.value.toLowerCase()
    const products = document.querySelectorAll('.product')
    products.forEach(function(product) {
        const productName = product.querySelector('.product-name').textContent.toLowerCase()
        if (productName.indexOf(searchValue) === -1) {
            product.style.display = 'none'
        } else {
            product.style.display = 'block'
        }
    })
}
