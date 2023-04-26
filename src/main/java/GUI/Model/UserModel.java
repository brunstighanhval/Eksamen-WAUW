package GUI.Model;

import BLL.UserManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class UserModel {

    private ObservableList<main.java.BE.User> allTechnicians;
    private UserManager userManager;
    private main.java.BE.User user;
    private main.java.BE.User createdUser;

    public UserModel() throws Exception {
        userManager = new UserManager();
        allTechnicians = FXCollections.observableArrayList();
        allTechnicians.addAll(userManager.loadTechnicians());
        System.out.println(allTechnicians.size());
    }

    public List<main.java.BE.User> loadUser(String name)throws Exception{return userManager.loadUser(name);}

    public ObservableList<main.java.BE.User> getAllTechnicians() {return allTechnicians;}

    public boolean validateUsername(String username) throws Exception{return userManager.validateUsername(username);}

    public void createNewUser(String firstName, String lastName, String username, String password, int role) throws Exception {
        createdUser =  userManager.createNewUser(firstName, lastName, username, password, role);
        allTechnicians.add(createdUser);
        allTechnicians.clear();
        allTechnicians.addAll(userManager.loadTechnicians());
    }

    public main.java.BE.User getLoggedinUser(){return user;}

    public void setLoggedinUser(main.java.BE.User user){
        this.user = user;
    }

    public void deleteUser(main.java.BE.User selectedKoordinator) throws Exception {
        userManager.deleteUser(selectedKoordinator);
        allTechnicians.remove(selectedKoordinator);
    }


}

