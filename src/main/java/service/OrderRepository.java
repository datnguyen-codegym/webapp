package service;



import config.DatabaseConnection;
import model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    public List<Order> findAll() {

        List<Order> orders = new ArrayList<>();

        String sql = """
                SELECT id,
                       customer_name,
                       product_name,
                       quantity,
                       total,
                       status
                FROM orders
                """;

        try (
                Connection connection =
                        DatabaseConnection.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql);

                ResultSet resultSet =
                        statement.executeQuery()
        ) {

            while (resultSet.next()) {

                Order order = new Order();

                order.setId(
                        resultSet.getInt("id")
                );

                order.setCustomerName(
                        resultSet.getString("customer_name")
                );

                order.setProductName(
                        resultSet.getString("product_name")
                );

                order.setQuantity(
                        resultSet.getInt("quantity")
                );

                order.setTotal(
                        resultSet.getDouble("total")
                );

                order.setStatus(
                        resultSet.getString("status")
                );

                orders.add(order);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return orders;
    }
}