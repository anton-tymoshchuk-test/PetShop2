import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogIn {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField logInText;

    @FXML
    private TextField passwordText;

    @FXML
    void ButtonOKClick(MouseEvent event) {
        Database.connect();
        Database.create();
        List<Worker> workers = Database.getWorkers(null);

        if (AppState.addNextWorker == true) {
            Database.insertData("Workers", new Object[]{logInText.getText(), logInText.getText(), passwordText.getText()});
            AppState.logInWindow.close();
        }
        else if (AppState.deleteWorker==true)
        {

        }
        else {
            if (!workers.isEmpty()) {
                for (int i = 0; i < workers.size(); i++) {
                    if (workers.get(i).getUsername().equals(logInText.getText())) {
                        if (workers.get(i).getPassword().equals(passwordText.getText())) {
                            try {
                                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenuFXML.fxml"));
                                AnchorPane anchorPane = fxmlLoader.load();
                                Scene scene = new Scene(anchorPane);
                                Stage mainMenuWindow = new Stage();
                                mainMenuWindow.setScene(scene);
                                mainMenuWindow.show();

                                AppState.mainMenuWindow = mainMenuWindow;
                                AppState.mainMenuShown = true;
                                AppState.addNextWorker = true;
                            } catch (Exception exception) {
                                exception.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        Database.close();
    }

    @FXML
    void initialize() {
        assert logInText != null : "fx:id=\"logInText\" was not injected: check your FXML file 'Untitled'.";
        assert passwordText != null : "fx:id=\"passwordText\" was not injected: check your FXML file 'Untitled'.";

    }
}
