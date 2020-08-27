import java.util.*;

public class CompanyTest {

    public static void main(String[] args) {
        
        // part a
        Company company = new Company("UMS");

        // part b
        Employee employee = new Employee("John",5,2500,'M',new Spouse("Kate",37));
        company.addEmployee(employee);

        // part c
        System.out.println("Total salary(before) : $" + company.getAllEmployeesSalary());

        // part d
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter gender: ");
        char gender = scanner.next().charAt(0);
        System.out.println();
        Employee employee2 = new Employee(name,id,salary,gender);
        company.addEmployee(employee2);

        // part e
        System.out.println("Total salary(after) : $" + company.getAllEmployeesSalary());

        // part f
        Employee temp = company.getEmployee(4);
        if (temp.getSpouse() == null){
            System.out.println("Name: " + temp.getName() + ", Salary: $" + temp.getSalary() + ",Status: Single");
        }
        else{
            System.out.println("Name: " + temp.getName() + ", Salary: $" + temp.getSalary() + ", Status: Married");
        }

        // part g
        Employee temp2 = company.getEmployee(5);
        if (temp2.getSpouse() == null){
            System.out.println("Name: " + temp2.getName() + ", Salary: $" + temp2.getSalary() + ",Status: Single");
        }
        else{
            System.out.println("Name: " + temp2.getName() + ", Salary: $" + temp2.getSalary() + ", Status: Married");
            System.out.println("Spouse's name: " + temp2.getSpouse().getName());
        }
        
        // checkEmployee(company, 5); checking for part h
    }

    // part h
    public static void checkEmployee(Company comp, int id){
        // some code here
        Employee temp3 = comp.getEmployee(id);
        if (temp3.getSpouse() == null){
            System.out.println("Name: " + temp3.getName() + ", Salary: $" + temp3.getSalary() + ",Status: Single");
        }
        else{
            System.out.println("Name: " + temp3.getName() + ", Salary: $" + temp3.getSalary() + ", Status: Married");
            System.out.println("Spouse's name: " + temp3.getSpouse().getName());
        }
    }
}
