package demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class JDBCConnection {

    private final String HOST = "localhost";
    private final String USERNAME = "root";
    private final String PASSWORD = "12345";
    private final String DATABASE = "newlifesystem";
    private final String PORT = "3306";
    private final String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private final String URL = String.format("jdbc:mysql://%s:%s/%s", HOST, PORT, DATABASE);

    private Connection connection = null;

    private JDBCConnection() {
        try {
            Class.forName(CLASSNAME);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static JDBCConnection getInstance() {
        return JDBCConnectionProviderHolder.INSTANCE;
    }

    private static class JDBCConnectionProviderHolder {

        private static final JDBCConnection INSTANCE = new JDBCConnection();
    }

    public static void main(String[] args) {
        Connection connection = JDBCConnection.getInstance().getConnection();
        if (connection != null) {
            List<User> listUsers = new ArrayList<>();
            String sql = "select * from users";

            try {
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("user_id"));
                    user.setUsername(rs.getString("username"));
                    user.setName(rs.getString("name"));
                    user.setPhoneNumber(rs.getString("phone_number"));
                    user.setAddress(rs.getString("address"));
                    user.setEmail(rs.getString("email"));
                    user.setRole(rs.getString("role"));
                    listUsers.add(user);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            for (User user : listUsers) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("That bai");
        }
    }
}
