<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Bookings of Product</title>
</head>
<body>
<h1>Current Booking</h1>
<table>
    <tr>
        <th>ID</th>
        <th>date</th>
        <th>amount</th>
    </tr>
    <#list bookings as booking>
        <tr>
            <td>${booking.id}</td>
            <td>${booking.date}</td>
            <td>${booking.amount}</td>
        </tr>

    </#list>
</table>
<h1>Empty Bookings:</h1>
<table>
    <tr>
        <th>ID</th>
        <th>date</th>
        <th>amount</th>
    </tr>
    <#list bookingsWithoutProduct as booking>
        <tr>
            <td>${booking.id}</td>
            <td>${booking.date}</td>
            <td>${booking.amount}</td>
        </tr>

    </#list>
</table>
</body>
</html>