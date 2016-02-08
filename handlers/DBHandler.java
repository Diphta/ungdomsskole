/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

/**
 *
 * @author Tanja
 */
public class DBHandler {
    
    private DBHandler() {
    }
    
    public static DBHandler getInstance() {
        return DBHandlerHolder.INSTANCE;
    }
    
    private static class DBHandlerHolder {

        private static final DBHandler INSTANCE = new DBHandler();
    }
}
