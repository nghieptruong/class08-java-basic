package firstpackage;

import secondpackage.Employee;

public class HREmployee extends Employee {

    private String deptNo;

    static String companyName = "ABC123";

    public HREmployee() {
        deptNo = "100";
    }

    public HREmployee(String name, int age, String address, boolean isMarried, String deptNo) {
        super(name, age, address, isMarried); //goi construct của cha
        this.deptNo = deptNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    //Overriding:
    //1. hàm cùng tên
    //2. cùng tham số
    //3. phạm vi truy cập >= phạm vi truy cập của cha
    @Override
    public void work() {
        System.out.println("Working in default deptNo 100...");
    }

    public void interview() {
        System.out.println("Interviewing...");
    }

    public void printHRSalary() {
        super.printSalary(); // Printing Salary...
        System.out.println("This is HR Salary ...");
    }
}
