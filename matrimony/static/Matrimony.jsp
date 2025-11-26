<html>
<head>
    <title>Matrimony Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5 p-4 bg-white shadow rounded" style="max-width: 600px">
    <h3 class="text-center mb-4">Matrimony Form</h3>

    <form action="matrimony" method="post">

        <!--Email-->
        <div class="mb-3">
            <label class="form-label">Email *</label>
            <input type="text" id="email" class="form-control" name="email">
            <small id="emailError" class="text-danger"></small>
        </div>

        <!-- Gender -->
        <div class="mb-3">
            <label class="form-label">Gender *</label><br>
            <input type="radio" id="male" name="gender"> Male
            <input type="radio" id="female" name="gender" class="ms-3"> Female
            <br>
            <small id="genderError" class="text-danger"></small>
        </div>

        <!-- For -->
        <div class="mb-3">
            <label class="form-label">For *</label>
            <input type="text" name="forType" id="forLabel" class="form-control" value="Select Gender" disabled>
        </div>

        <!-- DOB -->
        <div class="mb-3">
            <label class="form-label">Date Of Birth *</label>
            <input type="date" id="dob" class="form-control" name="dob">
            <small id="dobError" class="text-danger"></small>
        </div>

        <!-- Mother Tongue -->
        <div class="mb-3">
            <label class="form-label">Mother Tongue *</label>
            <select id="motherTongue" name="motherTongue" class="form-select">
                <option value="0">Select</option>
                <option>Kannada</option>
                <option>Hindi</option>
                <option>English</option>
                <option>Telugu</option>
            </select>
            <small id="motherError" class="text-danger"></small>
        </div>

        <!-- Religion -->
        <div class="mb-3">
            <label class="form-label">Religion *</label>
            <select id="religion" class="form-select" name="religion">
                <option value="0">Select</option>
                <option>Hindu</option>
                <option>Muslim</option>
                <option>Christian</option>
                <option>Jain</option>
            </select>
            <small id="religionError" class="text-danger"></small>
        </div>

        <!-- Marital Status -->
        <div class="mb-3">
            <label class="form-label">Marital Status *</label>
            <select id="maritalStatus" class="form-select" name="status">
                <option value="0">Select</option>
                <option>Single</option>
                <option>Married</option>
            </select>
            <small id="maritalError" class="text-danger"></small>
        </div>

        <!-- Height -->
        <div class="mb-3">
            <label class="form-label">Height (1 to 7) *</label>
            <input type="number" id="height" min="1" max="7" class="form-control" name="height">
            <small id="heightError" class="text-danger"></small>
        </div>

        <!-- Submit -->
        <button id="submitBtn" class="btn btn-primary w-100" disabled>Submit</button>

    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="validation.js"></script>
</body>
</html>
