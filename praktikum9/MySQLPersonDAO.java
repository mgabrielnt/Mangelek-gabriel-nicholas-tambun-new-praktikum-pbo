import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/PERSON", "root", "");

        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Close the database connection
        con.close();
    }
}
