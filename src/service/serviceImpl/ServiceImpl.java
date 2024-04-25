package service.serviceImpl;

import service.LaptopService;
import model.Laptop;

import java.util.Scanner;

public class ServiceImpl implements LaptopService {

    @Override
    public void input(Laptop lt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin cho laptop:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        lt.setId(id);
        scanner.nextLine();

        System.out.print("CPU: ");
        String cpu = scanner.nextLine();
        lt.setCpu(cpu);

        System.out.print("RAM: ");
        String ram = scanner.nextLine();
        lt.setRam(Integer.parseInt(ram));

        System.out.print("VGA: ");
        String vga = scanner.nextLine();
        lt.setVga(vga);
    }

    @Override
    public void info(Laptop lt) {
        System.out.println("Thông tin cho laptop:");
        System.out.println("ID: " + lt.getId());
        System.out.println("CPU: " + lt.getCpu());
        System.out.println("RAM: " + lt.getRam());
        System.out.println("VGA: " + lt.getVga());
    }
}
