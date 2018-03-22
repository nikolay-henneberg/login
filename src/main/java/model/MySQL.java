package model;

import java.sql.*;

public class MySQL {
    private String host;
    private String table;
    private String user;
    private String password;

    private Connection connection;

    public MySQL(String host, String table, String user, String password) {
        this.host = host;
        this.table = table;
        this.user = user;
        this.password = password;
    }

    public boolean checkConnect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + table + "?",
                    "" + user + "","" + password + "");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://deker.org/Portal?","Portal","18757");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM User");

            if (stmt.execute("SELECT * FROM User WHERE UserName = 'Deker'")) {
                rs = stmt.getResultSet();
            }

            while (rs.next()) {
                String s = rs.getString(2);
                System.out.println(s);
            }

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
