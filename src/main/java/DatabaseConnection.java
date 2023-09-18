import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static Connection connection;

    public  Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:postgresql://localhost:5433/test";
                String username = "postgres";
                String password = "12345";
                connection = DriverManager.getConnection(url, username, password);

                Statement statement = connection.createStatement();

                // SQL-запит для створення таблиці
                String createTableCustomer = "CREATE TABLE IF NOT EXISTS customer (" +
                        "id SERIAL PRIMARY KEY," +
                        "username TEXT NOT NULL," +
                        "email TEXT NOT NULL" +
                        ");";
                statement.execute(createTableCustomer);

//                -- Створення таблиці CustomerDetails
                String createTableCustomerDetails = "CREATE TABLE IF NOT EXISTS customer_details (" +
                        "id SERIAL PRIMARY KEY," +
                        "email VARCHAR(255)," +
                        "address VARCHAR(255)," +
                        "FOREIGN KEY (id) REFERENCES customer(id)" +
                        ");";

                statement.execute(createTableCustomerDetails);

                      // SQL-запит для створення таблиці
                String createTableOrder = "CREATE TABLE IF NOT EXISTS 'order' (" +
                        "id SERIAL PRIMARY KEY," +
                        "username TEXT NOT NULL," +
                        "email TEXT NOT NULL" +
                        ");";
                statement.execute(createTableOrder);

                String createTableOrderDetails =  "CREATE TABLE  IF NOT EXISTS order_details (" +
                        "id SERIAL PRIMARY KEY," +
                        "id INT," +
                        "productId INT," +
                        "quantity INT," +
                        "FOREIGN KEY (id) REFERENCES order (id)" +
                         ");";
                statement.execute(createTableOrderDetails);



                // Закриття з'єднання та інших ресурсів
                statement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

