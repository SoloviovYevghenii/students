import java.sql.*;

public class InsertDataWithJava {

    public static void main(String[] args) {
        // Підключення до бази даних
        String jdbcURL = "jdbc:postgresql://localhost:5433/test";
        String username = "postgres";
        String password = "12345";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
//            // Додавання записів до таблиць (приклад для Customer і Order)
//            // Додайте аналогічний код для інших таблиць, якщо необхідно

            // Додавання записів до таблиці Customer
            String insertCustomerSQL = "INSERT INTO Customer (name, email) VALUES (?, ?)";
            PreparedStatement insertCustomerStatement = connection.prepareStatement(insertCustomerSQL);
            insertCustomerStatement.setString(1, "Customer 1");
            insertCustomerStatement.setString(2, "customer1@example.com");
            insertCustomerStatement.executeUpdate();

            // Додавання записів до таблиці Order
            String insertOrderSQL = "INSERT INTO Orders (customer_id, order_date) VALUES (?, ?)";
            PreparedStatement insertOrderStatement = connection.prepareStatement(insertOrderSQL);
            insertOrderStatement.setInt(1, 1); // Припустимо, що це перший клієнт

            insertOrderStatement.setString(2,"2023-10-09"); // Приклад дати
            insertOrderStatement.executeUpdate();

            // Додавання записів до таблиці OrderDetails
            String insertOrderDetailsSQL = "INSERT INTO OrderDetails (order_id, product_name, quantity, price) VALUES (?, ?, ?, ?)";

            PreparedStatement insertOrderDetailsStatement = connection.prepareStatement(insertOrderDetailsSQL);
            insertOrderDetailsStatement.setInt(1, 1); // Припустимо, що це ID замовлення
            insertOrderDetailsStatement.setString(2, "Продукт 1");
            insertOrderDetailsStatement.setInt(3, 3); // Кількість
            insertOrderDetailsStatement.setDouble(4, 10.00); // Ціна

            PreparedStatement insertOrderDetailsStatement2 = connection.prepareStatement(insertOrderDetailsSQL);
            insertOrderDetailsStatement2.setInt(1, 2); // Припустимо, що це ID замовлення
            insertOrderDetailsStatement2.setString(2, "Продукт 2");
            insertOrderDetailsStatement2.setInt(3, 7); // Кількість
            insertOrderDetailsStatement2.setDouble(4, 25.00); // Ціна

            insertOrderDetailsStatement.executeUpdate();
            insertOrderDetailsStatement2.executeUpdate();

            // Додавання записів до таблиці CustomerDetails
            String insertCustomerDetailsSQL = "INSERT INTO CustomerDetails (id, customer_id, address, phone_number) VALUES (?, ?, ?, ?)";

            PreparedStatement insertCustomerDetailsStatement = connection.prepareStatement(insertCustomerDetailsSQL);
            insertCustomerDetailsStatement.setInt(1, 1); // Припустимо, що це ID замовлення
            insertCustomerDetailsStatement.setInt(2, 1);
            insertCustomerDetailsStatement.setString(3, "first"); // Кількість
            insertCustomerDetailsStatement.setString(4, "5656"); // Ціна

            PreparedStatement insertCustomerDetailsStatement2 = connection.prepareStatement(insertCustomerDetailsSQL);
            insertCustomerDetailsStatement2.setInt(1, 2); // Припустимо, що це ID замовлення
            insertCustomerDetailsStatement2.setInt(2, 2);
            insertCustomerDetailsStatement2.setString(3, "second"); // Кількість
            insertCustomerDetailsStatement2.setString(4, "3232"); // Ціна

            insertCustomerDetailsStatement.executeUpdate();
            insertCustomerDetailsStatement2.executeUpdate();



        // Додавання записів до таблиці Cart
            String insertCartDetailsSQL = "INSERT INTO Cart (id, customer_id, product_name, quantity, price) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement insertCartStatement = connection.prepareStatement(insertCartDetailsSQL);
            insertCartStatement.setInt(1, 1); // Припустимо, що це ID замовлення
            insertCartStatement.setInt(2, 1);
            insertCartStatement.setString(3, "first"); // Кількість
            insertCartStatement.setInt(4, 5); // Ціна
            insertCartStatement.setDouble(5, 23.5); // Ціна
//
            PreparedStatement insertCartStatement2 = connection.prepareStatement(insertCartDetailsSQL);
            insertCartStatement2.setInt(1, 2); // Припустимо, що це ID замовлення
            insertCartStatement2.setInt(2, 2);
            insertCartStatement2.setString(3, "second"); // Кількість
            insertCartStatement2.setInt(4, 4); // Ціна
            insertCartStatement2.setDouble( 5, 23.4); // Ціна

            insertCartStatement.executeUpdate();
            insertCartStatement2.executeUpdate();

            System.out.println("Записи додані до таблиць успішно!");



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

