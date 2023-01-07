/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        FamilyTree familytree = new FamilyTree();
        People im = new People("Иванов", "Иван", TypeGender.Female, 2016, TypeCommunication.Im);
        People dad = new Communication("Иванов", "Пётр", TypeGender.Female, 1990, TypeCommunication.Dad);
        People mom = new Communication("Иванова", "Лариса", TypeGender.Male, 1990, TypeCommunication.Mom);
        People grandpa = new Communication("Иванов", "Сергей", TypeGender.Female, 1970, TypeCommunication.Grandpa);
        People grandma = new Communication("Иванова", "Раиса", TypeGender.Female, 1970, TypeCommunication.Grandmother);
        
        familytree.addPeople(im);
        familytree.addPeople(dad);
        familytree.addPeople(mom);
        familytree.addPeople(grandpa);
        familytree.addPeople(grandma);

        System.out.println(familytree.getPeopleLastName("Иванов"));

    }
}