/**
 *
 * @author gabriel
 */
public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("budi");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }       
    }
}
