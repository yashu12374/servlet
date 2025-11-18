<html>
<head>
    <title>Cafeteria Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4 rounded-4 w-50 mx-auto">
        <h2 class="text-center text-primary">Cafeteria Details</h2>

        <form action="cafeteria" class="mt-4" method="post">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input name="name" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Location</label>
                <input name="location" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Type</label>
                <input name="type" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Price</label>
                <input type="number" name="price" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Franchise Name</label>
                <input name="franchise" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Owner Name</label>
                <input name="owner" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">GST No</label>
                <input name="gst" class="form-control">
            </div>

            <button class="btn btn-success w-100">Submit</button>

        </form>
    </div>
</div>

</body>
</html>
