import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainMenu {

    private ArrayList<Label> names = new ArrayList<Label>();
    private ArrayList<Label> prices = new ArrayList<Label>();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addUser;

    @FXML
    private Button resetUser;

    @FXML
    private Label name1;

    @FXML
    private Label price1;

    @FXML
    private Button button1;

    @FXML
    private Label name2;

    @FXML
    private Label price2;

    @FXML
    private Button button2;

    @FXML
    private Label name3;

    @FXML
    private Label price3;

    @FXML
    private Button button3;

    @FXML
    private Label name4;

    @FXML
    private Label price4;

    @FXML
    private Button button4;

    @FXML
    private Label name5;

    @FXML
    private Label price5;

    @FXML
    private Button button5;

    @FXML
    private Label name6;

    @FXML
    private Label price6;

    @FXML
    private Button button6;

    @FXML
    void addUser(MouseEvent event) {
        AppState.addNextWorker = true;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogInWindowFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage logInWindow = new Stage();
            logInWindow.setScene(scene);
            logInWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void buyClick1(MouseEvent event) {
        //Database delete animal

        AppState.checkNumber++;
        AppState.productName = name1.getText();
        AppState.price = Double.valueOf(price1.getText());

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CheckFormFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage checkWindow = new Stage();
            checkWindow.setScene(scene);
            checkWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void buyClick2(MouseEvent event) {
        //Database delete animal

        AppState.checkNumber++;
        AppState.productName = name2.getText();
        AppState.price = Double.valueOf(price2.getText());

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CheckFormFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage checkWindow = new Stage();
            checkWindow.setScene(scene);
            checkWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void buyClick3(MouseEvent event) {
        //Database delete animal

        AppState.checkNumber++;
        AppState.productName = name3.getText();
        AppState.price = Double.valueOf(price3.getText());

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CheckFormFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage checkWindow = new Stage();
            checkWindow.setScene(scene);
            checkWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void buyClick4(MouseEvent event) {
        //Database delete animal

        AppState.checkNumber++;
        AppState.productName = name4.getText();
        AppState.price = Double.valueOf(price4.getText());

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CheckFormFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage checkWindow = new Stage();
            checkWindow.setScene(scene);
            checkWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void buyClick5(MouseEvent event) {
        //Database delete animal

        AppState.checkNumber++;
        AppState.productName = name5.getText();
        AppState.price = Double.valueOf(price5.getText());

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CheckFormFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage checkWindow = new Stage();
            checkWindow.setScene(scene);
            checkWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void buyClick6(MouseEvent event) {
        //Database delete animal

        AppState.checkNumber++;
        AppState.productName = name6.getText();
        AppState.price = Double.valueOf(price6.getText());

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CheckFormFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage checkWindow = new Stage();
            checkWindow.setScene(scene);
            checkWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void resetUser(MouseEvent event) {
        AppState.addNextWorker = false;
        AppState.deleteWorker = true;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogInWindowFXML.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage logInWindow = new Stage();
            logInWindow.setScene(scene);
            logInWindow.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert addUser != null : "fx:id=\"addUser\" was not injected: check your FXML file 'Untitled'.";
        assert resetUser != null : "fx:id=\"resetUser\" was not injected: check your FXML file 'Untitled'.";
        assert name1 != null : "fx:id=\"name1\" was not injected: check your FXML file 'Untitled'.";
        assert price1 != null : "fx:id=\"price1\" was not injected: check your FXML file 'Untitled'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'Untitled'.";
        assert name2 != null : "fx:id=\"name2\" was not injected: check your FXML file 'Untitled'.";
        assert price2 != null : "fx:id=\"price2\" was not injected: check your FXML file 'Untitled'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'Untitled'.";
        assert name3 != null : "fx:id=\"name3\" was not injected: check your FXML file 'Untitled'.";
        assert price3 != null : "fx:id=\"price3\" was not injected: check your FXML file 'Untitled'.";
        assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'Untitled'.";
        assert name4 != null : "fx:id=\"name4\" was not injected: check your FXML file 'Untitled'.";
        assert price4 != null : "fx:id=\"price4\" was not injected: check your FXML file 'Untitled'.";
        assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'Untitled'.";
        assert name5 != null : "fx:id=\"name5\" was not injected: check your FXML file 'Untitled'.";
        assert price5 != null : "fx:id=\"price5\" was not injected: check your FXML file 'Untitled'.";
        assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file 'Untitled'.";
        assert name6 != null : "fx:id=\"name6\" was not injected: check your FXML file 'Untitled'.";
        assert price6 != null : "fx:id=\"price6\" was not injected: check your FXML file 'Untitled'.";
        assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file 'Untitled'.";

        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);
        names.add(name6);

        prices.add(price1);
        prices.add(price2);
        prices.add(price3);
        prices.add(price4);
        prices.add(price5);
        prices.add(price6);

        Database.connect();
        Database.create();

        List<Animal> animals = Database.getAnimals(null);
        for (int i = 0; i < 6; i++) {
            names.get(i).setText(animals.get(i).getType());
            prices.get(i).setText((String.valueOf(animals.get(i).getPrice())));
        }
        Database.close();

        AppState.logInWindow.close();
    }
}
