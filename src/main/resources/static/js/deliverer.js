
let getReadyOrdersButton = document.getElementById('getReadyOrders');
let markAsDelivered = document.getElementById('setOrderAsDelivered');
let spanDeliverer = document.getElementById('info');
let readyOrders =[];

getReadyOrdersButton.addEventListener("click", () => {

    fetch('http://localhost:8080/deliverer/getActiveOrders' ,{
        method: 'POST',
        headers: {
        'Content-Type': 'application/json',
    }

    })
        .then(response => response.json())
        .then(data => readyOrders = data)
        .then(data => spanDeliverer.innerText =  JSON.stringify(data))
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

