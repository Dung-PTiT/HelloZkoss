/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import dao.UserDAO;
import demo.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Dell
 */
public class UserRepository implements UserDAO {

    private Connection connection = JDBCConnection.getInstance().getConnection();

    @Override
    public List<User> getAll() {
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
        return listUsers;
    }

}
