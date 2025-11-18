<html>
<head>
    <title>Coffee Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <div class="card shadow-lg p-4 rounded-4 w-50 mx-auto">
        <h2 class="text-center text-primary">Coffee Details</h2>

        <form action="coffee" method="post">

            <div class="mb-3">
                <label class="form-label">Type</label>
                <input type="text" name="type" class="form-control w-50" >
            </div>

            <div class="mb-3">
                <label class="form-label">Price</label>
                <input type="number" name="price" class="form-control w-50">
            </div>

            <div class="mb-3">
                <label class="form-label">Quantity</label>
                <input type="number" name="quantity" class="form-control w-50">
            </div>

            <div class="mb-3">
                <label class="form-label">Farmer</label>
                <input type="text" name="farmer" class="form-control w-50">
            </div>

            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" name="location" class="form-control w-50">
            </div>

            <button class="btn btn-success w-50">Submit</button>

        </form>
    </div>
</div>

</body>
</html>
