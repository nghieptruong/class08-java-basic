public interface Vehicle {

    void printBrand(); // mac dinh abstract method va public
    void run(); // mac dinh abstract method va public

    //default method (từ java 8)
    default void producedBy() {
        System.out.println("Made by China");
    }
    //static method (từ java 8)
    static void printType() {
        System.out.println("Motorbike Type");
    }
}
