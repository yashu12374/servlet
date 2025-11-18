<html>
<head>
    <title>Customer Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4 rounded-4 w-50 mx-auto">

        <h2 class="text-center text-primary">Customer Details</h2>

        <form action="customer" method="post">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input name="name" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Mobile</label>
                <input name="mobile" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Coffee Flavour</label>
                <input name="flavour" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Quantity</label>
                <input type="number" name="quantity" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Payment Mode</label>
                <select name="payment" class="form-select">
                    <option>Cash</option>
                    <option>UPI</option>
                    <option>Card</option>
                </select>
            </div>

            <button class="btn btn-success w-100">Submit</button>

        </form>
    </div>
</div>

</body>
</html>
