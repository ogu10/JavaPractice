package Test2_managementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql {

    static final String URL = "jdbc:mysql://localhost/jobins";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                Statement statement = connection.createStatement();
        ) {

            String sql = "INSERT INTO passwords VALUES (2, 'Michael Jackson', 2001);";
            int result = statement.executeUpdate(sql);
            System.out.println("結果１：" + result);

            sql = "INSERT INTO passwords VALUES (3, 'Aril Brikha', 1998);";
            result = statement.executeUpdate(sql);
            System.out.println("結果２：" + result);

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}