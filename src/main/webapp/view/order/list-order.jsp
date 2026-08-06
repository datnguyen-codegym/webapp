<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Management</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>

<div class="container mt-5">

    <div class="d-flex justify-content-between align-items-center mb-4">
        <h2>📦 Order Management</h2>

        <a href="/orders/create" class="btn btn-primary">
            + Create Order
        </a>
    </div>

    <table class="table table-bordered table-hover align-middle">

        <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Customer</th>
            <th>Product</th>
            <th>Quantity</th>
            <th>Total</th>
            <th>Status</th>
            <th width="180">Action</th>
        </tr>
        </thead>

        <tbody>

        <tr>
            <td>1</td>
            <td>Long</td>
            <td>iPhone 16</td>
            <td>2</td>
            <td>$2400</td>

            <td>
                <span class="badge bg-success">
                    Completed
                </span>
            </td>

            <td>

                <a href="/orders/edit?id=1"
                   class="btn btn-warning btn-sm">
                    Edit
                </a>

                <a href="/orders/delete?id=1"
                   class="btn btn-danger btn-sm">
                    Delete
                </a>

            </td>

        </tr>

        <tr>
            <td>2</td>
            <td>Tuấn Anh</td>
            <td>Macbook Air M4</td>
            <td>1</td>
            <td>$1500</td>

            <td>
                <span class="badge bg-primary">
                    Shipping
                </span>
            </td>

            <td>

                <a href="/orders/edit?id=2"
                   class="btn btn-warning btn-sm">
                    Edit
                </a>

                <a href="/orders/delete?id=2"
                   class="btn btn-danger btn-sm">
                    Delete
                </a>

            </td>

        </tr>

        </tbody>

    </table>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>