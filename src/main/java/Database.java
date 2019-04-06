import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;


public class Database {
    public static Connection conn;
    public static Statement statement;
    public static ResultSet resSet;

    public static void connect() {
        conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Zoo.s3db");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("База Подключена!");
    }

    public static void create() {
        try {
            statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS `Workers` (`ID` INTEGER PRIMARY KEY AUTOINCREMENT,`Name` TEXT,`Username` TEXT UNIQUE,`Password` TEXT );");
            statement.execute("CREATE TABLE IF NOT EXISTS `Animals` (`ID` INTEGER PRIMARY KEY AUTOINCREMENT,`Type` TEXT,`Price` REAL );");
            statement.execute("CREATE TABLE IF NOT EXISTS `Receipts`(`ID` INTEGER PRIMARY KEY AUTOINCREMENT,`Name` TEXT,`Price` REAL,`Date` TEXT,`Seller` TEXT )");
            Database.insertData("Workers", new Object[]{"John Smith", "johnsmith", "john012"});
            Database.insertData("Animals", new Object[]{"Cat", 156.12});
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Таблица создана или уже существует.");
    }

    public static List<Animal> getAnimals(String statement) {
        List<Animal> animals = new ArrayList<Animal>();
        String query = "SELECT * FROM Animals";
        if (statement != null)
            query += " WHERE " + statement;
        try {
            resSet = Database.statement.executeQuery(query);

            while (resSet.next()) {
                int id = resSet.getInt("ID");
                String name = resSet.getString("Type");
                double price = resSet.getDouble("Price");
//                System.out.println("ID: " + id);
//                System.out.println("Type: " + name);
//                System.out.println("Price: " + price);
                animals.add(new Animal(id, name, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animals;
    }

    public static List<Worker> getWorkers(String statement) {
        List<Worker> workers = new ArrayList<Worker>();
        String query = "SELECT * FROM Workers";
        if (statement != null)
            query += "WHERE " + statement;
        try {
            resSet = Database.statement.executeQuery(query);

            while (resSet.next()) {
                int id = resSet.getInt("ID");
                String name = resSet.getString("Name");
                String username = resSet.getString("Username");
                String password = resSet.getString("Password");
//            System.out.println("ID: " + id);
//            System.out.println("Name: " + name);
//            System.out.println("Username: " + username);
//            System.out.println("Password: " + password);
                workers.add(new Worker(id, name, username, password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return workers;
    }

    public static void makeReceipt(String name, double price, String sellerUsername) {
        //`Name`, `Price`, `Date`, `Seller`
        insertData("Receipts", new Object[]{name, price, new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime()), sellerUsername});
    }

    private static Map valuesTable = new HashMap() {{
        put("Animals", "`Type`, `Price`");
        put("Workers", "`Name`, `Username`, `Password`");
        put("Receipts", "`Name`, `Price`, `Date`, `Seller`");
    }};

    public static void insertData(String tableName, Object[] values) {
        String strValues = "";
        for (Object value : values) {
            if (value instanceof String)
                strValues += ", '" + value.toString() + "'";
            else
                strValues += ", " + value.toString();
        }
        strValues = strValues.replaceFirst(", ", "");
//        System.out.println(strValues);
        try {
            statement.execute/*System.out.println*/(String.format("INSERT INTO `%s` (%s) VALUES (%s); ", tableName, valuesTable.get(tableName), strValues));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleteWorker(String workerUsername) {
        try {
            statement.execute(String.format("DELETE FROM `Workers` WHERE Username = %s;", workerUsername));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAnimal(int id) {
        try {
            statement.execute(String.format("DELETE FROM `Animals` WHERE ID = %d;", id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //statement if null returns * else appends after statement "where"
//    public static Object getTableData(String tableName,String statement) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
//        resSet = statement.executeQuery("SELECT * FROM users");
//        List<Object> objectsData = new ArrayList<Object>();
//
//        while(resSet.next())
//        {
//            resSet.getMetaData().getColumnCount();
//            int id = resSet.getInt("id");
//            String  name = resSet.getString("name");
//            System.out.println( "ID = " + id );
//            System.out.println( "name = " + name );
//            objectsData.add(Class.forName(tableName).newInstance());
//        }
//
//        System.out.println("Таблица выведена");
//        return null;
//    }

    public static void close() {
        try {
            conn.close();

            statement.close();
            resSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Соединения закрыты");
    }
}
