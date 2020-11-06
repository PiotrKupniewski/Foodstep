
let button = document.getElementById('orderButton');
let span = document.getElementById('statusSpan');

button.addEventListener("click", () => {
    span.innerText =  "Status : Order has been delivered";
});