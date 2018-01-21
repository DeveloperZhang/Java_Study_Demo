package JDBC;

import java.sql.*;

public class JDBCTest {
    public static void test(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/java_study","root","111111");
            Statement statement = connection.createStatement();

            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO insert_test VALUES (5,?)");
            pstmt.setString(1,"aa5");
            pstmt.executeUpdate();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM insert_test ;");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
