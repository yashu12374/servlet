<html>
<head>
    <meta charset="UTF-8">
    <title>Ticket Booking Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4">

        <h2 class="text-center mb-4">Movie Ticket Booking Result</h2>

        <p><strong>Ticket ID:</strong> ${ticket_id}</p>
        <p><strong>Theatre Name:</strong> ${theatre_name}</p>
        <p><strong>Movie Name:</strong> ${movie_name}</p>
        <p><strong>Show Time:</strong> ${showTime}</p>
        <p><strong>Number of Tickets:</strong> ${number_of_ticket}</p>
        <p><strong>Price:</strong>  ${price}</p>

        <div class="text-center mt-4">
            <a href="MovieTicketBooking.jsp" class="btn btn-primary">Book Another Ticket</a>
        </div>

    </div>
</div>

</body>
</html>
