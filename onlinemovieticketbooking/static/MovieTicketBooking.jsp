<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Movie Ticket Booking</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"></head>

<body>

<div class="container mt-5">
    <div class="d-flex justify-content-center mt-5">
    <div class=" center card shadow-lg p-4 "style="width: 650px">
        <h2 class="text-center mb-4">Online Movie Ticket Booking</h2>

        <form action="movie" method="post">

            <div class="mb-3">
                <label class="form-label">Ticket ID</label>
                <input type="number" name="ticket_id" class="form-control w-60" placeholder="Enter ticket ID">
            </div>

            <div class="mb-3">
                <label class="form-label">Theatre Name</label>
                <input type="text" name="theatre_name" class="form-control w-60" placeholder="Enter theatre name">
            </div>

            <div class="mb-3">
                <label class="form-label">Movie Name</label>
                <input type="text" name="movie_name" class="form-control w-60" placeholder="Enter movie name">
            </div>

            <div class="mb-3">
                <label class="form-label">Show Time</label>
                <select name="showTime" class="form-select">
                    <option value="">-- Select Show Time --</option>
                    <option value="10:00 AM">10:00 AM</option>
                    <option value="1:00 PM">1:00 PM</option>
                    <option value="4:00 PM">4:00 PM</option>
                    <option value="7:30 PM">7:30 PM</option>
                    <option value="9:45 PM">9:45 PM</option>
                </select>
            </div>

            <div class="mb-3">
                <label class="form-label">Number of Tickets</label>
                <input type="number" name="number_of_ticket" class="form-control w-60" placeholder="Enter number of tickets">
            </div>

            <div class="mb-3">
                <label class="form-label">Price</label>
                <input type="number" name="price" class="form-control w-60" placeholder="Enter price">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary px-4">Book Ticket</button>
            </div>
        </form>
    </div>
</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js">
</script>
<script src="validation.js"></script>

</body>
</html>
