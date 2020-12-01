let completeOrderButton = document.getElementById('completeOrder');
let getActiveOrdersButton = document.getElementById('getActiveOrders');
let createMenuButton = document.getElementById('createMenu');
let info = document.getElementById('info');

completeOrderButton.addEventListener("click", () => {
    fetch('http://localhost:8080/restaurant/completeOrder', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        info.innerText = "Order has been delivered";
    }).catch(error => console.log('error:', error));
});


getActiveOrdersButton.addEventListener("click", () => {
    fetch('http://localhost:8080/restaurant/getActiveOrders', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        info.innerText = "* Acrive offers";
    }).catch(error => console.log('error:', error));
});


createMenuButton.addEventListener("click", () => {
    fetch('http://localhost:8080/restaurant/createMenu', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        info.innerText = "Menu created";
    }).catch(error => console.log('error:', error));
});

