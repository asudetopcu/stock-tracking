package core;

import interfaces.CoreInterfaces;

import java.sql.Connection;
import java.sql.DriverManager;

public class ObjectHelper extends CoreFields implements CoreInterfaces {

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    @Override
    public Connection getConnection() {

        Connection connection = null;
        connection = DriverManager.getConnection(url);

        return null;
    }
}
