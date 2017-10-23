package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.sesion;
import util.Dbutil;



public class DAO {

    private static Connection connection;

    public DAO() throws SQLException {
        connection = Dbutil.getConnection();
    }

    public boolean capturar(sesion ses) throws SQLException {
        boolean result = false;
        Connection connection = Dbutil.getConnection();
        String query = "insert into sesion (nombre,contraseña) values (?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, ses.getUsuario());
            preparedStmt.setString(2, ses.getContraseña());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}