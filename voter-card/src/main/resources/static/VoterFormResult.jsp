<html>
<head>
    <meta charset="UTF-8">
    <title>Voter Card Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
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

<div class="container mt-5">
    <div class="card shadow p-4">

        <h2 class="text-center mb-4">Voter Card Details</h2>

        <p><strong>Voter Name:</strong> ${dto.voterName}</p>
        <p><strong>Father Name:</strong> ${dto.fatherName}</p>
        <p><strong>Age:</strong> ${dto.age}</p>
        <p><strong>Gender:</strong> ${dto.gender}</p>
        <p><strong>Address:</strong> ${dto.address}</p>

        <div class="text-center mt-4">
            <a href="index.html" class="btn btn-primary">Add another Voter</a>
        </div>

    </div>
</div>

</body>
</html>
