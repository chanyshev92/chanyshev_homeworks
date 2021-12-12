<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${user.name}</title>
</head>
<body>
<h3>Current Data:</h3>
<br>
<h3>Name : ${user.name}</h3>
<h3>Role : ${user.email}</h3>
<br>
<h3>Update Data:</h3>
<form method="post" action="/users/${user.id}/update">
    <label>
        Name: <input name="name" value="${user.name}">
    </label>
    <label>
        Role: <input name="email" value="${user.email}">
    </label>
    <input type="submit" value="update">
</form>
</body>
</html>