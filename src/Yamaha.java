public class Yamaha extends Machine implements Vehicle {

    @Override
    public void printBrand() {
        System.out.println("Yamaha brand");
    }

    @Override
    public void run() {
        System.out.println("Yamaha run");
    }
}
