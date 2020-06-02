package home.DataDase;

import java.sql.*;

public class TestPostgres {

    public static void main(String... arg) throws SQLException, ClassNotFoundException {
        //System.out.println(System.getProperty("java.class.path"));
        //System.setProperties("java.class.path"="java.class.path");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }
        System.out.println("PostgreSQL JDBC Driver successfully connected");

        //Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qc",
               "saa","saa");

        Statement statement;
        String sql;

        try {
            statement = connection.createStatement();
            sql = "select airport_code, airport_name from bookings.airports LIMIT 5";
            ResultSet res =  statement.executeQuery(sql);

            while (res.next()) {
                System.out.print(res.getString("airport_code"));
                System.out.println("  "+res.getString("airport_name"));
            }
            statement.close();
        }
        finally {
//            if (!statement.isClosed())  {
//                statement.close();
//            }
        }




    }


}
