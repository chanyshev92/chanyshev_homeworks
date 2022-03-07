<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${one_product.description}</title>
</head>
<body>
<h3>Current Data:</h3>
<br>
<h3>Description : ${one_product.description}</h3>
<h3>Price : ${one_product.price}</h3>
<h3>Amount : ${one_product.amount}</h3>
<br>
<h3>Update Data:</h3>
<form action="/one_product/${one_product.id}/update">
    <label>
       Description: <input name="description" placeholder="${one_product.description}">
    </label>
    <label>
        Price: <input name="price" placeholder="${one_product.price}">
    </label>
    <label>
        Amount: <input name="amount" placeholder="${one_product.amount}">
    </label>
    <input type="submit" value="update">
</form>
</body>
</html>