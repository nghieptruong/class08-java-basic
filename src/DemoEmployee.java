import java.util.ArrayList;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work(); // Working
        System.out.println(emp.getName());
        emp.setName("Thomas");
        System.out.println(emp.getName()); // Thomas

        HREmployee hrEmp = new HREmployee();
        hrEmp.work(); // Working... or Working in default deptNo 100...???
//        System.out.println(hrEmp.getDeptNo()); //100

        hrEmp.interview(); // Interviewing...

        //upcasting và downcasting là đa hình trong hướng doi tuong
        Employee other = new HREmployee(); // upcasting
        other.work(); // Working in default deptNo 100...

        HREmployee otherHr = (HREmployee) other; //downcasting
        otherHr.interview();

    }
}
