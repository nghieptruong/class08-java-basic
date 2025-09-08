public class HREmployee extends Employee {

    private String deptNo;

    public HREmployee() {
        deptNo = "100";
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
}
