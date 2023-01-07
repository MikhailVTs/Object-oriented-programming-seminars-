import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        FamilyTree familytree = new FamilyTree();
        People im = new People("Иванов", "Иван", TypeGender.Female, 2016, TypeCommunication.Im);
        People dad = new Communication("Иванов", "Пётр", TypeGender.Female, 1990, TypeCommunication.Dad);
        People mom = new Communication("Иванова", "Лариса", TypeGender.Male, 1990, TypeCommunication.Mom);
        People grandpa = new Communication("Иванов", "Сергей", TypeGender.Female, 1970, TypeCommunication.Grandpa);
        People grandma = new Communication("Иванова", "Раиса", TypeGender.Female, 1970, TypeCommunication.Grandmother);
        
        //Сериализация в файл с помощью класса ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("people.out"));
        objectOutputStream.writeObject(dad);
        objectOutputStream.writeObject(mom);
        objectOutputStream.close();

        // Востановление из файла с помощью класса ObjectInputStream
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("people.out"));
        People dadRestored = (People) objectInputStream.readObject();
        People momRestored = (People) objectInputStream.readObject();
        objectInputStream.close();

        //Сериализация с помощью класса ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream2.writeObject(dad);
        objectOutputStream2.writeObject(mom);
        objectOutputStream2.flush();

        //Восстановление с помощью класса ByteArrayInputStream
        ObjectInputStream objectInputStream2 = new ObjectInputStream(
                new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        People dadRestoredFromByte = (People) objectInputStream2.readObject();
        People momRestoredFromByte = (People) objectInputStream2.readObject();
        objectInputStream2.close();

        System.out.println("Before Serialize: " + "\n" + dad + "\n" + mom);
        System.out.println("After Restored From Byte: " + "\n" + dadRestoredFromByte + "\n" + momRestoredFromByte);
        System.out.println("After Restored: " + "\n" + dadRestored + "\n" + momRestored);

    



        familytree.addPeople(im);
        familytree.addPeople(dad);
        familytree.addPeople(mom);
        familytree.addPeople(grandpa);
        familytree.addPeople(grandma);

        // System.out.println(familytree.getPeopleLastName("Иванов"));

    }
}