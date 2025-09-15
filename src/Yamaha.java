public class Yamaha extends Machine implements Vehicle {

    @Override
    public void printBrand() {
        System.out.println("Yamaha brand");
    }

    @Override
    public void run() {
        System.out.println("Yamaha run");
    }

    @Override
    public void producedBy() {
        System.out.println("Yamaha made by China");
    }
}
