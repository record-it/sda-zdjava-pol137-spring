package pl.sda.zdjavapol137.firstspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.zdjavapol137.firstspringapp.console.Header;
import pl.sda.zdjavapol137.firstspringapp.console.Menu;
import pl.sda.zdjavapol137.firstspringapp.controller.ScannerController;

@SpringBootApplication
public class FirstSpringAppApplication implements CommandLineRunner {

    //zależność klasy wstrzykiwana przez konstruktor
    private final ScannerController controller;
    // zależność klasy wstrzykiwana przez pole

    @Autowired          // konieczne!!!
    private Header header;
    //wstrzykiwanie zależności przez konstruktor -zalecane!!!
    @Autowired          // zbędne, działa też bez adnotacji
    public FirstSpringAppApplication(ScannerController controller) {
        this.controller = controller;
    }

    public static void main(String[] args) {

        SpringApplication.run(FirstSpringAppApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        controller.mainLoopRun();
    }
}
