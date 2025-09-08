public class DemoVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Yamaha();
        vehicle.printBrand(); // Yamaha brand
        vehicle.run(); // Yamaha run

        vehicle.producedBy(); // Made by China

        Vehicle.printType(); // Motorbike Type
    }
}
