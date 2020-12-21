let completeOrderButton = document.getElementById('completeOrder');
let getActiveOrdersButton = document.getElementById('getActiveOrders');
let createMenuButton = document.getElementById('createMenu');
let info = document.getElementById('info');



completeOrderButton.addEventListener("click", () => {
    fetch('http://localhost:8080/restaurant/completeOrder', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({orderId: info.children[0].children[0].firstElementChild.innerText, status :"IN_PROGESS"})
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        info.innerText = "Order has been delivered";
    }).catch(error => console.log('error:', error));
});


let createOrderList = (data) => {
    let listWrapper = document.createElement('div');
    let ul = document.createElement("ul");

    console.log(data);
    listWrapper.appendChild(ul);
    data.forEach(x => {
        let item = document.createElement("li");
        item.innerText = x.orderId;
        ul.appendChild(item)
    })
    info.appendChild(listWrapper);
};

getActiveOrdersButton.addEventListener("click", () => {


    fetch('http://localhost:8080/restaurant/getActiveOrders', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
    })
    .then(response => response.json())
    .then(data => {
        createOrderList(data);
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

