package PersonsTypes;

public class Technician implements IPersonTypes{

    @Override
    public String getViewString() {
        return "/main/java/GUI/View/technician/TechView.fxml";
    }
}
