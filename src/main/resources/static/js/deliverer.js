
let getReadyOrdersButton = document.getElementById('getReadyOrders');
let markAsDelivered = document.getElementById('setOrderAsDelivered');
let spanDeliverer = document.getElementById('info');
let ordersDiv = document.getElementById('orders');
let readyOrders =[];

let createOrdersGrid = (orders) =>  {

    removeCurrentList();
    spanDeliverer.innerText = "";
    if(orders.length === 0){
        spanDeliverer.innerText = "No orders selected";
        return;
    }

    orders.forEach(x => {
        let paragraph = document.createElement('p');
        let radio = document.createElement('input');
        radio.setAttribute('type', 'checkbox');
        radio.setAttribute('name', 'order');
        radio.setAttribute('id', x.order.orderId);
        radio.setAttribute('value', x.order.orderId);

        let label = document.createElement('label');
        label.setAttribute('for', x.order.orderId)


        label.appendChild(radio);
        label.appendChild(document.createTextNode(`${x.order.orderId}`));

        paragraph.append(label);
        ordersDiv.append(paragraph);
    });

}

function getActiveOrders() {
    fetch('http://localhost:8080/deliverer/getActiveOrders', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        }
    })
        .then(response => response.json())
        .then(data => readyOrders = data)
        .then(() => createOrdersGrid(readyOrders))
        .catch(error => console.log('error:', error));
}

getReadyOrdersButton.addEventListener("click", () => {
    getActiveOrders();
});

function removeCurrentList() {
    while (ordersDiv.firstChild) {
        ordersDiv.removeChild(ordersDiv.firstChild);
    }
}

function buildSelectedOrderObjects() {
    let checkedOrders = document.querySelectorAll('input[name="order"]:checked')
    let deliveredOrdersArr = [];

    checkedOrders.forEach(x => {
        deliveredOrdersArr.push(
            {
                status:"FINISHED",
                    order: {
                        orderId : x.value,
                        status: "SEND_TO_DELIVERER"
                    }
            })
    });

    console.log(deliveredOrdersArr);
    return deliveredOrdersArr.length > 0 ? deliveredOrdersArr : null;
}

markAsDelivered.addEventListener("click", () => {

    let checkedOrders = document.querySelectorAll('input[name="order"]:checked')
    spanDeliverer.innerText = "";
    if(checkedOrders.length === 0 ){
        spanDeliverer.innerText = "No orders selected";
        return;
    }

    fetch('http://localhost:8080/deliverer/deliverOrder',{
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(buildSelectedOrderObjects()),
        })
        .then(() => getActiveOrders())
        .catch(error => console.log('error:', error));
});

