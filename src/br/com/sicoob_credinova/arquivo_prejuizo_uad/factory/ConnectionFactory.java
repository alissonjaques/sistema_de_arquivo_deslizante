package br.com.sicoob_credinova.arquivo_prejuizo_uad.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory {

    public static Connection con;

    public ConnectionFactory() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://192.168.0.234:/credinova_arquivo_prejuizo";
            String user = "root";
            String password = "hertz@1636";
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
