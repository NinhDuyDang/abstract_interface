
import service.LaptopService;
import service.serviceImpl.ServiceImpl;
import model.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        LaptopService laptopService = new ServiceImpl();
        laptopService.input(laptop);
        laptopService.info(laptop);
    }
}
