package database;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabaseTwo {
    public static Properties loadProperties() throws IOException {
        File file = new File("C:\\Users\\Fatema Akter\\module02test\\information.properties");
        FileReader fileReader = new FileReader(file);
        Properties properties = new Properties();
        properties.load(fileReader);
        return properties;
    }

    public static void connetWithDB() throws SQLException, IOException {
        String username = loadProperties().getProperty("userName");
        String password = loadProperties().getProperty("password");

        //need a url to connet, databae have a api to connct, we use host is local in port 5432
        //protocol  as https, port as 443

        //String url ="jdbc:postgresql://host:port/database"
        String url = loadProperties().getProperty("url.dvdrental");
        String query ="SELECT first_name FROM public.actor limit 20";

        //we need a jar file to work with Sql and database as we used for testing , we added dependecieds in to pom file
        //1st create connection object
        Connection connection = DriverManager.getConnection(url, username, password);
        //we need to prepare our query now. so i create a statement object.
        //2nd create statement object
        Statement statement = connection.createStatement();
        // by statemnet object execute the query
        // statement.executeQuery(query); //this like click enter button
        ResultSet resultSet = statement.executeQuery(query);

        //now process the result
        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name"));
        }
    }

    public static void main(String[] args) throws SQLException, IOException {
        connetWithDB();
    }
}
