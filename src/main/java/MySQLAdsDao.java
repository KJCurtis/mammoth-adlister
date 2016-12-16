import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;




/**
 * Created by KJCurtis on 12/15/16.
 */
public class MySQLAdsDao implements Ads {
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }


    public static void main(String[] args) throws
            SQLException,
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException
    {
        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();

            Connection connection = DriverManager.getConnection(
                    config.getURL,
                    config.getUser,
                    config.getPassword
            );

            // create a statement obj to accept exec statements to perform queries
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("select * From ads");

            List<Ad> ads = new ArrayList<>();

            while (rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("error finding all the ads")
        }

    }
    @Override
    public Long insert(Ad ad) {

    }
}
