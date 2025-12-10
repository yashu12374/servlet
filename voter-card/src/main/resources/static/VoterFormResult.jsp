<html>
<head>
    <meta charset="UTF-8">
    <title>Voter Card Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4">

        <h2 class="text-center mb-4">Voter Card Details</h2>

        <p><strong>ID:</strong> ${id}</p>
        <p><strong>Voter Name:</strong> ${voterName}</p>
        <p><strong>Father Name:</strong> ${fatherName}</p>
        <p><strong>Age:</strong> ${age}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Address:</strong> ${address}</p>

        <div class="text-center mt-4">
            <a href="index.html" class="btn btn-primary">Add another Voter</a>
        </div>

    </div>
</div>

</body>
</html>
