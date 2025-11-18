<!DOCTYPE html>
<html>
<head>
    <title>Customer Feedback</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4 rounded-4 w-50 mx-auto">
        <h2 class="text-center text-primary">Customer Feedback</h2>

        <form action="feedback" method="post">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input name="name" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input name="email" type="email" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Comments</label>
                <textarea name="comments" class="form-control"></textarea>
            </div>

            <div class="mb-3">
                <label class="form-label">Rating</label>
                <input name="rating" type="number" min="1" max="5" class="form-control">
            </div>

            <button class="btn btn-success w-100">Submit</button>

        </form>
    </div>
</div>

</body>
</html>
