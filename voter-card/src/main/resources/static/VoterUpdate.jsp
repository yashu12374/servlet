<html>
<head>
    <title>Voter Card</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Voter Card Application</a>
    </div>
</nav>

<div class="container mt-5">
    <div class="d-flex justify-content-center mt-5">
        <div class="center card shadow-lg p-4" style="width: 650px">

            <h3 class="text-center mb-4">Voter Card Update Form</h3>

            <form action="edit" method="post">

                <div class="mb-3">
                    <label class="form-label">Voter Name</label>
                    <input type="text" name="voterName" class="form-control w-60"
                           value="${editDTO.voterName}" readonly>
                </div>

                <div class="mb-3">
                    <label class="form-label">Father Name</label>
                    <input type="text" name="fatherName" class="form-control w-60"
                           value="${editDTO.fatherName}">
                </div>

                <div class="mb-3">
                    <label class="form-label">Age</label>
                    <input type="number" name="age" class="form-control w-60"
                           value="${editDTO.age}">
                </div>

                <div class="mb-3">
                    <label class="form-label">Gender</label>
                    <select name="gender" class="form-select w-60">
                        <option disabled>Select gender</option>
                        <option ${editDTO.gender = 'Male'}>Male</option>
                        <option ${editDTO.gender ='Female'}>Female</option>
                        <option ${editDTO.gender = 'Other'}>Other</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Address</label>
                    <input type="text" name="address" class="form-control w-60"
                           value="${editDTO.address}">
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-primary px-4">Update</button>
                </div>

            </form>

        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="validation.js"></script>
</body>
</html>
