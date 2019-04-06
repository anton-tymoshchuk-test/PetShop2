import javafx.stage.Stage;

public abstract class AppState {
    public static Stage logInWindow;
    public static Stage mainMenuWindow;
    public static Stage checkWindow;
    public static boolean addNextWorker = false;
    public static boolean deleteWorker = false;
    public static boolean mainMenuShown = false;
    public static String currentWorkerName;
    public static int checkNumber = 0;
    public static String productName;
    public static double price;
}
