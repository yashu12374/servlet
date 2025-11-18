<html>
<head>
    <title>Coffee Land</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <div class="card shadow-lg p-4 rounded-4 w-50 mx-auto">
        <h2 class="text-center text-primary">Coffee Land Details</h2>

        <form action="land" method="post">

            <div class="mb-3">
                <label class="form-label">Size by Acre</label>
                <input type="number" name="size" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Total Plants</label>
                <input type="number" name="plants" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Total Yield</label>
                <input type="number" name="yield" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Expenditure</label>
                <input type="number" name="expense" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Profit Made</label>
                <input type="number" name="profit" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Fertilizer Quantity </label>
                <input type="number" name="fertilizer" class="form-control">
            </div>

            <button class="btn btn-success w-100">Submit</button>

        </form>
    </div>
</div>

</body>
</html>
