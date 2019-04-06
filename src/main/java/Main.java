import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogInWindowFXML.fxml"));
            AnchorPane root = fxmlLoader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);

        //List<Animal> animals = new ArrayList<Animal>();
        //List<Worker> workers = new ArrayList<Worker>();

//        animals.add(new Animal(0, "Cat", 127.99));
//        animals.add(new Animal(1, "Dog", 145.99));
//        animals.add(new Animal(2, "Owl", 273.99));
//        animals.add(new Animal(3, "Raccoon", 119.99));
//        animals.add(new Animal(4, "Cat", 127.99));
//        animals.add(new Animal(5, "Dog", 145.99));
//        animals.add(new Animal(6, "Owl", 273.99));
//        animals.add(new Animal(7, "Raccoon", 119.99));
//        animals.add(new Animal(8, "Cat", 127.99));
//        animals.add(new Animal(9, "Dog", 145.99));
//        animals.add(new Animal(10, "Owl", 273.99));
//        animals.add(new Animal(11, "Raccoon", 119.99));
//        animals.add(new Animal(12, "Cat", 127.99));
//        animals.add(new Animal(13, "Dog", 145.99));
//        animals.add(new Animal(14, "Owl", 273.99));
//        animals.add(new Animal(15, "Raccoon", 119.99));

//        workers.add(new Worker(0, "John Smith", "johnsmith", "john012"));
//        workers.add(new Worker(1, "Alex Johnson", "alexjohnson", "alex256j"));
//        workers.add(new Worker(2, "James Gordon", "james1982gordon", "g0304james"));
//        workers.add(new Worker(3, "Mary Rondes", "maryrondes23", "mr2906621rd"));

        //Database.connect();
        //Database.create();

        //As result - executes string INSERT INTO `Workers` (`Name`, `Username`, `Password`) VALUES ('John Smith', 'johnsmith', 'john012');
        //Database.insertData("Workers", new Object[]{"John Smith", "johnsmith", "john012"});
        //As result - executes string INSERT INTO `Animals` (`Type`, `Price`) VALUES ('Cat', 127.99);
        //Database.insertData("Animals", new Object[]{"Cat", 127.99});
        //returns all animals
        //animals = Database.getAnimals(null);
        //or with "where" statement
        //animals = Database.getAnimals("ID = 1");
        //System.out.println(animals.get(0).getType());

        //workers = Database.getWorkers(null);
        //Створюємо чек
        //Database.makeReceipt(animals.get(0).getType(), animals.get(0).getPrice(), workers.get(0).getUsername());

        //Database.close();
    }
}
