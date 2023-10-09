import java.sql.*;

public class GetOrdersForCustomer {

    public static void main(String[] args) {
        // Підключення до бази даних
        String jdbcURL = "jdbc:postgresql://localhost:5433/test";
        String username = "postgres";
        String password = "12345";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            // ID кастомера, для якого потрібно отримати замовлення
            int customerId = 1;

            String getOrdersForCustomerSQL = "SELECT * FROM Orders WHERE customer_id = ?";
            PreparedStatement getOrdersForCustomerStatement = connection.prepareStatement(getOrdersForCustomerSQL);
            getOrdersForCustomerStatement.setInt(1, customerId);

            ResultSet resultSet = getOrdersForCustomerStatement.executeQuery();

            while (resultSet.next()) {
                int orderId = resultSet.getInt("id");
                String orderDate = resultSet.getString("order_date");
                System.out.println("Замовлення ID: " + orderId + ", Дата замовлення: " + orderDate);
            }

            // Отримати всі замовлення із деталями для одного кастомера.
            int customerId_2 = 1;

            // SQL-запит для отримання всіх замовлень із деталями для конкретного кастомера
            String sql = "SELECT O.*, OD.* " +
                    "FROM Orders O " +
                    "JOIN OrderDetails OD ON O.id = OD.order_id " +
                    "WHERE O.customer_id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, customerId_2);

            ResultSet resultSetOrder  = preparedStatement.executeQuery();
            while (resultSetOrder.next()) {
                int orderId = resultSetOrder.getInt("id");
                String orderDate = resultSetOrder.getString("order_date");

                int orderDetailId = resultSetOrder.getInt("customer_id");

                String product = resultSetOrder.getString("product_name");

                int quantity = resultSetOrder.getInt("quantity");
                double price = resultSetOrder.getDouble("price");

                System.out.println("Замовлення ID: " + orderId);
                System.out.println("Дата замовлення: " + orderDate);
                System.out.println("Деталі замовлення ID: " + orderDetailId);
                System.out.println("Продукт: " + product);

                System.out.println("Кількість: " + quantity);
                System.out.println ("Ціна: " + price);
                System.out.println( "---------------------------");

            }

//    Отримати всі замовлення для всіх кастомерів.

            String sqlCustomer = "SELECT C.id AS customer_id, C.name AS customer_name, COUNT(O.id) AS order_count " +
                    "FROM  Customer C " +
                    "JOIN Orders O ON C.id = O.customer_id " +
                    "GROUP BY C.id, C.name " +
                    "ORDER BY customer_id";
            PreparedStatement preparedStatementCustomer = connection.prepareStatement(sqlCustomer);

            ResultSet resultSetCustomer = preparedStatementCustomer.executeQuery();

            while (resultSetCustomer.next()) {
                int custId = resultSetCustomer.getInt("customer_id");
                String customerName = resultSetCustomer.getString("customer_name");
                int orderCount = resultSetCustomer.getInt("order_count");

                System.out.println("ID кастомера: " + custId);
                System.out.println("Ім'я кастомера: " + customerName);
                System.out.println("Кількість замовлень: " + orderCount);
                System.out.println("---------------------------");

            }

            // clear table Cart
            String clearTable = "TRUNCATE Cart";
            PreparedStatement preparedStatementClearCart = connection.prepareStatement(clearTable);

            preparedStatementClearCart.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

