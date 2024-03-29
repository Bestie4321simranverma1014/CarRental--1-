var city = localStorage.getItem("city");
fetchCarsByCity(city);
function fetchCarsByCity(city) {
  fetch(`/cars/cars/${city}`)
    .then((response) => {
      if (response.ok) {
        return response.json();
      }
      throw new Error("Failed to fetch data");
    })
    .then((data) => {
      console.log(data);
      showGridData(data);
    })
    .catch((error) => {
      console.error("Error fetching data:", error);
    });
}

var showGridData = (json) => {
  console.log('json----'+json);
  var carsSection = document.querySelector(".cars");
  json.forEach((car) => {
    var carDiv = document.createElement("div");
    carDiv.classList.add("car");

    var img = document.createElement("img");
    img.src = ""; // Add image path here
    img.alt = car.brand + " " + car.model;

    var h3 = document.createElement("h3");
    h3.textContent = car.brand + " " + car.model;

    var p = document.createElement("p");
    p.textContent =
      "Year: " + car.year + ", Price per Day: $" + car.pricePerDay;

    var rentNowLink = document.createElement("a");
    rentNowLink.href = "#"; // Add link functionality here
    rentNowLink.classList.add("button");
    rentNowLink.textContent = "Rent Now";

    carDiv.appendChild(img);
    carDiv.appendChild(h3);
    carDiv.appendChild(p);
    carDiv.appendChild(rentNowLink);

    carsSection.appendChild(carDiv);
  });
};

