package br.com.aj_sistemas.novo_sgad.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory {

    public static Connection con;

    public ConnectionFactory() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:/arquivo_deslizante";
            String user = "root";
            String password = "mundo";
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
