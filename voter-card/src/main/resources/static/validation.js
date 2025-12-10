function validateForm() {
    let voterName = document.getElementById("voterName").value.trim();
    let fatherName = document.getElementById("fatherName").value.trim();
    let age = parseInt(document.getElementById("age").value);
    let gender = document.getElementById("gender").value;
    let voterID = document.getElementById("voterID").value.trim();
    
    let errorMsg = "";

    if (voterName === "") {
        errorMsg += "Invalid voter name. <br>";
    }
    if (fatherName === "") {
        errorMsg += "Invalid father name. <br>";
    }
    if (isNaN(age) || age < 18) {
        errorMsg += "Invalid age: must be 18 or older. <br>";
    }
    if (gender === "") {
        errorMsg += "Invalid gender. <br>";
    }
    if (voterID === "") {
        errorMsg += "Invalid voter ID. <br>";
    }

    if (errorMsg !== "") {
        document.getElementById("errorMsg").innerHTML = errorMsg;
        return false; // prevent form submission
    }

    alert("Form submitted successfully!");
    return true; // allow form submission
}
