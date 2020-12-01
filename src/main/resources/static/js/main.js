
let orderButton = document.getElementById('orderButton');
let span = document.getElementById('statusSpan');



orderButton.addEventListener("click", () => {
    span.innerText =  "Status : Order has been delivered";
    fetch('http://localhost:8080/customer/order')
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(error => console.log('error:', error));

});





