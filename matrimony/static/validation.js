function $(id) {
    return document.getElementById(id);
}

function validateForm() {
    let valid = true;

    // Email validation
    let email = $("email").value.trim();
    let emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(email)) {
        $("emailError").innerHTML = "Enter valid email";
        valid = false;
    } else {
        $("emailError").innerHTML = "";
    }

    // Gender validation
    let male = $("male").checked;
    let female = $("female").checked;

    if (!male && !female) {
        $("genderError").innerHTML = "Select gender";
        valid = false;
    } else {
        $("genderError").innerHTML = "";
    }

    // DOB validation
    let dob = $("dob").value;
    if (dob === "") {
        $("dobError").innerHTML = "Select date of birth";
        valid = false;
    } else {
        $("dobError").innerHTML = "";
    }

    // Mother Tongue
    if ($("motherTongue").value === "0") {
        $("motherError").innerHTML = "Select mother tongue";
        valid = false;
    } else {
        $("motherError").innerHTML = "";
    }

    // Religion
    if ($("religion").value === "0") {
        $("religionError").innerHTML = "Select religion";
        valid = false;
    } else {
        $("religionError").innerHTML = "";
    }

    // Marital Status
    if ($("maritalStatus").value === "0") {
        $("maritalError").innerHTML = "Select marital status";
        valid = false;
    } else {
        $("maritalError").innerHTML = "";
    }

    // Height Validation (1–7)
    let height = $("height").value;
    if (height === "" || height < 1 || height > 7) {
        $("heightError").innerHTML = "Height must be between 1 and 7";
        valid = false;
    } else {
        $("heightError").innerHTML = "";
    }

    // Enable submit button only if valid
    $("submitBtn").disabled = !valid;
}

// Change Groom's / Bride's
function updateForField() {
    if ($("male").checked) {
        $("forLabel").value = "Groom's";
    } else if ($("female").checked) {
        $("forLabel").value = "Bride's";
    }
}

window.onload = function () {
    const fields = ["email", "dob", "motherTongue", "religion", "maritalStatus", "height"];
    fields.forEach(id => $(id).addEventListener("input", validateForm));

    $("male").addEventListener("change", () => { updateForField(); validateForm(); });
    $("female").addEventListener("change", () => { updateForField(); validateForm(); });
};
