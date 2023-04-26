package GUI.Controller;

import GUI.Model.UserModel;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import org.mindrot.jbcrypt.BCrypt;

public class MainController extends BaseController{
    public Button btnCreateNewUser;
    private UserModel userModel;

    @Override
    public void setup() throws Exception {
        userModel = getModel().getUserModel();

    }


    public void handleCreateNewUser(ActionEvent actionEvent) {
        try {
            //Binding all the data to the variables.
            //String firstName = txtfFirstName.getText();
            //String lastName = txtfLastName.getText();
            //String username = txtfUsername.getText();
            //String password = txtfPassword.getText();
            String firstName = "Kasper";
            String lastName = "Tell";
            String username = "2";
            String password = "2";
            String salt = BCrypt.gensalt(12);
            password = BCrypt.hashpw(password, salt);
            int role = 1;

            //Sending the variables to the model.
            userModel.createNewUser(firstName, lastName, username, password, role);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
