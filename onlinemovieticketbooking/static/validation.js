function validateAndSubmit() {
            // Get values from inputs
            const ticketId = document.getElementById("ticket_id").value.trim();
            const theatreName = document.getElementById("theatre_name").value.trim();
            const movieName = document.getElementById("movie_name").value.trim();
            const showTime = document.getElementById("showTime").value;
            const numberOfTicket = document.getElementById("number_of_ticket").value.trim();
            const price = document.getElementById("price").value.trim();

            // Ticket ID
            if (ticketId === "") {
                alert("Ticket ID is required");
                return;
            }
            if (isNaN(ticketId)) {
                alert("Ticket ID must be a number");
                return;
            }

            // Theatre Name
            if (theatreName === "") {
                alert("Theatre Name is required");
                return;
            }

            // Movie Name
            if (movieName === "") {
                alert("Movie Name is required");
                return;
            }

            // Show Time
            if (showTime === "") {
                alert("Please select a Show Time");
                return;
            }

            // Number of Tickets
            if (numberOfTicket === "" || Number(numberOfTicket) <= 0) {
                alert("Number of Tickets must be greater than 0");
                return;
            }

            // Price
            if (price === "" || Number(price) <= 0) {
                alert("Price must be greater than 0");
                return;
            }

            // All validations
            alert(
                `Ticket ID: ${ticketId}\nTheatre: ${theatreName}\nMovie: ${movieName}\n` +
                `Show Time: ${showTime}\nNumber of Tickets: ${numberOfTicket}\nPrice: ₹${price}`
            );

            // Optionally, you can clear the fields after submission
            document.getElementById("ticket_id").value = "";
            document.getElementById("theatre_name").value = "";
            document.getElementById("movie_name").value = "";
            document.getElementById("showTime").value = "";
            document.getElementById("number_of_ticket").value = "";
            document.getElementById("price").value = "";
        }