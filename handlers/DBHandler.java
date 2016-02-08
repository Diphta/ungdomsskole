/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tanja
 */
public class DBHandler {
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String pswrd = "root";
    String schema = "/UngdomsskoleNaestved";
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    Connection conn;
    private DBHandler() {
        try {
            connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DBHandler getInstance() {
        return DBHandlerHolder.INSTANCE;
    }
    
    private static class DBHandlerHolder {

        private static final DBHandler INSTANCE = new DBHandler();
    }
    
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(url + schema, user, pswrd);
}
}
