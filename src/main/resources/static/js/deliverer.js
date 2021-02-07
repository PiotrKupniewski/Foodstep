
let getReadyOrdersButton = document.getElementById('getReadyOrders');
let markAsDelivered = document.getElementById('setOrderAsDelivered');
let spanDeliverer = document.getElementById('info');
let ordersDiv = document.getElementById('orders');
let readyOrders =[];

let createOdersGrid = (orders) =>  {

    orders.forEach(x => {
        let paragraph = document.createElement('p');
        let radio = document.createElement('input');
        radio.setAttribute('type', 'radio');
        radio.setAttribute('name', 'choice');
        radio.setAttribute('is', x.order.orderId);

        let label = document.createElement('label');
        label.setAttribute('for', x.order.orderId)


        label.appendChild(radio);
        label.appendChild(document.createTextNode(`${x.order.orderId}`));

        paragraph.append(label);
        ordersDiv.append(paragraph);
    });

}

getReadyOrdersButton.addEventListener("click", () => {

    fetch('http://localhost:8080/deliverer/getActiveOrders' ,{
        method: 'POST',
        headers: {
        'Content-Type': 'application/json',
    }

    })
        .then(response => response.json())
        .then(data => readyOrders = data)
        .then(data => createOdersGrid(readyOrders))
        .catch(error => console.log('error:', error));
});

markAsDelivered.addEventListener("click", () => {

    fetch('http://localhost:8080/deliverer/deliverOrder',{
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(readyOrders[0])
        })
        .then(response => response.json())
        .then(data => spanDeliverer.innerText = JSON.stringify(data))
        .catch(error => console.log('error:', error));
});

