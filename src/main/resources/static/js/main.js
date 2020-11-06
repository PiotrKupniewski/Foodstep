
let button = document.getElementById('orderButton');
let span = document.getElementById('statusSpan');

button.addEventListener("click", () => {
    span.innerText = span.innerText + "Order has been delivered";
});