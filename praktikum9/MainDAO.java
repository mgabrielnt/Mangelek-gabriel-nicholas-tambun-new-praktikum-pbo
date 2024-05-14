public class MainDAO {
    public static void main(String args[]){
        DAOPerson m = new DAOPerson("Indra");
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(m);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
