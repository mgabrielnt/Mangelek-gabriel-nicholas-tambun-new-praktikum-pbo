import java.io.*;

class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson{
    public static void main(String[] args) {
        Person person = new Person("Gabriel");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis object person");
            s.close();
            f.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}