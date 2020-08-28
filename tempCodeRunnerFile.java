import jave.util.*;

public class PersonTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age : ");
        int age = scanner.nextInt();
        Person person = new Person(firstName,lastName,age);
        System.out.print(person.toString());
    }
}