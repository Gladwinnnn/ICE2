import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Person person = new Person(firstName,lastName,age);
        System.out.println(person.toString());

        System.out.print("Enter first name : ");
        String firstName2 = scanner.nextLine();
        System.out.print("Enter last name : ");
        String lastName2 = scanner.nextLine();
        Person person2 = new Person(firstName2,lastName2);
        System.out.println(person2.toString());

        System.out.print("Enter age of second person : ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        person2.setAge(age2);

        System.out.println("After setting age of otherPerson");
        System.out.print(person2.toString());
    }
}