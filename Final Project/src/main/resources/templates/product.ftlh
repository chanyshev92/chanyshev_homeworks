<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${product.description}</title>
</head>
<body>
<h3>Current Data:</h3>
<br>
<h3>Description : ${product.description}</h3>
<h3>Price : ${product.price}</h3>
<h3>Amount : ${product.amount}</h3>
<br>
<h3>Update Data:</h3>
<form method="post" action="/products/${product.id}/update">
    <label>
        Description: <input name="description" value="${product.description}">
    </label>
    <label>
        Price: <input name="price" value="${product.price}">
    </label>
    <label>
        Amount: <input name="amount" value="${product.amount}">
    </label>
    <input type="submit" value="update">
</form>
</body>
</html>