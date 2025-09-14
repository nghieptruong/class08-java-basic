package secondpackage;

public class Employee {

    //Thuoc tinh (attribute), instance variable
    private String name; //gia tri default null
    private int age; //gia tri default 0
    private String address; // gia tri default null
    private boolean isMarried; // gia tri default false

    //Constructor (hàm khởi tạo)
    public Employee() {
        name = "John";
        age = 30;
        address = "USA";
        isMarried = false;
    }

    public Employee(String name) {
        this.name = name;
    }

    //Constructor có tham số
    public Employee(String name, int age, String address, boolean isMarried) {
        this(name);//constructor chaining -> goi constructor 1 tham so o trên
        this.age = age;
        this.address = address;
        this.isMarried = isMarried;
    }

    //hàm getter
    public String getName(){
        return name;
    }

    //hàm setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    //Method (hành vi/phương thức)
    protected void work() {
        System.out.println("Working...");
    }

    public void printSalary() {
        System.out.println("Printing Salary...");
    }
}
