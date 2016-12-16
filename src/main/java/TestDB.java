

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * Created by KJCurtis on 12/16/16.
 */
class TestDB {
    protected static void main(String[] args) throws
            SQLException,
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException
    {


        DriverManager.registerDriver(new Driver());

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/mysql",
                "root",
                "codeup"
        );

        // create a statement obj to accept exec statements to perform queries
        Statement stmt = connection.createStatement();

        try {
            stmt.execute("create database usersDB");

        } catch (SQLException e) {
            System.out.println("userDB database already exists");
        }



    }
}
