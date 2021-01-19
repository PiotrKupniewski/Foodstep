
let getReadyOrdersButton = document.getElementById('getReadyOrders');
let markAsDelivered = document.getElementById('setOrderAsDelivered');
let spanDeliverer = document.getElementById('info');
getReadyOrdersButton.addEventListener("click", () => {

    fetch('http://localhost:8080/deliverer/getActiveOrders')
        .then(response => response.json())
        .then(data => spanDeliverer.innerText =  JSON.stringify(data))
        .catch(error => console.log('error:', error));
});

markAsDelivered.addEventListener("click", () => {

    fetch('http://localhost:8080/deliverer/deliverOrder')
        .then(response => response.json())
        .then(data => spanDeliverer.innerText = JSON.stringify(data))
        .catch(error => console.log('error:', error));
});

