package lk.ijsc.dep.court.db;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static DBConnection dbConnection;
    private static Connection connection;


    private DBConnection() throws SQLException, IOException {

        Properties dbProp = new Properties();
        File file = new File("Resource/application.properties");
        FileReader fileReader = new FileReader(file);

        dbProp.load(fileReader);

        String ip = dbProp.getProperty("ip");
        String port = dbProp.getProperty("port");
        String db = dbProp.getProperty("db");
        String user_name = dbProp.getProperty("username");
        String password = dbProp.getProperty("password");

        String url="jdbc:mysql://"+ip+":"+port+"/"+db;
        connection= DriverManager.getConnection(url,user_name,password);

        // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SRS", "root", "1234");
    }

    public static DBConnection getInstance() throws SQLException, IOException {
        if (dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }

    public static Connection getConnection(){
        return connection;
    }
}
