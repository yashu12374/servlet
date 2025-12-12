<html>
<head>
    <title>Voter Card</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Voter Card Application</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav" aria-controls="navbarNav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="voter">Voter-Form</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="VoterSearch.jsp">Search</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="SearchAddress.jsp">Search Address</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<<div class="container mt-5">
    <div class="d-flex justify-content-center mt-5">
        <div class=" center card shadow-lg p-4 "style="width: 650px">
        <h3 class="text-center mb-4">Voter Card Form</h3>

        <form action="voter" method="post">

            <div class="mb-3">
                <label class="form-label">Voter Name</label>
                <input type="text" name="voterName" class="form-control w-60" placeholder="Enter voter name">
            </div>

            <div class="mb-3">
                <label class="form-label">Father Name</label>
                <input type="text" name="fatherName" class="form-control w-60" placeholder="Enter father name">
            </div>

            <div class="mb-3">
                <label class="form-label">Age</label>
                <input type="number" name="age" class="form-control w-60" placeholder="Enter age">
            </div>

            <div class="mb-3">
                <label class="form-label">Gender</label>
                <select name="gender" class="form-select w-60">
                    <option selected disabled>Select gender</option>
                    <option>Male</option>
                    <option>Female</option>
                    <option>Other</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Address</label>
                <input name="address" class="form-control w-60" placeholder="Enter address">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary px-4">Submit</button>
            </div>

        </form>
    </div>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="validation.js"></script>
</body>

</html>