import java.util.Scanner;
import java.util.Vector ;

//  Employeeclass
class
 Employee{
    String name;
    int yearOfJoining;
    int salary;
    String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    public void display(){
        System.out.println(this.name + "        "+this.yearOfJoining+"        "+this.address);
    }

}

public class secondquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> employee = new Vector<>(3);
        // taking input for 3 employees
        for(int i = 0;i<3;i++){
            System.out.println("Enter the details of the employee");
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Year of Joining:");
            int yearOfJoining = sc.nextInt();
            System.out.println("Salary:");
            int salary = sc.nextInt();
            System.out.println("Address:");
            String address = sc.next();
            Employee e = new Employee(name,yearOfJoining,salary,address);
            employee.add(e);
        }
        // printing the details of 3 employees
        System.out.println("Name" + "       " + "Year of Joining" + "       " + "Address");
        for(int i = 0;i<3;i++){
            Employee e = employee.elementAt(i);
            e.display();
        }

    }
}