
let orderButton = document.getElementById('orderButton');
let span = document.getElementById('statusSpan');


orderButton.addEventListener("click", () => {

    fetch('http://localhost:8080/customer/order')
        .then(response => response.json())
        .then(data => span.innerText =  "Status : Order " +data.orderId +"has been ordered")
        .catch(error => console.log('error:', error));
});
