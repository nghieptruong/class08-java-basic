import secondpackage.Employee;
import firstpackage.HREmployee;

public class DemoConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25, "USA", false);
        System.out.println(emp.getName()); //Alice
        System.out.println(emp.getAge()); // 25
        System.out.println(emp.getAddress()); // USA

        System.out.println("------------------");
        Employee emp2 = new Employee("Marry");
        System.out.println(emp2.getName()); // Marry
        System.out.println(emp2.getAge()); // 0
        System.out.println(emp2.getAddress()); // null

        System.out.println("------------------");
        HREmployee hrEmployee = new HREmployee("Tom", 35, "CA", true, "IT-102");
        System.out.println(hrEmployee.getName()); //Tom
        System.out.println(hrEmployee.getAge()); // 35
        System.out.println(hrEmployee.getAddress()); // CA
        System.out.println(hrEmployee.getDeptNo()); // IT-102
        hrEmployee.printHRSalary();

        System.out.println("-----------");
        HREmployee hrEmployee2 = new HREmployee();
//        hrEmployee2.companyName = "Unknown";

        System.out.println("-------------");
//        System.out.println(HREmployee.companyName); // ABC123 --> Unknown
//        System.out.println(hrEmployee.companyName); // --> Unknown

        final String projectName = "Project1";
//        projectName = "Project2"; // ko dc sua gia tri


    }
}
