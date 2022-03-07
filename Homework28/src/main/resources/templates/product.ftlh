<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Products</title>
</head>
<body>
<h1>Add Product</h1>
<form method="post" action= "/product">
    <label>Description:
        <input name="description" placeholder="Description">
    </label>
    <label>Price:
        <input name="price" placeholder="Price">
    </label>
    <label>Amount:
        <input name="amount" placeholder="Amount">
    </label>
    <input type="submit" value="Add">
</form>
<table>
    <tr>
        <th>ID</th>
        <th>Description</th>
        <th>Price</th>
        <th>Amount</th>
        <th>Action</th>
    </tr>
    <#list product as product>
        <tr>
            <td>${product.id}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td>${product.amount}</td>
            <td>
                <form method="post" action="/product/${product.id}/delete">
                    <input type="submit" value="delete">
                </form>
                <a href="product/${product.id}">Go to</a>
            </td>
        </tr>
    </#list>
</table>

</body>
</html>