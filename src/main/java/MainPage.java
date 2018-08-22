import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class MainPage {

    public AnchorPane anchorPane;
    public TextArea NameBox;

    public TextArea Summary;

    public TextArea BirthBox;

    public Label NameLabel;

    public TextArea Othertext;


    public Button selectPage;
    public Button generatePage;

    public void selectPage(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) selectPage.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("/view/SelectPAge.fxml"));
        Parent root2 = fxmlLoader2.load();
        Scene scene2 = new Scene(root2);
        stage.setScene(scene2);
    }
    public void generatePage(MouseEvent mouseEvent) {
    }
}
