let customername = [];
function PageOnLoad() {
    let buses = JSON.parse(localStorage.getItem("source and destination"));
    if (buses != null) {
      customername=buses;
    }
}
 
function travelAgency(event) {
    event.preventDefault();
    let source = document.getElementById("source").value;
    console.log(source);
    let destination = document.getElementById("destination").value;
    let start = document.getElementById("start").value;
    let end = document.getElementById("end").value;
    let date = document.getElementById("date").value;
    let seats = document.getElementById("seats").value;
    
    let customeropinion= {
        "source": source,
        "destination": destination,
        "start": start,
        "end": end,
        "date": date,
        "seats": seats
    }

    console.log(customeropinion);

    customername.push(customeropinion);
    let check = JSON.stringify(customername)
     localStorage.setItem("source and destination", check);
       window.location.href = "../../pages/list.html";  
}
PageOnLoad();