<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>Ứng dụng chuyển đổi tiền tệ</h1>
<form action="/usd" method="post">
    <label>Rate</label>
    <input type="text" name="rate" placeholder="Rate" value="${rate}">
    <label>USD</label>
    <input type="text" name="usd" placeholder="USD" value="${usd}">
    <input type="submit" value="Convert">
    <input type="text" value="${result}">
</form>

</body>
</html>