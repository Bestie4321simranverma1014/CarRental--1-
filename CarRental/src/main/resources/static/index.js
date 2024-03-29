var submitButton = document.querySelector("#search-button");
var pickUpLocation = document.querySelector("#pickup-location");

var fromDate = document.querySelector("#pickup-date-time");
var toDate = document.querySelector("#return-date-time");

submitButton.addEventListener("click", () => {
  if (validation()) {
    localStorage.setItem("city", pickUpLocation.value.toLowerCase());
    window.open("main.html");
  }
});

let validation = () => {
  if (
    pickUpLocation.value.toLowerCase() != "bangalore" &&
    pickUpLocation.value.toLowerCase() != "sasaram" &&
    pickUpLocation.value.toLowerCase() != "delhi" &&
    pickUpLocation.value.toLowerCase() != "mumbai"
  ) {
    alert("we do not serve at your location yet!!");
    return false;
  }

  if (toDate.value < fromDate.value) {
    alert("pickup date can not be greater than return date");
    return false;
  }
  return true;
};
