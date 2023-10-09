import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

        public static void main(String[] args) {
            // Підключення до бази даних
            String jdbcURL = "jdbc:postgresql://localhost:5433/test";
            String username = "postgres";
            String password = "12345";

            try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
                // Створення таблиць
                Statement statement = connection.createStatement();

                // Таблиця Customer
                statement.execute("CREATE TABLE Customer (" +
                        "id SERIAL PRIMARY KEY ," +
                        "name VARCHAR(255)," +
                        "email VARCHAR(255))");

                // Таблиця Orders
                statement.execute("CREATE TABLE Orders (" +
                        "id SERIAL PRIMARY KEY ," +
                        "customer_id INT," +
                        "order_date timestamp," +
                        "FOREIGN KEY (customer_id) REFERENCES Customer(id))");

                // Таблиця CustomerDetails (якщо необхідно)
                statement.execute("CREATE TABLE CustomerDetails (" +
                        "id SERIAL PRIMARY KEY ," +
                        "customer_id INT," +
                        "address VARCHAR(255)," +
                        "phone_number VARCHAR(15)," +
                        "FOREIGN KEY (customer_id) REFERENCES Customer(id))");

                // Таблиця OrderDetails (якщо необхідно)
                statement.execute("CREATE TABLE OrderDetails (" +
                        "id SERIAL PRIMARY KEY ," +
                        "order_id INT," +
                        "product_name VARCHAR(255)," +
                        "quantity INT," +
                        "price DECIMAL(10, 2)," +
                        "FOREIGN KEY (order_id) REFERENCES Orders(id))");

                // Таблиця Cart (якщо необхідно)
                statement.execute("CREATE TABLE Cart (" +
                        "id SERIAL PRIMARY KEY ," +
                        "customer_id INT," +
                        "product_name VARCHAR(255)," +
                        "quantity INT," +
                        "price DECIMAL(10, 2)," +
                        "FOREIGN KEY (customer_id) REFERENCES Customer(id))");

                System.out.println("Таблиці створені успішно!");





            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




