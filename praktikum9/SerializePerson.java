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
        Person person = new Person("Juan");
        try{
            FileOutputStream fileOut =
                new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
            out.close();
            fileOut.close();
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
