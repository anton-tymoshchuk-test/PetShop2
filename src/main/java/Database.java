import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Database {
    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    public static void Conn() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:Zoo.s3db");

        System.out.println("База Подключена!");
    }

    public static void CreateDB() throws SQLException {
        statmt = conn.createStatement();

        statmt.execute("CREATE TABLE IF NOT EXISTS `Workers` ( `ID` INTEGER PRIMARY KEY AUTOINCREMENT, `Name` TEXT, `Username` TEXT, `Password` TEXT )");
        statmt.execute("CREATE TABLE IF NOT EXISTS `Animals` ( `ID` INTEGER PRIMARY KEY AUTOINCREMENT, `Type` TEXT, ` Price` REAL )");

        System.out.println("Таблица создана или уже существует.");
    }

    public static void WriteDB() throws SQLException {
        statmt.execute("INSERT INTO 'Animals' ('Type', 'Price') VALUES ('Monkey', 512.55); ");

        System.out.println("Таблица заполнена");
    }

    public static List<Animal> getAnimals(String statement) throws SQLException {
        List<Animal> animals = new ArrayList<Animal>();
        String query = "SELECT * FROM Animals";
        if (statement != null)
            query += "WHERE " + statement;
        resSet = statmt.executeQuery(query);
        while (resSet.next()) {
            int id = resSet.getInt("ID");
            String name = resSet.getString("Name");
            double price = resSet.getDouble("Price");
            System.out.println("ID = " + id);
            System.out.println("Name = " + name);
            System.out.println("Price = " + price);
            animals.add(new Animal(id, name, price));
        }
        return animals;
    }

    public static List<Worker> getWorkers(String statement) throws SQLException {
        List<Worker> workers = new ArrayList<Worker>();
        String query = "SELECT * FROM Workers";
        if (statement != null)
            query += "WHERE " + statement;
        resSet = statmt.executeQuery(query);
        while (resSet.next()) {
            int id = resSet.getInt("ID");
            String name = resSet.getString("Name");
            String username = resSet.getString("Username");
            String password = resSet.getString("Password");
            System.out.println("ID = " + id);
            System.out.println("Name = " + name);
            System.out.println("Username = " + username);
            System.out.println("Password = " + password);
            workers.add(new Worker(id, name, username, password));
        }
        return workers;
    }

    public static void insertData(String tableName, Object[] values) {
        String strValues = "";
        for (Object value : values) {
            strValues += ", " + value;
        }
        strValues = strValues.replaceFirst(", ", "");
        System.out.println(strValues);
//        statmt.execute("INSERT INTO 'Animals' ('Type', 'Price') VALUES ('Monkey', 512.55); ")
    }
    //statement if null returns * else appends after statement "where"
//    public static Object getTableData(String tableName,String statement) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
//        resSet = statmt.executeQuery("SELECT * FROM users");
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

    public static void CloseDB() throws SQLException {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }
}
