package exam200224;

import java.sql.SQLException;

public class q28 {
    public static void main(String[] args) {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = new SQLException();
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            getData();
        } catch (SQLException e) {
            System.out.println("SQL");
        }
    }
}
