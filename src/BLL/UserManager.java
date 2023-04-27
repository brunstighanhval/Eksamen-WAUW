package BLL;

import java.io.IOException;
import java.util.List;

public class UserManager {

    private main.java.DAL.IUserDataAccess userDAO;

    public UserManager() throws IOException {userDAO = new main.java.DAL.UserDAO();}

    public List<main.java.BE.User> loadUser(String name) throws Exception{return userDAO.loadUser(name);}

    public List<main.java.BE.User> loadTechnicians() throws Exception{return userDAO.loadTechnicians();}

    public main.java.BE.User createNewUser(String firstName, String lastName, String username, String password, int role) throws Exception {return userDAO.createNewUser(firstName, lastName, username, password, role);}

    public void deleteUser(main.java.BE.User selectedUser) throws Exception {userDAO.deleteUser(selectedUser);}

    public boolean validateUsername(String username) throws Exception{return userDAO.validateUsername(username);}





}
