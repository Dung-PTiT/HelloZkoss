/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import dao.UserDAO;
import java.util.List;
import model.User;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Footer;
import org.zkoss.zul.Grid;
import org.zkoss.zul.ListModelList;
import repository.UserRepository;

/**
 *
 * @author Dell
 */
public class UserController extends SelectorComposer<Component> {

    private static final long serialVersionUID = 1L;

    private Grid userList;

    private UserDAO userDAO = new UserRepository();

    @Wire
    private Footer footer_category;

    
//    @Override
//    public void doAfterCompose(Component comp) throws Exception {
//        super.doAfterCompose(comp);
//        userList = (Grid) comp;
//        List<User> users = userDAO.getAll();
//        userList.setModel(new ListModelList<>(users));
//        footer_category.setLabel("A Total of " + users.size() + " users");
//    }
    
    @Listen("onClick = #button")
    public void getUser(){
        List<User> users = userDAO.getAll();
        System.out.println("Size: "+ users.size());
    }
}
