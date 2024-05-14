import java.io.*;

public class SerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            
            System.out.println("Deserialized person name = " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
