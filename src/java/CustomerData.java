
import demo.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class CustomerData {

    private Connection connection = JDBCConnection.getInstance().getConnection();

    public List<Customer> getAllCustomers() {
        List<Customer> allcustomers = new ArrayList<Customer>();

//        String sql = "select * from users";
//
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Customer customer = new Customer();
//                customer.setFirstName(rs.getString("username"));
//                customer.setEmail(rs.getString("email"));
//                customer.setLastName(rs.getString("name"));
//                allcustomers.add(customer);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        Customer d1 = new Customer();
        d1.setLastName("John");
        d1.setFirstName("Mike");
        d1.setEmail("mike@yahoo.com");
        allcustomers.add(d1);

        d1 = new Customer();
        d1.setLastName("James");
        d1.setFirstName("Sean");
        d1.setEmail("James@yahoo.com");
        allcustomers.add(d1);

        d1 = new Customer();
        d1.setLastName("Smith");
        d1.setFirstName("Williams");
        d1.setEmail("Smith@yahoo.com");
        allcustomers.add(d1);

        d1 = new Customer();
        d1.setLastName("Anderson");
        d1.setFirstName("Harris");
        d1.setEmail("Harris@yahoo.com");
        allcustomers.add(d1);

        d1 = new Customer();
        d1.setLastName("Lee");
        d1.setFirstName("Martin");
        d1.setEmail("Martin@yahoo.com");
        allcustomers.add(d1);

        return allcustomers;
    }
}
