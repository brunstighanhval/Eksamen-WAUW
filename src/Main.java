import GUI.Controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GUI/View/LoginView.fxml"));
        Parent root = loader.load();

        LoginController controller = loader.getController();
        controller.setup();

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Login page");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
