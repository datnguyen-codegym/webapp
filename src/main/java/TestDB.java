import config.DatabaseConnection;

import java.sql.Connection;

public class TestDB {

    public static void main(String[] args) {

        try {

            Connection connection =
                    DatabaseConnection.getConnection();

            System.out.println("KẾT NỐI DATABASE THÀNH CÔNG!");

            connection.close();

        } catch (Exception e) {

            System.out.println("KẾT NỐI DATABASE THẤT BẠI!");

            e.printStackTrace();
        }
    }
}