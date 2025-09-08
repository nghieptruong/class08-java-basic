public class Employee {

    //Thuoc tinh (attribute), instance variable
    private String name; //gia tri default null
    private int age; //gia tri default 0
    private String address; // gia tri default null
    private boolean isMarried; // gia tri default false

    //Constructor (hàm khởi tạo)
    Employee() {
        name = "John";
        age = 30;
        address = "USA";
        isMarried = false;
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
    public void work() {
        System.out.println("Working...");
    }
}
